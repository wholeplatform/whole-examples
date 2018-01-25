/**
 * Copyright 2004-2016 Riccardo Solmi. All rights reserved.
 * This file is part of the Whole Platform.
 *
 * The Whole Platform is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The Whole Platform is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the Whole Platform. If not, see <http://www.gnu.org/licenses/>.
 */
package org.whole.examples.batchprocessor;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.filefilter.AbstractFileFilter;

/**
 * @author Enrico Persiani
 */
public class JavaBuilderFilter extends AbstractFileFilter {
	private static final String IMPORT_REGEX = "package\\s+([^;]+);";

	public static final JavaBuilderFilter INSTANCE = new JavaBuilderFilter(10);

	protected int maxLines;
	protected JavaBuilderFilter(int maxLines) {
		this.maxLines = maxLines;
	}

	@Override
	public boolean accept(File file) {
		return getInitialLines(file).stream()
				.anyMatch((line) -> line.contains(" extends AbstractTemplateFactory<"));
	}

	public String getPackageName(File file) {
		Pattern importPattern = Pattern.compile(IMPORT_REGEX);
		return getInitialLines(file).stream()
				.flatMap((line) -> {
					Matcher matcher = importPattern.matcher(line);
					return matcher.matches() ? Stream.of(matcher.group(1)) : null;
				}).findAny().orElse(null);
	}

	protected List<String> getInitialLines(File file) {
		List<String> lines = new ArrayList<String>(maxLines);
		try (FileInputStream fis = FileUtils.openInputStream(file)) {
			int count = 0;
			LineIterator iterator = IOUtils.lineIterator(fis, Charset.defaultCharset());
			while (iterator.hasNext() && count++ < maxLines) {
				lines.add(iterator.next());
			}
		} catch (Exception e) {
			// safely ignore
		}
		return lines;
	}
}
