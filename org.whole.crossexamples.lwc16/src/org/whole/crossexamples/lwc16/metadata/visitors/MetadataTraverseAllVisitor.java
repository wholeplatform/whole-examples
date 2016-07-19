package org.whole.crossexamples.lwc16.metadata.visitors;

import org.whole.crossexamples.lwc16.metadata.visitors.MetadataIdentityUnaryVisitor;
import org.whole.crossexamples.lwc16.metadata.visitors.IMetadataVisitor;
import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.lang.visitors.IVisitor;

/** 
 * @generator Whole
 */
public class MetadataTraverseAllVisitor extends MetadataIdentityUnaryVisitor<IMetadataVisitor> {
	public MetadataTraverseAllVisitor() {
		wSetVisitor1(this);
	}

	public MetadataTraverseAllVisitor(IVisitor visitor1) {
		super(visitor1);
	}

	public void visit(Metadata entity) {
		entity.getAnnotable().accept(wGetVisitor1());
		entity.getAnnotations().accept(wGetVisitor1());
	}

	public void visit(Annotations entity) {
		for (int i = 0; i < entity.size(); i++)
			entity.get(i).accept(wGetVisitor1());
	}

	public void visit(Revision entity) {
		entity.getMajor().accept(wGetVisitor1());
		entity.getMinor().accept(wGetVisitor1());
	}

	public void visit(Comment entity) {
		entity.getParagraphs().accept(wGetVisitor1());
	}

	public void visit(Paragraphs entity) {
		for (int i = 0; i < entity.size(); i++)
			entity.get(i).accept(wGetVisitor1());
	}

	public void visit(Paragraph entity) {
		for (int i = 0; i < entity.size(); i++)
			entity.get(i).accept(wGetVisitor1());
	}
}
