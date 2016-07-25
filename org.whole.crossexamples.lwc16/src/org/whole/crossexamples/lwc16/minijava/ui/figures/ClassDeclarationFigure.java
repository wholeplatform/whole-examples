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
package org.whole.crossexamples.lwc16.minijava.ui.figures;

import org.eclipse.draw2d.MarginBorder;
import org.whole.lang.ui.figures.ContentPaneFigure;
import org.whole.lang.ui.figures.EntityFigure;
import org.whole.lang.ui.figures.IEntityFigure;
import org.whole.lang.ui.layout.ColumnLayout;
import org.whole.lang.ui.layout.RowLayout;

/**
 *  @generator Whole
 */
public class ClassDeclarationFigure extends ContentPaneFigure {
	private IEntityFigure extendsFigure;

	public ClassDeclarationFigure() {
		super(new ColumnLayout());
		initContentPanes(4);

		EntityFigure row;
		add(row = new EntityFigure(new RowLayout()));
		row.addKeyword("class ");
		row.add(createContentPane(0));
		row.addKeyword(" ");
		extendsFigure = row.addKeyword("extends ");
		row.add(createContentPane(1));
		row.addContentLight(" {");

		add(createContentPane(2, new MarginBorder(0,16,0,0)));
		add(createContentPane(3, new MarginBorder(0,16,0,0)));

		addContentLight("}");
	}

	public void hideExtends(boolean value) {
		extendsFigure.setVisible(!value);
	}
}
