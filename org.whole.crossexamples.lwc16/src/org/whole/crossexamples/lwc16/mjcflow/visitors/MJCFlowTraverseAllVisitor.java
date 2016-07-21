package org.whole.crossexamples.lwc16.mjcflow.visitors;

import org.whole.crossexamples.lwc16.mjcflow.visitors.MJCFlowIdentityUnaryVisitor;
import org.whole.crossexamples.lwc16.mjcflow.visitors.IMJCFlowVisitor;
import org.whole.crossexamples.lwc16.mjcflow.model.*;
import org.whole.lang.visitors.IVisitor;

/** 
 * @generator Whole
 */
public class MJCFlowTraverseAllVisitor extends MJCFlowIdentityUnaryVisitor<IMJCFlowVisitor> {
	public MJCFlowTraverseAllVisitor() {
		wSetVisitor1(this);
	}

	public MJCFlowTraverseAllVisitor(IVisitor visitor1) {
		super(visitor1);
	}

	public void visit(UnlessStatement entity) {
		entity.getExpression().accept(wGetVisitor1());
		entity.getStatement().accept(wGetVisitor1());
	}
}
