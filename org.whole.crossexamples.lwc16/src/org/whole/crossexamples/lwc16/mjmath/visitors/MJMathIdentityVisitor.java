package org.whole.crossexamples.lwc16.mjmath.visitors;

import org.whole.lang.visitors.AbstractVisitor;
import org.whole.crossexamples.lwc16.mjmath.model.*;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class MJMathIdentityVisitor extends AbstractVisitor implements IMJMathVisitor {
	public void visit(IEntity entity) {
		((IMJMathEntity) entity).accept(this);
	}

	public void visit(Summation entity) {
	}
}
