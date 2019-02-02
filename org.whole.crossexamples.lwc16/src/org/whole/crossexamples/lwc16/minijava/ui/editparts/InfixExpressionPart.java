/**
 * Copyright 2004-2019 Riccardo Solmi. All rights reserved.
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
package org.whole.crossexamples.lwc16.minijava.ui.editparts;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.whole.crossexamples.lwc16.minijava.model.InfixExpression;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaFeatureDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.ui.figures.InfixExpressionFigure;
import org.whole.lang.model.IEntity;
import org.whole.lang.ui.editparts.AbstractContentPanePart;

/**
 * @author Enrico Persiani
 */
public class InfixExpressionPart extends AbstractContentPanePart {
	protected IFigure createFigure() {
		return new InfixExpressionFigure();
	}

	@Override
	protected void propertyChangeUI(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(MiniJavaFeatureDescriptorEnum.operator.getName()))
			getParent().refresh();
		refresh();
	}
//	protected void refreshVisuals() {FIXME
//		InfixExpression entity = getModelEntity();
//		
//		InfixExpressionFigure fig = (InfixExpressionFigure) getFigure();
//		fig.showLeftParentheses(OperatorGroupEnum.hasPrecedence(entity, entity.getLeftOperand()));
//		fig.showRightParentheses(OperatorGroupEnum.hasPrecedence(entity, entity.getRightOperand()));
//	}

	protected List<IEntity> getModelSpecificChildren() {
		InfixExpression infixExpression = getModelEntity();

		List<IEntity> list = new ArrayList<IEntity>(4);
		list.add(infixExpression.getLeftOperand());
		list.add(infixExpression.getOperator());
		list.add(infixExpression.getRightOperand());
		return list;
	}
}