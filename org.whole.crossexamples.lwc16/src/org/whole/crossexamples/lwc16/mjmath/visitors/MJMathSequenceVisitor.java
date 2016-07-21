package org.whole.crossexamples.lwc16.mjmath.visitors;

import org.whole.lang.visitors.AbstractBinaryVisitor;
import org.whole.crossexamples.lwc16.mjmath.visitors.IMJMathVisitor;
import org.whole.crossexamples.lwc16.mjmath.model.*;
import org.whole.lang.visitors.IVisitor;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class MJMathSequenceVisitor extends AbstractBinaryVisitor<IMJMathVisitor> implements IMJMathVisitor {
	public MJMathSequenceVisitor(IVisitor visitor1, IVisitor visitor2) {
		super(visitor1, visitor2);
	}

	public void visit(IEntity entity) {
		wGetVisitor1().visit(entity);
		wGetVisitor2().visit(entity);
	}

	public void visit(Summation entity) {
		wGetVisitor1().visit(entity);
		wGetVisitor2().visit(entity);
	}
}
