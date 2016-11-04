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
package org.whole.crossexamples.lwc16;

import org.whole.crossexamples.lwc16.metadata.reflect.MetadataLanguageDeployer;
import org.whole.crossexamples.lwc16.metadata.ui.MetadataUIDeployer;
import org.whole.crossexamples.lwc16.minijava.events.MiniJavaReactionsHandler;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaLanguageDeployer;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaLanguageKit;
import org.whole.crossexamples.lwc16.minijava.ui.MiniJavaUIDeployer;
import org.whole.crossexamples.lwc16.mjcflow.reflect.MJCFlowLanguageDeployer;
import org.whole.crossexamples.lwc16.mjcflow.ui.MJCFlowUIDeployer;
import org.whole.crossexamples.lwc16.mjmath.reflect.MJMathLanguageDeployer;
import org.whole.crossexamples.lwc16.mjmath.ui.MJMathUIDeployer;
import org.whole.lang.reflect.AbstractSuiteDeployer;
import org.whole.lang.reflect.IDeployer;

/**
 * @author Enrico Persiani
 */
public class LWC16Deployer  extends AbstractSuiteDeployer {
	public int getDeployLevel() {
		return IDeployer.LEVEL_LANGUAGE_EXTENSION;
	}

	@SuppressWarnings("unchecked")
	public LWC16Deployer() {
		super(
			MiniJavaLanguageDeployer.class,
			MiniJavaUIDeployer.class,
			MetadataLanguageDeployer.class,
			MetadataUIDeployer.class,
			MJCFlowLanguageDeployer.class,
			MJCFlowUIDeployer.class,
			MJMathLanguageDeployer.class,
			MJMathUIDeployer.class
		);
	}

	public void deploy(org.whole.lang.reflect.ReflectionFactory platform) {
		super.deploy(platform);

		platform.addReactionsHandler(MiniJavaLanguageKit.URI, new MiniJavaReactionsHandler());
	};
}
