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
package org.whole.crossexamples.lwc16.minijava.ui;

import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaLanguageKit;
import org.whole.crossexamples.lwc16.minijava.ui.editparts.MiniJavaTextualPartFactoryVisitor;
import org.whole.lang.reflect.ILanguageKit;
import org.whole.lang.ui.editor.AbstractEditorKit;
import org.whole.lang.ui.editparts.IEditPartFactory;

/**
 * @author Enrico Persiani
 */
public class MiniJavaTextualEditorKit extends AbstractEditorKit {
	private static final long serialVersionUID = 1;

	public static final String ID = MiniJavaTextualEditorKit.class.getName();

	public String getId() {
		return ID;
	}

	public String getName() {
		return "MiniJava textual";
	}

    public int getDefaultLevel() {
    	return 10;
    }

	public IEditPartFactory getPartFactory() {
		return new MiniJavaTextualPartFactoryVisitor();
	}

	public boolean canApply(ILanguageKit languageKit) {
		return languageKit.getURI().equals(MiniJavaLanguageKit.URI) && !languageKit.isDynamic();
	}
}
