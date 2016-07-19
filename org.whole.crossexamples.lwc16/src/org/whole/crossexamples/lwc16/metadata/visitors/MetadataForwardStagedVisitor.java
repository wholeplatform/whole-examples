package org.whole.crossexamples.lwc16.metadata.visitors;

import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.crossexamples.lwc16.metadata.model.Number;

/** 
 * @generator Whole
 */
public class MetadataForwardStagedVisitor extends MetadataIdentityVisitor {
	public void visit(Metadata entity) {
		stagedVisit(entity);
	}

	public void visit(Annotations entity) {
		stagedVisit(entity);
	}

	public void visit(Author entity) {
		stagedVisit(entity);
	}

	public void visit(Revision entity) {
		stagedVisit(entity);
	}

	public void visit(Number entity) {
		stagedVisit(entity);
	}

	public void visit(Comment entity) {
		stagedVisit(entity);
	}

	public void visit(Paragraphs entity) {
		stagedVisit(entity);
	}

	public void visit(Paragraph entity) {
		stagedVisit(entity);
	}

	public void visit(Text entity) {
		stagedVisit(entity);
	}
}
