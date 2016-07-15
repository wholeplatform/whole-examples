package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.minijava.model.ClassDeclaration;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.minijava.model.Identifier;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.model.VariableDeclarations;
import org.whole.crossexamples.lwc16.minijava.model.MethodDeclarations;

/** 
 * @generator Whole
 */
public class ClassDeclarationImpl extends AbstractSimpleEntity implements ClassDeclaration {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<ClassDeclaration> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.ClassDeclaration;
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.ClassDeclaration_ord;
	}

	public void accept(IMiniJavaVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Identifier name;

	public Identifier getName() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.name, name);
	}

	public void setName(Identifier name) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.name, this.name, this.name = name);
	}

	private Identifier superclassName;

	public Identifier getSuperclassName() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.superclassName, superclassName);
	}

	public void setSuperclassName(Identifier superclassName) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.superclassName, this.superclassName,
				this.superclassName = superclassName);
	}

	private VariableDeclarations variables;

	public VariableDeclarations getVariables() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.variables, variables);
	}

	public void setVariables(VariableDeclarations variables) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.variables, this.variables, this.variables = variables);
	}

	private MethodDeclarations methods;

	public MethodDeclarations getMethods() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.methods, methods);
	}

	public void setMethods(MethodDeclarations methods) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.methods, this.methods, this.methods = methods);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getName().wGetAdaptee(false);
		case 1:
			return getSuperclassName().wGetAdaptee(false);
		case 2:
			return getVariables().wGetAdaptee(false);
		case 3:
			return getMethods().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setName(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Identifier));
			break;
		case 1:
			setSuperclassName(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Identifier));
			break;
		case 2:
			setVariables(value.wGetAdapter(MiniJavaEntityDescriptorEnum.VariableDeclarations));
			break;
		case 3:
			setMethods(value.wGetAdapter(MiniJavaEntityDescriptorEnum.MethodDeclarations));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 4;
	}
}
