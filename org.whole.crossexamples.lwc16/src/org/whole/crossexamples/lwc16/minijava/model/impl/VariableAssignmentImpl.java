package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.minijava.model.VariableAssignment;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.minijava.model.Identifier;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.model.Expression;

/** 
 * @generator Whole
 */
public class VariableAssignmentImpl extends AbstractSimpleEntity implements VariableAssignment {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<VariableAssignment> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.VariableAssignment;
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.VariableAssignment_ord;
	}

	public void accept(IMiniJavaVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Identifier name;

	public Identifier getName() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.name, name);
	}

	public void setName(Identifier name) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.name, this.name, this.name = name);
	}

	private Expression expression;

	public Expression getExpression() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.expression, expression);
	}

	public void setExpression(Expression expression) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.expression, this.expression, this.expression = expression);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getName().wGetAdaptee(false);
		case 1:
			return getExpression().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setName(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Identifier));
			break;
		case 1:
			setExpression(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Expression));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 2;
	}
}
