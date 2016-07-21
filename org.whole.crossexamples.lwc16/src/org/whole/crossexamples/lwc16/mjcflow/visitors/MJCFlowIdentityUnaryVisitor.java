package org.whole.crossexamples.lwc16.mjcflow.visitors;

import org.whole.lang.visitors.IVisitor;
import org.whole.lang.visitors.AbstractUnaryVisitor;
import org.whole.crossexamples.lwc16.mjcflow.model.*;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class MJCFlowIdentityUnaryVisitor<V extends IVisitor> extends AbstractUnaryVisitor<V>
		implements IMJCFlowVisitor {
	public MJCFlowIdentityUnaryVisitor() {
		super(null);
	}

	public MJCFlowIdentityUnaryVisitor(IVisitor visitor1) {
		super(visitor1);
	}

	public void visit(IEntity entity) {
		((IMJCFlowEntity) entity).accept(this);
	}

	public void visit(UnlessStatement entity) {
	}
}
