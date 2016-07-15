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
public class ArrayLengthAdapter extends AbstractEntityAdapter implements ArrayLength {
	private static final long serialVersionUID = 1;

	public ArrayLengthAdapter(IEntity implementor) {
		super(implementor);
	}

	public ArrayLengthAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<ArrayLength> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.ArrayLength;
	}

	public Expression getArray() {
		return wGet(MiniJavaFeatureDescriptorEnum.array).wGetAdapter(MiniJavaEntityDescriptorEnum.Expression);
	}

	public void setArray(Expression array) {
		wSet(MiniJavaFeatureDescriptorEnum.array, array);
	}
}
