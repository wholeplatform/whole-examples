package org.whole.crossexamples.lwc16.mjmath.visitors;

import org.whole.lang.visitors.GenericForwardStrategyVisitor;
import org.whole.crossexamples.lwc16.mjmath.model.*;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class MJMathForwardStrategyVisitor extends GenericForwardStrategyVisitor<IMJMathVisitor>
		implements IMJMathVisitor {
	public MJMathForwardStrategyVisitor() {
		this(new MJMathIdentityVisitor());
	}

	public MJMathForwardStrategyVisitor(IMJMathVisitor... initialStrategies) {
		super(initialStrategies);
	}

	public void visit(IEntity entity) {
		((IMJMathEntity) entity).accept(this);
	}

	public void visit(Summation entity) {
		wGetStrategy().visit(entity);
	}
}
