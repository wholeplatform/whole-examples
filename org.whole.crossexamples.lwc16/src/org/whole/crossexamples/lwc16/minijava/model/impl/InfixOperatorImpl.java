package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.crossexamples.lwc16.minijava.model.InfixOperator;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.model.InfixOperatorEnum;
import org.whole.lang.model.EnumValue;

/** 
 * @generator Whole
 */
public class InfixOperatorImpl extends AbstractDataEntity implements InfixOperator {
	private static final long serialVersionUID = 1;
	private org.whole.crossexamples.lwc16.minijava.model.InfixOperatorEnum.Value value;

	public org.whole.crossexamples.lwc16.minijava.model.InfixOperatorEnum.Value getValue() {
		return notifyRequested(value);
	}

	public void setValue(org.whole.crossexamples.lwc16.minijava.model.InfixOperatorEnum.Value value) {
		notifyChanged(this.value, this.value = value);
	}

	public void accept(IMiniJavaVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.InfixOperator_ord;
	}

	public EntityDescriptor<InfixOperator> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.InfixOperator;
	}

	public Object wGetValue() {
		return getValue();
	}

	public void wSetValue(Object value) {
		setValue((org.whole.crossexamples.lwc16.minijava.model.InfixOperatorEnum.Value) value);
	}

	public String wStringValue() {
		return toString();
	}

	public void wSetValue(String value) {
		try {
			setValue(InfixOperatorEnum.instance.valueOf(value));
		} catch (NumberFormatException e) {
		}
	}

	public EnumValue wEnumValue() {
		return value;
	}

	public void wSetValue(EnumValue value) {
		setValue((org.whole.crossexamples.lwc16.minijava.model.InfixOperatorEnum.Value) value);
	}
}
