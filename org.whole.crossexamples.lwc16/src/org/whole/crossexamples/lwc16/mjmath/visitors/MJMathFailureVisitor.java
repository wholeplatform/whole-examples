package org.whole.crossexamples.lwc16.mjmath.visitors;

import org.whole.crossexamples.lwc16.mjmath.model.*;
import org.whole.lang.model.adapters.IEntityAdapter;
import org.whole.lang.visitors.VisitException;

/** 
 * @generator Whole
 */
public class MJMathFailureVisitor extends MJMathIdentityVisitor {
	public boolean visitAdapter(IEntityAdapter entity) {
		throw new VisitException();
	}

	public void visit(Summation entity) {
		throw new VisitException();
	}
}
