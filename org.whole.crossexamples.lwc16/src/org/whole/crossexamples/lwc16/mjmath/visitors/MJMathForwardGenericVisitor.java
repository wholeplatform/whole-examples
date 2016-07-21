package org.whole.crossexamples.lwc16.mjmath.visitors;

import org.whole.lang.visitors.AbstractUnaryVisitor;
import org.whole.lang.visitors.IVisitor;
import org.whole.crossexamples.lwc16.mjmath.model.*;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class MJMathForwardGenericVisitor extends AbstractUnaryVisitor<IVisitor> implements IMJMathVisitor {
	public MJMathForwardGenericVisitor(IVisitor visitor1) {
		super(visitor1);
	}

	public void visit(IEntity entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(Summation entity) {
		wGetVisitor1().visit(entity);
	}
}
