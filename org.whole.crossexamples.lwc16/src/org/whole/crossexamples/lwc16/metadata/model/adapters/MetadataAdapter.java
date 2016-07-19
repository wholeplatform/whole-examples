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
public class MetadataAdapter extends AbstractEntityAdapter implements Metadata {
	private static final long serialVersionUID = 1;

	public MetadataAdapter(IEntity implementor) {
		super(implementor);
	}

	public MetadataAdapter() {
	}

	public void accept(IMetadataVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Metadata> wGetEntityDescriptor() {
		return MetadataEntityDescriptorEnum.Metadata;
	}

	public Annotable getAnnotable() {
		return wGet(MetadataFeatureDescriptorEnum.annotable).wGetAdapter(MetadataEntityDescriptorEnum.Annotable);
	}

	public void setAnnotable(Annotable annotable) {
		wSet(MetadataFeatureDescriptorEnum.annotable, annotable);
	}

	public Annotations getAnnotations() {
		return wGet(MetadataFeatureDescriptorEnum.annotations).wGetAdapter(MetadataEntityDescriptorEnum.Annotations);
	}

	public void setAnnotations(Annotations annotations) {
		wSet(MetadataFeatureDescriptorEnum.annotations, annotations);
	}
}
