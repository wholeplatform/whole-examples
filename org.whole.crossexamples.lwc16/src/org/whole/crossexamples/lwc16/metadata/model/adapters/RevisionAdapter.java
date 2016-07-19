package org.whole.crossexamples.lwc16.metadata.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.metadata.visitors.IMetadataVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.metadata.model.Number;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataFeatureDescriptorEnum;

/** 
 * @generator Whole
 */
public class RevisionAdapter extends AbstractEntityAdapter implements Revision {
	private static final long serialVersionUID = 1;

	public RevisionAdapter(IEntity implementor) {
		super(implementor);
	}

	public RevisionAdapter() {
	}

	public void accept(IMetadataVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Revision> wGetEntityDescriptor() {
		return MetadataEntityDescriptorEnum.Revision;
	}

	public Number getMajor() {
		return wGet(MetadataFeatureDescriptorEnum.major).wGetAdapter(MetadataEntityDescriptorEnum.Number);
	}

	public void setMajor(Number major) {
		wSet(MetadataFeatureDescriptorEnum.major, major);
	}

	public Number getMinor() {
		return wGet(MetadataFeatureDescriptorEnum.minor).wGetAdapter(MetadataEntityDescriptorEnum.Number);
	}

	public void setMinor(Number minor) {
		wSet(MetadataFeatureDescriptorEnum.minor, minor);
	}
}
