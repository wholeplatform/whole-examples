package org.whole.crossexamples.lwc16.mjcflow.visitors;

import org.whole.lang.visitors.AbstractBinaryVisitor;
import org.whole.crossexamples.lwc16.mjcflow.visitors.IMJCFlowVisitor;
import org.whole.crossexamples.lwc16.mjcflow.model.*;
import org.whole.lang.visitors.IVisitor;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class MJCFlowSequenceVisitor extends AbstractBinaryVisitor<IMJCFlowVisitor> implements IMJCFlowVisitor {
	public MJCFlowSequenceVisitor(IVisitor visitor1, IVisitor visitor2) {
		super(visitor1, visitor2);
	}

	public void visit(IEntity entity) {
		wGetVisitor1().visit(entity);
		wGetVisitor2().visit(entity);
	}

	public void visit(UnlessStatement entity) {
		wGetVisitor1().visit(entity);
		wGetVisitor2().visit(entity);
	}
}
