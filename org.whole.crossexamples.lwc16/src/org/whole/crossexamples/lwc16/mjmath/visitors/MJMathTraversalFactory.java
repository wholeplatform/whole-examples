package org.whole.crossexamples.lwc16.mjmath.visitors;

import org.whole.lang.visitors.GenericTraversalFactory;
import org.whole.lang.visitors.IVisitor;
import org.whole.lang.visitors.IBinaryVisitor;
import org.whole.lang.visitors.IUnaryVisitor;

/** 
 * @generator Whole
 */
public class MJMathTraversalFactory extends GenericTraversalFactory {
	public static final MJMathTraversalFactory instance = new MJMathTraversalFactory();

	private MJMathTraversalFactory() {
	}

	protected IVisitor ensureSpecific(IVisitor visitor) {
		if (visitor instanceof IMJMathVisitor)
			return visitor;
		else
			return new MJMathForwardGenericVisitor(visitor);
	}

	public IVisitor failure() {
		return new MJMathFailureVisitor();
	}

	public IVisitor identity() {
		return new MJMathIdentityVisitor();
	}

	public IVisitor forwardStaged() {
		return new MJMathForwardStagedVisitor();
	}

	public IBinaryVisitor sequence(IVisitor visitor1, IVisitor visitor2) {
		return new MJMathSequenceVisitor(ensureSpecific(visitor1), ensureSpecific(visitor2));
	}

	public IUnaryVisitor traverseAll(IVisitor visitor1) {
		return new MJMathTraverseAllVisitor(ensureSpecific(visitor1));
	}

	public IUnaryVisitor traverseAllChildren(IVisitor visitor1) {
		return new MJMathTraverseAllChildrenVisitor(ensureSpecific(visitor1));
	}

	public IUnaryVisitor traverseAllAdjacents(IVisitor visitor1) {
		return new MJMathTraverseAllAdjacentsVisitor(ensureSpecific(visitor1));
	}
}
