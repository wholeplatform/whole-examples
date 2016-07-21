package org.whole.crossexamples.lwc16.mjmath.visitors;

import org.whole.lang.visitors.IVisitor;
import org.whole.lang.visitors.AbstractUnaryVisitor;
import org.whole.crossexamples.lwc16.mjmath.model.*;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class MJMathIdentityUnaryVisitor<V extends IVisitor> extends AbstractUnaryVisitor<V> implements IMJMathVisitor {
	public MJMathIdentityUnaryVisitor() {
		super(null);
	}

	public MJMathIdentityUnaryVisitor(IVisitor visitor1) {
		super(visitor1);
	}

	public void visit(IEntity entity) {
		((IMJMathEntity) entity).accept(this);
	}

	public void visit(Summation entity) {
	}
}
