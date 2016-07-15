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
public class ClassDeclarationAdapter extends AbstractEntityAdapter implements ClassDeclaration {
	private static final long serialVersionUID = 1;

	public ClassDeclarationAdapter(IEntity implementor) {
		super(implementor);
	}

	public ClassDeclarationAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<ClassDeclaration> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.ClassDeclaration;
	}

	public Identifier getName() {
		return wGet(MiniJavaFeatureDescriptorEnum.name).wGetAdapter(MiniJavaEntityDescriptorEnum.Identifier);
	}

	public void setName(Identifier name) {
		wSet(MiniJavaFeatureDescriptorEnum.name, name);
	}

	public Identifier getSuperclassName() {
		return wGet(MiniJavaFeatureDescriptorEnum.superclassName).wGetAdapter(MiniJavaEntityDescriptorEnum.Identifier);
	}

	public void setSuperclassName(Identifier superclassName) {
		wSet(MiniJavaFeatureDescriptorEnum.superclassName, superclassName);
	}

	public VariableDeclarations getVariables() {
		return wGet(MiniJavaFeatureDescriptorEnum.variables)
				.wGetAdapter(MiniJavaEntityDescriptorEnum.VariableDeclarations);
	}

	public void setVariables(VariableDeclarations variables) {
		wSet(MiniJavaFeatureDescriptorEnum.variables, variables);
	}

	public MethodDeclarations getMethods() {
		return wGet(MiniJavaFeatureDescriptorEnum.methods).wGetAdapter(MiniJavaEntityDescriptorEnum.MethodDeclarations);
	}

	public void setMethods(MethodDeclarations methods) {
		wSet(MiniJavaFeatureDescriptorEnum.methods, methods);
	}
}
