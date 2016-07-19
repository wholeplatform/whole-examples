package org.whole.crossexamples.lwc16.metadata.visitors;

import org.whole.lang.visitors.GenericTraversalFactory;
import org.whole.lang.visitors.IVisitor;
import org.whole.lang.visitors.IBinaryVisitor;
import org.whole.lang.visitors.IUnaryVisitor;

/** 
 * @generator Whole
 */
public class MetadataTraversalFactory extends GenericTraversalFactory {
	public static final MetadataTraversalFactory instance = new MetadataTraversalFactory();

	private MetadataTraversalFactory() {
	}

	protected IVisitor ensureSpecific(IVisitor visitor) {
		if (visitor instanceof IMetadataVisitor)
			return visitor;
		else
			return new MetadataForwardGenericVisitor(visitor);
	}

	public IVisitor failure() {
		return new MetadataFailureVisitor();
	}

	public IVisitor identity() {
		return new MetadataIdentityVisitor();
	}

	public IVisitor forwardStaged() {
		return new MetadataForwardStagedVisitor();
	}

	public IBinaryVisitor sequence(IVisitor visitor1, IVisitor visitor2) {
		return new MetadataSequenceVisitor(ensureSpecific(visitor1), ensureSpecific(visitor2));
	}

	public IUnaryVisitor traverseAll(IVisitor visitor1) {
		return new MetadataTraverseAllVisitor(ensureSpecific(visitor1));
	}

	public IUnaryVisitor traverseAllChildren(IVisitor visitor1) {
		return new MetadataTraverseAllChildrenVisitor(ensureSpecific(visitor1));
	}

	public IUnaryVisitor traverseAllAdjacents(IVisitor visitor1) {
		return new MetadataTraverseAllAdjacentsVisitor(ensureSpecific(visitor1));
	}
}
