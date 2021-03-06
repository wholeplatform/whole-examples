package org.whole.crossexamples.lwc16.mjmath.visitors;

import org.whole.crossexamples.lwc16.mjmath.visitors.MJMathIdentityUnaryVisitor;
import org.whole.crossexamples.lwc16.mjmath.visitors.IMJMathVisitor;
import org.whole.crossexamples.lwc16.mjmath.model.*;
import org.whole.lang.visitors.IVisitor;

/** 
 * @generator Whole
 */
public class MJMathTraverseAllChildrenVisitor extends MJMathIdentityUnaryVisitor<IMJMathVisitor> {
	public MJMathTraverseAllChildrenVisitor() {
		wSetVisitor1(this);
	}

	public MJMathTraverseAllChildrenVisitor(IVisitor visitor1) {
		super(visitor1);
	}

	public void visit(Summation entity) {
		entity.getIndex().accept(wGetVisitor1());
		entity.getLowerBound().accept(wGetVisitor1());
		entity.getUpperBound().accept(wGetVisitor1());
		entity.getExpression().accept(wGetVisitor1());
	}
}
