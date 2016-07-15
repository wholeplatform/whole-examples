package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.minijava.model.ArrayLength;
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
public class ArrayLengthImpl extends AbstractSimpleEntity implements ArrayLength {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<ArrayLength> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.ArrayLength;
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.ArrayLength_ord;
	}

	public void accept(IMiniJavaVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Expression array;

	public Expression getArray() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.array, array);
	}

	public void setArray(Expression array) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.array, this.array, this.array = array);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getArray().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setArray(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Expression));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 1;
	}
}
