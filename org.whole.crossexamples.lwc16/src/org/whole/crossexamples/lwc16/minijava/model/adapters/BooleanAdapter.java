package org.whole.crossexamples.lwc16.minijava.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.crossexamples.lwc16.minijava.model.Boolean;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class BooleanAdapter extends AbstractEntityAdapter implements Boolean {
	private static final long serialVersionUID = 1;

	public BooleanAdapter(IEntity implementor) {
		super(implementor);
	}

	public BooleanAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Boolean> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.Boolean;
	}
}
