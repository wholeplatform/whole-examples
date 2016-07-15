package org.whole.crossexamples.lwc16.minijava.visitors;

import org.whole.crossexamples.lwc16.minijava.visitors.MiniJavaIdentityUnaryVisitor;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.lang.visitors.IVisitor;

/** 
 * @generator Whole
 */
public class MiniJavaTraverseAllAdjacentsVisitor extends MiniJavaIdentityUnaryVisitor<IMiniJavaVisitor> {
	public MiniJavaTraverseAllAdjacentsVisitor() {
		wSetVisitor1(this);
	}

	public MiniJavaTraverseAllAdjacentsVisitor(IVisitor visitor1) {
		super(visitor1);
	}
}
