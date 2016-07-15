package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.minijava.model.ArrayCreation;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.minijava.model.Expression;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class ArrayCreationImpl extends AbstractSimpleEntity implements ArrayCreation {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<ArrayCreation> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.ArrayCreation;
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.ArrayCreation_ord;
	}

	public void accept(IMiniJavaVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Expression length;

	public Expression getLength() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.length, length);
	}

	public void setLength(Expression length) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.length, this.length, this.length = length);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getLength().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setLength(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Expression));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 1;
	}
}
