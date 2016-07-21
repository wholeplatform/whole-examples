package org.whole.crossexamples.lwc16.mjcflow.visitors;

import org.whole.crossexamples.lwc16.mjcflow.visitors.MJCFlowIdentityUnaryVisitor;
import org.whole.lang.visitors.IVisitor;
import org.whole.crossexamples.lwc16.mjcflow.model.*;

/** 
 * @generator Whole
 */
public class MJCFlowTraverseAllSwitchVisitor extends MJCFlowIdentityUnaryVisitor<IVisitor> {
	public MJCFlowTraverseAllSwitchVisitor(IVisitor visitor1) {
		super(visitor1);
	}

	public void visit(UnlessStatement entity) {
		wGetVisitor1().visit(entity.getExpression());
		wGetVisitor1().visit(entity.getStatement());
	}
}
