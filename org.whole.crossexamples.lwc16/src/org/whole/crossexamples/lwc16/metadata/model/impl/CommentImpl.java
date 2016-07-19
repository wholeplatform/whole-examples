package org.whole.crossexamples.lwc16.metadata.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.metadata.model.Comment;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.metadata.visitors.IMetadataVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.metadata.model.Paragraphs;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class CommentImpl extends AbstractSimpleEntity implements Comment {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<Comment> wGetEntityDescriptor() {
		return MetadataEntityDescriptorEnum.Comment;
	}

	public int wGetEntityOrd() {
		return MetadataEntityDescriptorEnum.Comment_ord;
	}

	public void accept(IMetadataVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Paragraphs paragraphs;

	public Paragraphs getParagraphs() {
		return notifyRequested(MetadataFeatureDescriptorEnum.paragraphs, paragraphs);
	}

	public void setParagraphs(Paragraphs paragraphs) {
		notifyChanged(MetadataFeatureDescriptorEnum.paragraphs, this.paragraphs, this.paragraphs = paragraphs);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getParagraphs().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setParagraphs(value.wGetAdapter(MetadataEntityDescriptorEnum.Paragraphs));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 1;
	}
}
