package org.whole.crossexamples.lwc16.mjmath.visitors;

import org.whole.crossexamples.lwc16.mjmath.model.*;

/** 
 * @generator Whole
 */
public class MJMathForwardStagedVisitor extends MJMathIdentityVisitor {
	public void visit(Summation entity) {
		stagedVisit(entity);
	}
}
