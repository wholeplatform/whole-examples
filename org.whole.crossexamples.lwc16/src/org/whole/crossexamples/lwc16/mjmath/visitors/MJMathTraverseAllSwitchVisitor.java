package org.whole.crossexamples.lwc16.mjmath.visitors;

import org.whole.crossexamples.lwc16.mjmath.visitors.MJMathIdentityUnaryVisitor;
import org.whole.lang.visitors.IVisitor;
import org.whole.crossexamples.lwc16.mjmath.model.*;

/** 
 * @generator Whole
 */
public class MJMathTraverseAllSwitchVisitor extends MJMathIdentityUnaryVisitor<IVisitor> {
	public MJMathTraverseAllSwitchVisitor(IVisitor visitor1) {
		super(visitor1);
	}

	public void visit(Summation entity) {
		wGetVisitor1().visit(entity.getIndex());
		wGetVisitor1().visit(entity.getLowerBound());
		wGetVisitor1().visit(entity.getUpperBound());
		wGetVisitor1().visit(entity.getExpression());
	}
}
