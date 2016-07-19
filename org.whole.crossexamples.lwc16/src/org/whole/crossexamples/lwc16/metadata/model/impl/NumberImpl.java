package org.whole.crossexamples.lwc16.metadata.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.crossexamples.lwc16.metadata.model.Number;
import org.whole.crossexamples.lwc16.metadata.visitors.IMetadataVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class NumberImpl extends AbstractDataEntity implements Number {
	private static final long serialVersionUID = 1;
	private int value;

	public int getValue() {
		return notifyRequested(value);
	}

	public void setValue(int value) {
		notifyChanged(this.value, this.value = value);
	}

	public void accept(IMetadataVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return MetadataEntityDescriptorEnum.Number_ord;
	}

	public EntityDescriptor<Number> wGetEntityDescriptor() {
		return MetadataEntityDescriptorEnum.Number;
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
