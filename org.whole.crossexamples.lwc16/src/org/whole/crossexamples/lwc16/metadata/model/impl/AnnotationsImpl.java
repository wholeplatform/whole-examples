package org.whole.crossexamples.lwc16.metadata.model.impl;

import org.whole.lang.model.AbstractListCompositeEntity;
import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.crossexamples.lwc16.metadata.visitors.IMetadataVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class AnnotationsImpl extends AbstractListCompositeEntity<Annotation> implements Annotations {
	private static final long serialVersionUID = 1;

	public void accept(IMetadataVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return MetadataEntityDescriptorEnum.Annotations_ord;
	}

	public EntityDescriptor<Annotations> wGetEntityDescriptor() {
		return MetadataEntityDescriptorEnum.Annotations;
	}
}
