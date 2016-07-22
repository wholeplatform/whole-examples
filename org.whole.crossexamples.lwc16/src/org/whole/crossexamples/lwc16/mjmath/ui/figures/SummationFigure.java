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
package org.whole.crossexamples.lwc16.mjmath.ui.figures;

import org.whole.lang.ui.figures.ContentPaneFigure;
import org.whole.lang.ui.figures.EntityFigure;
import org.whole.lang.ui.figures.LabelFactory;
import org.whole.lang.ui.layout.Alignment;
import org.whole.lang.ui.layout.ColumnLayout;
import org.whole.lang.ui.layout.RowLayout;

/**
 * @generator Whole
 */
public class SummationFigure extends ContentPaneFigure {
	public SummationFigure() {
		super(new RowLayout().withMinorAlignment(Alignment.CENTER).withSpacing(4));
		initContentPanes(4);

		EntityFigure column = new EntityFigure(new ColumnLayout().withMinorAlignment(Alignment.CENTER));

		column.add(createContentPane(0));
		column.add(LabelFactory.createContentLargeMath("\u2211"));

		EntityFigure row = new EntityFigure(new RowLayout().withSpacing(4));
		row.add(createContentPane(1));
		row.addContentLight("=");
		row.add(createContentPane(2));

		column.add(row);
		add(column);

		add(createContentPane(3));
	}
}
