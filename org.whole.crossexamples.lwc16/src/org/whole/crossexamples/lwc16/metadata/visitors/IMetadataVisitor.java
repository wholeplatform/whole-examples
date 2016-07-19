package org.whole.crossexamples.lwc16.metadata.visitors;

import org.whole.lang.visitors.IVisitor;
import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.crossexamples.lwc16.metadata.model.Number;

/** 
 * @generator Whole
 */
public interface IMetadataVisitor extends IVisitor {
	public void visit(Metadata entity);

	public void visit(Annotations entity);

	public void visit(Author entity);

	public void visit(Revision entity);

	public void visit(Number entity);

	public void visit(Comment entity);

	public void visit(Paragraphs entity);

	public void visit(Paragraph entity);

	public void visit(Text entity);
}
