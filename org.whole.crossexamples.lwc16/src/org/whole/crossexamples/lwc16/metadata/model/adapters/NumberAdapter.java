package org.whole.crossexamples.lwc16.metadata.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.crossexamples.lwc16.metadata.model.Number;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.metadata.visitors.IMetadataVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class NumberAdapter extends AbstractEntityAdapter implements Number {
	private static final long serialVersionUID = 1;

	public NumberAdapter(IEntity implementor) {
		super(implementor);
	}

	public NumberAdapter() {
	}

	public void accept(IMetadataVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Number> wGetEntityDescriptor() {
		return MetadataEntityDescriptorEnum.Number;
	}

	public int getValue() {
		return wIntValue();
	}

	public void setValue(int value) {
		wSetValue(value);
	}
}
