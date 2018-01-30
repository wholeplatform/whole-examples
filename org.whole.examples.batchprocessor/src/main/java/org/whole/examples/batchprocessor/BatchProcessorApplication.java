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

import static org.apache.commons.io.filefilter.FileFilterUtils.and;
import static org.apache.commons.io.filefilter.FileFilterUtils.or;
import static org.apache.commons.io.filefilter.FileFilterUtils.suffixFileFilter;
import static org.apache.commons.io.filefilter.FileFilterUtils.trueFileFilter;

import java.io.File;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.whole.lang.bindings.BindingManagerFactory;
import org.whole.lang.bindings.IBindingManager;
import org.whole.lang.codebase.FilePersistenceProvider;
import org.whole.lang.codebase.IPersistenceKit;
import org.whole.lang.codebase.IPersistenceProvider;
import org.whole.lang.java.codebase.JavaBuilderPersistenceKit;
import org.whole.lang.lifecycle.IHistoryManager;
import org.whole.lang.model.IEntity;
import org.whole.lang.reflect.ReflectionFactory;
import org.whole.lang.util.BehaviorUtils;
import org.whole.lang.xml.codebase.XmlBuilderPersistenceKit;

/**
 * @author Enrico Persiani
 */
public class BatchProcessorApplication {
	public static void main(String[] args) throws Exception {
		if (args.length < 2 || args.length > 3) {
			System.err.println("USAGE: whole-batch [-r|--result] <models-dir> <behavior-file> ");
			System.exit(1);
		}

		boolean useResult = false;
		int argsIndex = 0;
		if ("-r".equals(args[argsIndex]) || "--result".equals(args[argsIndex])) {
			argsIndex += 1;
			useResult = true;
		}

		System.exit(run(args[argsIndex], args[argsIndex+1], useResult));
	}

	public static int run(String modelsDirPath, String behaviorFilePath, boolean useResult) {
		File modelsDir = new File(modelsDirPath);
		if (!modelsDir.exists() || !modelsDir.isDirectory()) {
			System.err.println("<models-dir> either doesn't exist or is not a directory");
			return 3;
		}

		ReflectionFactory.deployWholePlatform();
		IEntity behavior = null;
		try {
			File behaviorFile = new File(behaviorFilePath);
			behavior = getPersistenceKit(behaviorFile.getName()).readModel(new FilePersistenceProvider(behaviorFile));
		} catch (Exception e) {
			System.err.println("<behavior-file> either doesn't exist or is not a valid whole model");
			return 2;
		}

		Iterator<File> iterateFiles = FileUtils.iterateFiles(modelsDir, 
				or(suffixFileFilter(".xwl"), and(suffixFileFilter(".java"), JavaBuilderFilter.INSTANCE)),
				trueFileFilter());
		while (iterateFiles.hasNext()) {
			File file = iterateFiles.next();
			String fileName = file.getName();
			if ("NotationsLibrary.xwl".equals(fileName))
				fileName.length();
			if ("CommonsModel.xwl".equals(fileName))
				fileName.length();

			System.out.print("processing '"+fileName+"'... ");
			try {
				IPersistenceKit persistenceKit = getPersistenceKit(fileName);
				IEntity entity = persistenceKit.readModel(new FilePersistenceProvider(file));

				IHistoryManager historyManager = ReflectionFactory.getHistoryManager(entity);
				historyManager.setHistoryEnabled(true);

				IBindingManager arguments = BindingManagerFactory.instance.createArguments();
				arguments.wDef("self", entity);
				IEntity result = BehaviorUtils.evaluate(behavior, 0, arguments);

				if (historyManager.getUndoSize() > 0 || (useResult && result != null)) {
					IPersistenceProvider pp = new FilePersistenceProvider(file);
					pp.getBindings().wDefValue("packageName", JavaBuilderFilter.INSTANCE.getPackageName(file));
					persistenceKit.writeModel(useResult ? result : entity, pp);
					System.out.println("modified.");
				} else
					System.out.println("unchanged.");
			} catch (Exception e) {
				System.out.println("failed.");
			}
		}
		return 0;
	}

	public static IPersistenceKit getPersistenceKit(String fileName) {
		return fileName.endsWith(".xwl") ? 
				XmlBuilderPersistenceKit.instance() : JavaBuilderPersistenceKit.instance();
	}
}
