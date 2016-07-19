package org.whole.crossexamples.lwc16.metadata.visitors;

import org.whole.crossexamples.lwc16.metadata.visitors.MetadataIdentityUnaryVisitor;
import org.whole.lang.visitors.IVisitor;
import org.whole.crossexamples.lwc16.metadata.model.*;

/** 
 * @generator Whole
 */
public class MetadataTraverseAllSwitchVisitor extends MetadataIdentityUnaryVisitor<IVisitor> {
	public MetadataTraverseAllSwitchVisitor(IVisitor visitor1) {
		super(visitor1);
	}

	public void visit(Metadata entity) {
		wGetVisitor1().visit(entity.getAnnotable());
		wGetVisitor1().visit(entity.getAnnotations());
	}

	public void visit(Annotations entity) {
		for (int i = 0; i < entity.size(); i++)
			wGetVisitor1().visit(entity.get(i));
	}

	public void visit(Revision entity) {
		wGetVisitor1().visit(entity.getMajor());
		wGetVisitor1().visit(entity.getMinor());
	}

	public void visit(Comment entity) {
		wGetVisitor1().visit(entity.getParagraphs());
	}

	public void visit(Paragraphs entity) {
		for (int i = 0; i < entity.size(); i++)
			wGetVisitor1().visit(entity.get(i));
	}

	public void visit(Paragraph entity) {
		for (int i = 0; i < entity.size(); i++)
			wGetVisitor1().visit(entity.get(i));
	}
}
