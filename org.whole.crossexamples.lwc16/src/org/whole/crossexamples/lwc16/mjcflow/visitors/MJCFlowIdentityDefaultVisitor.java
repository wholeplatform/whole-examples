package org.whole.crossexamples.lwc16.mjcflow.visitors;

import org.whole.crossexamples.lwc16.mjcflow.model.*;

/** 
 * @generator Whole
 */
public class MJCFlowIdentityDefaultVisitor extends MJCFlowIdentityVisitor {
	public void visit(IMJCFlowEntity entity) {
	}

	public void visit(Statement entity) {
	}

	public void visit(UnlessStatement entity) {
		visit((IMJCFlowEntity) entity);
		visit((Statement) entity);
	}
}
