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
public class StatementAdapter extends AbstractEntityAdapter implements Statement {
	private static final long serialVersionUID = 1;

	public StatementAdapter(IEntity implementor) {
		super(implementor);
	}

	public StatementAdapter() {
	}

	public void accept(IMJCFlowVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Statement> wGetEntityDescriptor() {
		return MJCFlowEntityDescriptorEnum.Statement;
	}
}
