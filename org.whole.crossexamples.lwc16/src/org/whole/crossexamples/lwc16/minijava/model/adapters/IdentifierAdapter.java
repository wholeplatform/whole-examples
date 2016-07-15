package org.whole.crossexamples.lwc16.minijava.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class IdentifierAdapter extends AbstractEntityAdapter implements Identifier {
	private static final long serialVersionUID = 1;

	public IdentifierAdapter(IEntity implementor) {
		super(implementor);
	}

	public IdentifierAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Identifier> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.Identifier;
	}

	public String getValue() {
		return wStringValue();
	}

	public void setValue(String value) {
		wSetValue(value);
	}
}
