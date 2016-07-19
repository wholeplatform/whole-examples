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
public class AuthorAdapter extends AbstractEntityAdapter implements Author {
	private static final long serialVersionUID = 1;

	public AuthorAdapter(IEntity implementor) {
		super(implementor);
	}

	public AuthorAdapter() {
	}

	public void accept(IMetadataVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Author> wGetEntityDescriptor() {
		return MetadataEntityDescriptorEnum.Author;
	}

	public String getValue() {
		return wStringValue();
	}

	public void setValue(String value) {
		wSetValue(value);
	}
}
