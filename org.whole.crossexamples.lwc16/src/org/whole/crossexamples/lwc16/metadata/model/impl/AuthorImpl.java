package org.whole.crossexamples.lwc16.metadata.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.crossexamples.lwc16.metadata.model.Author;
import org.whole.crossexamples.lwc16.metadata.visitors.IMetadataVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class AuthorImpl extends AbstractDataEntity implements Author {
	private static final long serialVersionUID = 1;
	private String value;

	public String getValue() {
		return notifyRequested(value);
	}

	public void setValue(String value) {
		notifyChanged(this.value, this.value = value);
	}

	public void accept(IMetadataVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return MetadataEntityDescriptorEnum.Author_ord;
	}

	public EntityDescriptor<Author> wGetEntityDescriptor() {
		return MetadataEntityDescriptorEnum.Author;
	}

	public Object wGetValue() {
		return getValue();
	}

	public void wSetValue(Object value) {
		setValue((String) value);
	}

	public String wStringValue() {
		return getValue();
	}

	public void wSetValue(String value) {
		setValue(value);
	}
}
