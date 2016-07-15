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
public class ClassInstanceCreationAdapter extends AbstractEntityAdapter implements ClassInstanceCreation {
	private static final long serialVersionUID = 1;

	public ClassInstanceCreationAdapter(IEntity implementor) {
		super(implementor);
	}

	public ClassInstanceCreationAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<ClassInstanceCreation> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.ClassInstanceCreation;
	}

	public Identifier getName() {
		return wGet(MiniJavaFeatureDescriptorEnum.name).wGetAdapter(MiniJavaEntityDescriptorEnum.Identifier);
	}

	public void setName(Identifier name) {
		wSet(MiniJavaFeatureDescriptorEnum.name, name);
	}
}
