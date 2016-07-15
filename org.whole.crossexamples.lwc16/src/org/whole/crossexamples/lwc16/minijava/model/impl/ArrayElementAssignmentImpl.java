package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.minijava.model.ArrayElementAssignment;
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
public class ArrayElementAssignmentImpl extends AbstractSimpleEntity implements ArrayElementAssignment {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<ArrayElementAssignment> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.ArrayElementAssignment;
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.ArrayElementAssignment_ord;
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

	private Expression index;

	public Expression getIndex() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.index, index);
	}

	public void setIndex(Expression index) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.index, this.index, this.index = index);
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
			return getIndex().wGetAdaptee(false);
		case 2:
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
			setIndex(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Expression));
			break;
		case 2:
			setExpression(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Expression));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 3;
	}
}
