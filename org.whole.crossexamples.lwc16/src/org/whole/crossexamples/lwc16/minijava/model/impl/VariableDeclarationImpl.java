package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.minijava.model.VariableDeclaration;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.minijava.model.Type;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.model.Identifier;

/** 
 * @generator Whole
 */
public class VariableDeclarationImpl extends AbstractSimpleEntity implements VariableDeclaration {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<VariableDeclaration> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.VariableDeclaration;
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.VariableDeclaration_ord;
	}

	public void accept(IMiniJavaVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Type type;

	public Type getType() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.type, type);
	}

	public void setType(Type type) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.type, this.type, this.type = type);
	}

	private Identifier name;

	public Identifier getName() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.name, name);
	}

	public void setName(Identifier name) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.name, this.name, this.name = name);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getType().wGetAdaptee(false);
		case 1:
			return getName().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setType(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Type));
			break;
		case 1:
			setName(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Identifier));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 2;
	}
}
