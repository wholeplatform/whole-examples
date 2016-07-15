package org.whole.crossexamples.lwc16.minijava.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaFeatureDescriptorEnum;

/** 
 * @generator Whole
 */
public class ArrayCreationAdapter extends AbstractEntityAdapter implements ArrayCreation {
	private static final long serialVersionUID = 1;

	public ArrayCreationAdapter(IEntity implementor) {
		super(implementor);
	}

	public ArrayCreationAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<ArrayCreation> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.ArrayCreation;
	}

	public Expression getLength() {
		return wGet(MiniJavaFeatureDescriptorEnum.length).wGetAdapter(MiniJavaEntityDescriptorEnum.Expression);
	}

	public void setLength(Expression length) {
		wSet(MiniJavaFeatureDescriptorEnum.length, length);
	}
}
