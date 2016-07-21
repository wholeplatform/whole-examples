package org.whole.crossexamples.lwc16.mjmath.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.crossexamples.lwc16.mjmath.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.mjmath.visitors.IMJMathVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.mjmath.reflect.MJMathEntityDescriptorEnum;

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

	public void accept(IMJMathVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Identifier> wGetEntityDescriptor() {
		return MJMathEntityDescriptorEnum.Identifier;
	}
}
