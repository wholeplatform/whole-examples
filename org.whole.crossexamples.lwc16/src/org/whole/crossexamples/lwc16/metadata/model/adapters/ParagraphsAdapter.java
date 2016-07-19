package org.whole.crossexamples.lwc16.metadata.model.adapters;

import org.whole.lang.model.adapters.AbstractListEntityAdapter;
import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.metadata.visitors.IMetadataVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class ParagraphsAdapter extends AbstractListEntityAdapter<Paragraph> implements Paragraphs {
	private static final long serialVersionUID = 1;

	public ParagraphsAdapter(IEntity implementor) {
		super(implementor);
	}

	public ParagraphsAdapter() {
	}

	public void accept(IMetadataVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Paragraphs> wGetEntityDescriptor() {
		return MetadataEntityDescriptorEnum.Paragraphs;
	}
}
