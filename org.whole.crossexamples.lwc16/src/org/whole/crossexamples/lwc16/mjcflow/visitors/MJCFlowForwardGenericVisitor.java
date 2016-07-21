package org.whole.crossexamples.lwc16.mjcflow.visitors;

import org.whole.lang.visitors.AbstractUnaryVisitor;
import org.whole.lang.visitors.IVisitor;
import org.whole.crossexamples.lwc16.mjcflow.model.*;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class MJCFlowForwardGenericVisitor extends AbstractUnaryVisitor<IVisitor> implements IMJCFlowVisitor {
	public MJCFlowForwardGenericVisitor(IVisitor visitor1) {
		super(visitor1);
	}

	public void visit(IEntity entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(UnlessStatement entity) {
		wGetVisitor1().visit(entity);
	}
}
