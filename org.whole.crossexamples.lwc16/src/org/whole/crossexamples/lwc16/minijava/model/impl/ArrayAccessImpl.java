package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.minijava.model.ArrayAccess;
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
public class ArrayAccessImpl extends AbstractSimpleEntity implements ArrayAccess {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<ArrayAccess> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.ArrayAccess;
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.ArrayAccess_ord;
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

	private Expression index;

	public Expression getIndex() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.index, index);
	}

	public void setIndex(Expression index) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.index, this.index, this.index = index);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getArray().wGetAdaptee(false);
		case 1:
			return getIndex().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setArray(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Expression));
			break;
		case 1:
			setIndex(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Expression));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 2;
	}
}
