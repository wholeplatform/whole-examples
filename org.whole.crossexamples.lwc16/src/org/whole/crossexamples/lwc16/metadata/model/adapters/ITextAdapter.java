package org.whole.crossexamples.lwc16.metadata.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.metadata.visitors.IMetadataVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class ITextAdapter extends AbstractEntityAdapter implements IText {
	private static final long serialVersionUID = 1;

	public ITextAdapter(IEntity implementor) {
		super(implementor);
	}

	public ITextAdapter() {
	}

	public void accept(IMetadataVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<IText> wGetEntityDescriptor() {
		return MetadataEntityDescriptorEnum.IText;
	}
}
