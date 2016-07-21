package org.whole.crossexamples.lwc16.mjmath.visitors;

import org.whole.crossexamples.lwc16.mjmath.model.*;

/** 
 * @generator Whole
 */
public class MJMathIdentityDefaultVisitor extends MJMathIdentityVisitor {
	public void visit(IMJMathEntity entity) {
	}

	public void visit(Expression entity) {
	}

	public void visit(Summation entity) {
		visit((IMJMathEntity) entity);
		visit((Expression) entity);
	}
}
