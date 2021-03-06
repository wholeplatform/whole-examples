package org.whole.examples.datatypes.redblacktree.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.examples.datatypes.redblacktree.model.*;
import org.whole.examples.datatypes.redblacktree.visitors.IRedBlackTreeVisitor;
import org.whole.examples.datatypes.redblacktree.reflect.RedBlackTreeEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class ValueImpl extends AbstractDataEntity implements Value {
	private static final long serialVersionUID = 1;
	private int value;

	public int getValue() {
		return notifyRequested(value);
	}

	public void setValue(int value) {
		notifyChanged(this.value, this.value = value);
	}

	public void accept(IRedBlackTreeVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return RedBlackTreeEntityDescriptorEnum.Value_ord;
	}

	public EntityDescriptor<Value> wGetEntityDescriptor() {
		return RedBlackTreeEntityDescriptorEnum.Value;
	}

	public Object wGetValue() {
		return new Integer(getValue());
	}

	public void wSetValue(Object value) {
		setValue(((Integer) value).intValue());
	}

	public String wStringValue() {
		return toString();
	}

	public void wSetValue(String value) {
		try {
			setValue(Integer.valueOf(value).intValue());
		} catch (NumberFormatException e) {
		}
	}

	public int wIntValue() {
		return getValue();
	}

	public void wSetValue(int value) {
		setValue(value);
	}
}
