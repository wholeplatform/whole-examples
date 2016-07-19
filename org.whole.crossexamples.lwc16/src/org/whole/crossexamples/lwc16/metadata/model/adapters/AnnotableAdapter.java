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
public class AnnotableAdapter extends AbstractEntityAdapter implements Annotable {
	private static final long serialVersionUID = 1;

	public AnnotableAdapter(IEntity implementor) {
		super(implementor);
	}

	public AnnotableAdapter() {
	}

	public void accept(IMetadataVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Annotable> wGetEntityDescriptor() {
		return MetadataEntityDescriptorEnum.Annotable;
	}
}
