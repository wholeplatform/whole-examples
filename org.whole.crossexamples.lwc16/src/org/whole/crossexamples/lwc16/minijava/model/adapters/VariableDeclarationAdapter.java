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
public class VariableDeclarationAdapter extends AbstractEntityAdapter implements VariableDeclaration {
	private static final long serialVersionUID = 1;

	public VariableDeclarationAdapter(IEntity implementor) {
		super(implementor);
	}

	public VariableDeclarationAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<VariableDeclaration> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.VariableDeclaration;
	}

	public Type getType() {
		return wGet(MiniJavaFeatureDescriptorEnum.type).wGetAdapter(MiniJavaEntityDescriptorEnum.Type);
	}

	public void setType(Type type) {
		wSet(MiniJavaFeatureDescriptorEnum.type, type);
	}

	public Identifier getName() {
		return wGet(MiniJavaFeatureDescriptorEnum.name).wGetAdapter(MiniJavaEntityDescriptorEnum.Identifier);
	}

	public void setName(Identifier name) {
		wSet(MiniJavaFeatureDescriptorEnum.name, name);
	}
}
