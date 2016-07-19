package org.whole.crossexamples.lwc16.metadata.visitors;

import org.whole.crossexamples.lwc16.metadata.visitors.MetadataIdentityUnaryVisitor;
import org.whole.crossexamples.lwc16.metadata.visitors.IMetadataVisitor;
import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.lang.visitors.IVisitor;

/** 
 * @generator Whole
 */
public class MetadataTraverseAllAdjacentsVisitor extends MetadataIdentityUnaryVisitor<IMetadataVisitor> {
	public MetadataTraverseAllAdjacentsVisitor() {
		wSetVisitor1(this);
	}

	public MetadataTraverseAllAdjacentsVisitor(IVisitor visitor1) {
		super(visitor1);
	}
}
