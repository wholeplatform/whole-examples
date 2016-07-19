package org.whole.crossexamples.lwc16.metadata.visitors;

import org.whole.lang.visitors.GenericForwardStrategyVisitor;
import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.metadata.model.Number;

/** 
 * @generator Whole
 */
public class MetadataForwardStrategyVisitor extends GenericForwardStrategyVisitor<IMetadataVisitor>
		implements IMetadataVisitor {
	public MetadataForwardStrategyVisitor() {
		this(new MetadataIdentityVisitor());
	}

	public MetadataForwardStrategyVisitor(IMetadataVisitor... initialStrategies) {
		super(initialStrategies);
	}

	public void visit(IEntity entity) {
		((IMetadataEntity) entity).accept(this);
	}

	public void visit(Metadata entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(Annotations entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(Author entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(Revision entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(Number entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(Comment entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(Paragraphs entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(Paragraph entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(Text entity) {
		wGetStrategy().visit(entity);
	}
}
