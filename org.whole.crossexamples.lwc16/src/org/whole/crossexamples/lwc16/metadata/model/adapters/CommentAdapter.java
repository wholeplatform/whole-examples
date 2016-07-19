package org.whole.crossexamples.lwc16.metadata.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.metadata.visitors.IMetadataVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataFeatureDescriptorEnum;

/** 
 * @generator Whole
 */
public class CommentAdapter extends AbstractEntityAdapter implements Comment {
	private static final long serialVersionUID = 1;

	public CommentAdapter(IEntity implementor) {
		super(implementor);
	}

	public CommentAdapter() {
	}

	public void accept(IMetadataVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Comment> wGetEntityDescriptor() {
		return MetadataEntityDescriptorEnum.Comment;
	}

	public Paragraphs getParagraphs() {
		return wGet(MetadataFeatureDescriptorEnum.paragraphs).wGetAdapter(MetadataEntityDescriptorEnum.Paragraphs);
	}

	public void setParagraphs(Paragraphs paragraphs) {
		wSet(MetadataFeatureDescriptorEnum.paragraphs, paragraphs);
	}
}
