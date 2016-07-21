package org.whole.crossexamples.lwc16.mjmath.visitors;

import org.whole.lang.visitors.IVisitor;
import org.whole.crossexamples.lwc16.mjmath.model.*;

/** 
 * @generator Whole
 */
public interface IMJMathVisitor extends IVisitor {
	public void visit(Summation entity);
}
