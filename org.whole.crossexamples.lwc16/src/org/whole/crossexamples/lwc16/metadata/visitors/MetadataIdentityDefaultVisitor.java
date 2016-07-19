package org.whole.crossexamples.lwc16.metadata.visitors;

import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.crossexamples.lwc16.metadata.model.Number;

/** 
 * @generator Whole
 */
public class MetadataIdentityDefaultVisitor extends MetadataIdentityVisitor {
	public void visit(IMetadataEntity entity) {
	}

	public void visit(Metadata entity) {
		visit((IMetadataEntity) entity);
	}

	public void visit(Annotations entity) {
		visit((IMetadataEntity) entity);
	}

	public void visit(Annotation entity) {
	}

	public void visit(Author entity) {
		visit((IMetadataEntity) entity);
		visit((Annotation) entity);
	}

	public void visit(Revision entity) {
		visit((IMetadataEntity) entity);
		visit((Annotation) entity);
	}

	public void visit(Number entity) {
		visit((IMetadataEntity) entity);
	}

	public void visit(Comment entity) {
		visit((IMetadataEntity) entity);
		visit((Annotation) entity);
	}

	public void visit(Paragraphs entity) {
		visit((IMetadataEntity) entity);
	}

	public void visit(Paragraph entity) {
		visit((IMetadataEntity) entity);
	}

	public void visit(IText entity) {
	}

	public void visit(Text entity) {
		visit((IMetadataEntity) entity);
		visit((IText) entity);
	}
}
