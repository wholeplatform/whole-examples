package org.whole.crossexamples.lwc16.metadata.visitors;

import org.whole.lang.visitors.AbstractUnaryVisitor;
import org.whole.lang.visitors.IVisitor;
import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.metadata.model.Number;

/** 
 * @generator Whole
 */
public class MetadataForwardGenericVisitor extends AbstractUnaryVisitor<IVisitor> implements IMetadataVisitor {
	public MetadataForwardGenericVisitor(IVisitor visitor1) {
		super(visitor1);
	}

	public void visit(IEntity entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(Metadata entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(Annotations entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(Author entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(Revision entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(Number entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(Comment entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(Paragraphs entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(Paragraph entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(Text entity) {
		wGetVisitor1().visit(entity);
	}
}
