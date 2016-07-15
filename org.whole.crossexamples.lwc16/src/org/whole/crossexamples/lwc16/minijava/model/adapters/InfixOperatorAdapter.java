package org.whole.crossexamples.lwc16.minijava.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.model.InfixOperatorEnum.Value;

/** 
 * @generator Whole
 */
public class InfixOperatorAdapter extends AbstractEntityAdapter implements InfixOperator {
	private static final long serialVersionUID = 1;

	public InfixOperatorAdapter(IEntity implementor) {
		super(implementor);
	}

	public InfixOperatorAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<InfixOperator> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.InfixOperator;
	}

	public Value getValue() {
		return (Value) wEnumValue();
	}

	public void setValue(Value value) {
		wSetValue(value);
	}
}
