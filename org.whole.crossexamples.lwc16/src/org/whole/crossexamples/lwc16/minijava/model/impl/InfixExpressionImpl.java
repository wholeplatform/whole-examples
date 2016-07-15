package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.minijava.model.InfixExpression;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.minijava.model.Expression;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.model.InfixOperator;

/** 
 * @generator Whole
 */
public class InfixExpressionImpl extends AbstractSimpleEntity implements InfixExpression {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<InfixExpression> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.InfixExpression;
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.InfixExpression_ord;
	}

	public void accept(IMiniJavaVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Expression leftOperand;

	public Expression getLeftOperand() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.leftOperand, leftOperand);
	}

	public void setLeftOperand(Expression leftOperand) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.leftOperand, this.leftOperand, this.leftOperand = leftOperand);
	}

	private InfixOperator operator;

	public InfixOperator getOperator() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.operator, operator);
	}

	public void setOperator(InfixOperator operator) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.operator, this.operator, this.operator = operator);
	}

	private Expression rightOperand;

	public Expression getRightOperand() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.rightOperand, rightOperand);
	}

	public void setRightOperand(Expression rightOperand) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.rightOperand, this.rightOperand, this.rightOperand = rightOperand);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getLeftOperand().wGetAdaptee(false);
		case 1:
			return getOperator().wGetAdaptee(false);
		case 2:
			return getRightOperand().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setLeftOperand(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Expression));
			break;
		case 1:
			setOperator(value.wGetAdapter(MiniJavaEntityDescriptorEnum.InfixOperator));
			break;
		case 2:
			setRightOperand(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Expression));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 3;
	}
}
