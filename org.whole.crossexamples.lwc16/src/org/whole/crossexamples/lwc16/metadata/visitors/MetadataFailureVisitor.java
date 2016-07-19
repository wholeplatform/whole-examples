package org.whole.crossexamples.lwc16.metadata.visitors;

import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.lang.model.adapters.IEntityAdapter;
import org.whole.lang.visitors.VisitException;
import org.whole.crossexamples.lwc16.metadata.model.Number;

/** 
 * @generator Whole
 */
public class MetadataFailureVisitor extends MetadataIdentityVisitor {
	public boolean visitAdapter(IEntityAdapter entity) {
		throw new VisitException();
	}

	public void visit(Metadata entity) {
		throw new VisitException();
	}

	public void visit(Annotations entity) {
		throw new VisitException();
	}

	public void visit(Author entity) {
		throw new VisitException();
	}

	public void visit(Revision entity) {
		throw new VisitException();
	}

	public void visit(Number entity) {
		throw new VisitException();
	}

	public void visit(Comment entity) {
		throw new VisitException();
	}

	public void visit(Paragraphs entity) {
		throw new VisitException();
	}

	public void visit(Paragraph entity) {
		throw new VisitException();
	}

	public void visit(Text entity) {
		throw new VisitException();
	}
}
