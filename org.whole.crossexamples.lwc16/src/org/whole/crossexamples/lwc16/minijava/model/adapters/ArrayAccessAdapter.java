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
public class ArrayAccessAdapter extends AbstractEntityAdapter implements ArrayAccess {
	private static final long serialVersionUID = 1;

	public ArrayAccessAdapter(IEntity implementor) {
		super(implementor);
	}

	public ArrayAccessAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<ArrayAccess> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.ArrayAccess;
	}

	public Expression getArray() {
		return wGet(MiniJavaFeatureDescriptorEnum.array).wGetAdapter(MiniJavaEntityDescriptorEnum.Expression);
	}

	public void setArray(Expression array) {
		wSet(MiniJavaFeatureDescriptorEnum.array, array);
	}

	public Expression getIndex() {
		return wGet(MiniJavaFeatureDescriptorEnum.index).wGetAdapter(MiniJavaEntityDescriptorEnum.Expression);
	}

	public void setIndex(Expression index) {
		wSet(MiniJavaFeatureDescriptorEnum.index, index);
	}
}
