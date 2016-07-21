package org.whole.crossexamples.lwc16.mjcflow.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.crossexamples.lwc16.mjcflow.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.mjcflow.visitors.IMJCFlowVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.mjcflow.reflect.MJCFlowEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class ExpressionAdapter extends AbstractEntityAdapter implements Expression {
	private static final long serialVersionUID = 1;

	public ExpressionAdapter(IEntity implementor) {
		super(implementor);
	}

	public ExpressionAdapter() {
	}

	public void accept(IMJCFlowVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Expression> wGetEntityDescriptor() {
		return MJCFlowEntityDescriptorEnum.Expression;
	}
}
