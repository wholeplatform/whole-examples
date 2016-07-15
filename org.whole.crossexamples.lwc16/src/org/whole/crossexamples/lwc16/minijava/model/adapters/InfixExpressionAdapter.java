package org.whole.crossexamples.lwc16.minijava.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaFeatureDescriptorEnum;

/** 
 * @generator Whole
 */
public class InfixExpressionAdapter extends AbstractEntityAdapter implements InfixExpression {
	private static final long serialVersionUID = 1;

	public InfixExpressionAdapter(IEntity implementor) {
		super(implementor);
	}

	public InfixExpressionAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<InfixExpression> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.InfixExpression;
	}

	public Expression getLeftOperand() {
		return wGet(MiniJavaFeatureDescriptorEnum.leftOperand).wGetAdapter(MiniJavaEntityDescriptorEnum.Expression);
	}

	public void setLeftOperand(Expression leftOperand) {
		wSet(MiniJavaFeatureDescriptorEnum.leftOperand, leftOperand);
	}

	public InfixOperator getOperator() {
		return wGet(MiniJavaFeatureDescriptorEnum.operator).wGetAdapter(MiniJavaEntityDescriptorEnum.InfixOperator);
	}

	public void setOperator(InfixOperator operator) {
		wSet(MiniJavaFeatureDescriptorEnum.operator, operator);
	}

	public Expression getRightOperand() {
		return wGet(MiniJavaFeatureDescriptorEnum.rightOperand).wGetAdapter(MiniJavaEntityDescriptorEnum.Expression);
	}

	public void setRightOperand(Expression rightOperand) {
		wSet(MiniJavaFeatureDescriptorEnum.rightOperand, rightOperand);
	}
}
