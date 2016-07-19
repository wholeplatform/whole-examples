package org.whole.crossexamples.lwc16.metadata.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.metadata.model.Metadata;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.metadata.visitors.IMetadataVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.metadata.model.Annotable;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.metadata.model.Annotations;

/** 
 * @generator Whole
 */
public class MetadataImpl extends AbstractSimpleEntity implements Metadata {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<Metadata> wGetEntityDescriptor() {
		return MetadataEntityDescriptorEnum.Metadata;
	}

	public int wGetEntityOrd() {
		return MetadataEntityDescriptorEnum.Metadata_ord;
	}

	public void accept(IMetadataVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Annotable annotable;

	public Annotable getAnnotable() {
		return notifyRequested(MetadataFeatureDescriptorEnum.annotable, annotable);
	}

	public void setAnnotable(Annotable annotable) {
		notifyChanged(MetadataFeatureDescriptorEnum.annotable, this.annotable, this.annotable = annotable);
	}

	private Annotations annotations;

	public Annotations getAnnotations() {
		return notifyRequested(MetadataFeatureDescriptorEnum.annotations, annotations);
	}

	public void setAnnotations(Annotations annotations) {
		notifyChanged(MetadataFeatureDescriptorEnum.annotations, this.annotations, this.annotations = annotations);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getAnnotable().wGetAdaptee(false);
		case 1:
			return getAnnotations().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setAnnotable(value.wGetAdapter(MetadataEntityDescriptorEnum.Annotable));
			break;
		case 1:
			setAnnotations(value.wGetAdapter(MetadataEntityDescriptorEnum.Annotations));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 2;
	}
}
