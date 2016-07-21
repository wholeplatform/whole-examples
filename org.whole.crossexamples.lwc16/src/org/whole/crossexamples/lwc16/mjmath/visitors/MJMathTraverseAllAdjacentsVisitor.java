package org.whole.crossexamples.lwc16.mjmath.visitors;

import org.whole.crossexamples.lwc16.mjmath.visitors.MJMathIdentityUnaryVisitor;
import org.whole.crossexamples.lwc16.mjmath.visitors.IMJMathVisitor;
import org.whole.crossexamples.lwc16.mjmath.model.*;
import org.whole.lang.visitors.IVisitor;

/** 
 * @generator Whole
 */
public class MJMathTraverseAllAdjacentsVisitor extends MJMathIdentityUnaryVisitor<IMJMathVisitor> {
	public MJMathTraverseAllAdjacentsVisitor() {
		wSetVisitor1(this);
	}

	public MJMathTraverseAllAdjacentsVisitor(IVisitor visitor1) {
		super(visitor1);
	}
}
