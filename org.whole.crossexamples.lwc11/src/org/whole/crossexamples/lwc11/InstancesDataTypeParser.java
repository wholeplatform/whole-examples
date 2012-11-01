/**
 * Copyright 2004-2010 Riccardo Solmi. All rights reserved.
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
package org.whole.crossexamples.lwc11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.whole.lang.grammars.parsers.GrammarBasedDataTypeParser;
import org.whole.lang.grammars.parsers.GrammarsDefaultDataTypeParser;
import org.whole.lang.parsers.DataTypeParsers;
import org.whole.lang.reflect.DynamicLanguageKit;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.reflect.ReflectionFactory;
import org.whole.lang.util.WholeMessages;

/**
 * @author Enrico Persiani
 */
public class InstancesDataTypeParser extends GrammarsDefaultDataTypeParser {
	private static DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");

	private InstancesDataTypeParser(GrammarBasedDataTypeParser dataTypeParser) {
		super(dataTypeParser);
		formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
	}

	@Override
	public Date parseDate(EntityDescriptor<?> ed, String value) {
		synchronized (formatter) {
			try {
				return formatter.parse(value);
			} catch (ParseException e) {
				throw new IllegalArgumentException(WholeMessages.no_data_type);
			}
		}
	}

	@Override
	public String unparseDate(EntityDescriptor<?> ed, Date value) {
		synchronized (formatter) {
			return formatter.format(value);
		}
	}

	public static void install(final String languageURI) {
		// get deployed language kit
		DynamicLanguageKit languageKit = (DynamicLanguageKit) ReflectionFactory.getLanguageKit(languageURI, false, null);

		// install a customized data-type persistence parser
		GrammarBasedDataTypeParser parser = (GrammarBasedDataTypeParser) languageKit.getDataTypeParser(DataTypeParsers.PERSISTENCE);
		parser.setStrategy(new InstancesDataTypeParser(parser));
		languageKit.setDataTypeParser(DataTypeParsers.PERSISTENCE, parser);

		// install a customized data-type presentation parser
		parser = (GrammarBasedDataTypeParser) languageKit.getDataTypeParser(DataTypeParsers.PRESENTATION);
		parser.setStrategy(new InstancesDataTypeParser(parser));
		languageKit.setDataTypeParser(DataTypeParsers.PRESENTATION, parser);
	}
}
