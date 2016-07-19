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
public class ParagraphAdapter extends AbstractListEntityAdapter<IText> implements Paragraph {
	private static final long serialVersionUID = 1;

	public ParagraphAdapter(IEntity implementor) {
		super(implementor);
	}

	public ParagraphAdapter() {
	}

	public void accept(IMetadataVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Paragraph> wGetEntityDescriptor() {
		return MetadataEntityDescriptorEnum.Paragraph;
	}
}
