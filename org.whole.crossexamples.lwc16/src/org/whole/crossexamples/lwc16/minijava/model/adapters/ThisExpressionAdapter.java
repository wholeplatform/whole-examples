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
public class ThisExpressionAdapter extends AbstractEntityAdapter implements ThisExpression {
	private static final long serialVersionUID = 1;

	public ThisExpressionAdapter(IEntity implementor) {
		super(implementor);
	}

	public ThisExpressionAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<ThisExpression> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.ThisExpression;
	}
}
