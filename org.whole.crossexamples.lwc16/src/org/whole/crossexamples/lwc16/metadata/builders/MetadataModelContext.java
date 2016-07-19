package org.whole.crossexamples.lwc16.metadata.builders;

import org.whole.lang.contexts.EntityContext;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataFeatureDescriptorEnum;

/** 
 * @generator Whole
 */
public class MetadataModelContext extends EntityContext {
	public MetadataModelContext(IEntity root) {
		super(root);
	}

	public MetadataModelContext getAnnotable() {
		return (MetadataModelContext) wGet(MetadataFeatureDescriptorEnum.annotable);
	}

	public void setAnnotable(MetadataModelContext annotable) {
		wSet(MetadataFeatureDescriptorEnum.annotable, annotable);
	}

	public MetadataModelContext getAnnotations() {
		return (MetadataModelContext) wGet(MetadataFeatureDescriptorEnum.annotations);
	}

	public void setAnnotations(MetadataModelContext annotations) {
		wSet(MetadataFeatureDescriptorEnum.annotations, annotations);
	}

	public MetadataModelContext getMajor() {
		return (MetadataModelContext) wGet(MetadataFeatureDescriptorEnum.major);
	}

	public void setMajor(MetadataModelContext major) {
		wSet(MetadataFeatureDescriptorEnum.major, major);
	}

	public MetadataModelContext getMinor() {
		return (MetadataModelContext) wGet(MetadataFeatureDescriptorEnum.minor);
	}

	public void setMinor(MetadataModelContext minor) {
		wSet(MetadataFeatureDescriptorEnum.minor, minor);
	}

	public MetadataModelContext getParagraphs() {
		return (MetadataModelContext) wGet(MetadataFeatureDescriptorEnum.paragraphs);
	}

	public void setParagraphs(MetadataModelContext paragraphs) {
		wSet(MetadataFeatureDescriptorEnum.paragraphs, paragraphs);
	}
}
