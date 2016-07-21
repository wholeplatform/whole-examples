package org.whole.crossexamples.lwc16.mjcflow.visitors;

import org.whole.lang.visitors.AbstractVisitor;
import org.whole.crossexamples.lwc16.mjcflow.model.*;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class MJCFlowIdentityVisitor extends AbstractVisitor implements IMJCFlowVisitor {
	public void visit(IEntity entity) {
		((IMJCFlowEntity) entity).accept(this);
	}

	public void visit(UnlessStatement entity) {
	}
}
