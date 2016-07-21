package org.whole.crossexamples.lwc16.mjcflow.visitors;

import org.whole.lang.visitors.GenericTraversalFactory;
import org.whole.lang.visitors.IVisitor;
import org.whole.lang.visitors.IBinaryVisitor;
import org.whole.lang.visitors.IUnaryVisitor;

/** 
 * @generator Whole
 */
public class MJCFlowTraversalFactory extends GenericTraversalFactory {
	public static final MJCFlowTraversalFactory instance = new MJCFlowTraversalFactory();

	private MJCFlowTraversalFactory() {
	}

	protected IVisitor ensureSpecific(IVisitor visitor) {
		if (visitor instanceof IMJCFlowVisitor)
			return visitor;
		else
			return new MJCFlowForwardGenericVisitor(visitor);
	}

	public IVisitor failure() {
		return new MJCFlowFailureVisitor();
	}

	public IVisitor identity() {
		return new MJCFlowIdentityVisitor();
	}

	public IVisitor forwardStaged() {
		return new MJCFlowForwardStagedVisitor();
	}

	public IBinaryVisitor sequence(IVisitor visitor1, IVisitor visitor2) {
		return new MJCFlowSequenceVisitor(ensureSpecific(visitor1), ensureSpecific(visitor2));
	}

	public IUnaryVisitor traverseAll(IVisitor visitor1) {
		return new MJCFlowTraverseAllVisitor(ensureSpecific(visitor1));
	}

	public IUnaryVisitor traverseAllChildren(IVisitor visitor1) {
		return new MJCFlowTraverseAllChildrenVisitor(ensureSpecific(visitor1));
	}

	public IUnaryVisitor traverseAllAdjacents(IVisitor visitor1) {
		return new MJCFlowTraverseAllAdjacentsVisitor(ensureSpecific(visitor1));
	}
}
