package org.whole.crossexamples.lwc16.metadata.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.metadata.model.Revision;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.metadata.visitors.IMetadataVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.metadata.model.Number;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class RevisionImpl extends AbstractSimpleEntity implements Revision {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<Revision> wGetEntityDescriptor() {
		return MetadataEntityDescriptorEnum.Revision;
	}

	public int wGetEntityOrd() {
		return MetadataEntityDescriptorEnum.Revision_ord;
	}

	public void accept(IMetadataVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Number major;

	public Number getMajor() {
		return notifyRequested(MetadataFeatureDescriptorEnum.major, major);
	}

	public void setMajor(Number major) {
		notifyChanged(MetadataFeatureDescriptorEnum.major, this.major, this.major = major);
	}

	private Number minor;

	public Number getMinor() {
		return notifyRequested(MetadataFeatureDescriptorEnum.minor, minor);
	}

	public void setMinor(Number minor) {
		notifyChanged(MetadataFeatureDescriptorEnum.minor, this.minor, this.minor = minor);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getMajor().wGetAdaptee(false);
		case 1:
			return getMinor().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setMajor(value.wGetAdapter(MetadataEntityDescriptorEnum.Number));
			break;
		case 1:
			setMinor(value.wGetAdapter(MetadataEntityDescriptorEnum.Number));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 2;
	}
}
