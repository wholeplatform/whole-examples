package org.whole.crossexamples.lwc16.mjcflow.visitors;

import org.whole.lang.visitors.GenericForwardStrategyVisitor;
import org.whole.crossexamples.lwc16.mjcflow.model.*;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class MJCFlowForwardStrategyVisitor extends GenericForwardStrategyVisitor<IMJCFlowVisitor>
		implements IMJCFlowVisitor {
	public MJCFlowForwardStrategyVisitor() {
		this(new MJCFlowIdentityVisitor());
	}

	public MJCFlowForwardStrategyVisitor(IMJCFlowVisitor... initialStrategies) {
		super(initialStrategies);
	}

	public void visit(IEntity entity) {
		((IMJCFlowEntity) entity).accept(this);
	}

	public void visit(UnlessStatement entity) {
		wGetStrategy().visit(entity);
	}
}
