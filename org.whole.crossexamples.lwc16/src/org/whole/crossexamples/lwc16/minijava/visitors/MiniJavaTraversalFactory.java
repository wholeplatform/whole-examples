package org.whole.crossexamples.lwc16.minijava.visitors;

import org.whole.lang.visitors.GenericTraversalFactory;
import org.whole.lang.visitors.IVisitor;
import org.whole.lang.visitors.IBinaryVisitor;
import org.whole.lang.visitors.IUnaryVisitor;

/** 
 * @generator Whole
 */
public class MiniJavaTraversalFactory extends GenericTraversalFactory {
	public static final MiniJavaTraversalFactory instance = new MiniJavaTraversalFactory();

	private MiniJavaTraversalFactory() {
	}

	protected IVisitor ensureSpecific(IVisitor visitor) {
		if (visitor instanceof IMiniJavaVisitor)
			return visitor;
		else
			return new MiniJavaForwardGenericVisitor(visitor);
	}

	public IVisitor failure() {
		return new MiniJavaFailureVisitor();
	}

	public IVisitor identity() {
		return new MiniJavaIdentityVisitor();
	}

	public IVisitor forwardStaged() {
		return new MiniJavaForwardStagedVisitor();
	}

	public IBinaryVisitor sequence(IVisitor visitor1, IVisitor visitor2) {
		return new MiniJavaSequenceVisitor(ensureSpecific(visitor1), ensureSpecific(visitor2));
	}

	public IUnaryVisitor traverseAll(IVisitor visitor1) {
		return new MiniJavaTraverseAllVisitor(ensureSpecific(visitor1));
	}

	public IUnaryVisitor traverseAllChildren(IVisitor visitor1) {
		return new MiniJavaTraverseAllChildrenVisitor(ensureSpecific(visitor1));
	}

	public IUnaryVisitor traverseAllAdjacents(IVisitor visitor1) {
		return new MiniJavaTraverseAllAdjacentsVisitor(ensureSpecific(visitor1));
	}
}
