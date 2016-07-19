package org.whole.crossexamples.lwc16.metadata.visitors;

import org.whole.lang.visitors.AbstractBinaryVisitor;
import org.whole.crossexamples.lwc16.metadata.visitors.IMetadataVisitor;
import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.lang.visitors.IVisitor;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.metadata.model.Number;

/** 
 * @generator Whole
 */
public class MetadataSequenceVisitor extends AbstractBinaryVisitor<IMetadataVisitor> implements IMetadataVisitor {
	public MetadataSequenceVisitor(IVisitor visitor1, IVisitor visitor2) {
		super(visitor1, visitor2);
	}

	public void visit(IEntity entity) {
		wGetVisitor1().visit(entity);
		wGetVisitor2().visit(entity);
	}

	public void visit(Metadata entity) {
		wGetVisitor1().visit(entity);
		wGetVisitor2().visit(entity);
	}

	public void visit(Annotations entity) {
		wGetVisitor1().visit(entity);
		wGetVisitor2().visit(entity);
	}

	public void visit(Author entity) {
		wGetVisitor1().visit(entity);
		wGetVisitor2().visit(entity);
	}

	public void visit(Revision entity) {
		wGetVisitor1().visit(entity);
		wGetVisitor2().visit(entity);
	}

	public void visit(Number entity) {
		wGetVisitor1().visit(entity);
		wGetVisitor2().visit(entity);
	}

	public void visit(Comment entity) {
		wGetVisitor1().visit(entity);
		wGetVisitor2().visit(entity);
	}

	public void visit(Paragraphs entity) {
		wGetVisitor1().visit(entity);
		wGetVisitor2().visit(entity);
	}

	public void visit(Paragraph entity) {
		wGetVisitor1().visit(entity);
		wGetVisitor2().visit(entity);
	}

	public void visit(Text entity) {
		wGetVisitor1().visit(entity);
		wGetVisitor2().visit(entity);
	}
}
