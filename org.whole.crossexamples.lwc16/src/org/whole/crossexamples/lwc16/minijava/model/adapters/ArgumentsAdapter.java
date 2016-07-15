package org.whole.crossexamples.lwc16.minijava.model.adapters;

import org.whole.lang.model.adapters.AbstractListEntityAdapter;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class ArgumentsAdapter extends AbstractListEntityAdapter<Expression> implements Arguments {
	private static final long serialVersionUID = 1;

	public ArgumentsAdapter(IEntity implementor) {
		super(implementor);
	}

	public ArgumentsAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Arguments> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.Arguments;
	}
}
