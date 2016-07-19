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
public class AnnotationsAdapter extends AbstractListEntityAdapter<Annotation> implements Annotations {
	private static final long serialVersionUID = 1;

	public AnnotationsAdapter(IEntity implementor) {
		super(implementor);
	}

	public AnnotationsAdapter() {
	}

	public void accept(IMetadataVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Annotations> wGetEntityDescriptor() {
		return MetadataEntityDescriptorEnum.Annotations;
	}
}
