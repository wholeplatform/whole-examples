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
public class MethodDeclarationAdapter extends AbstractEntityAdapter implements MethodDeclaration {
	private static final long serialVersionUID = 1;

	public MethodDeclarationAdapter(IEntity implementor) {
		super(implementor);
	}

	public MethodDeclarationAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<MethodDeclaration> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.MethodDeclaration;
	}

	public Type getReturnType() {
		return wGet(MiniJavaFeatureDescriptorEnum.returnType).wGetAdapter(MiniJavaEntityDescriptorEnum.Type);
	}

	public void setReturnType(Type returnType) {
		wSet(MiniJavaFeatureDescriptorEnum.returnType, returnType);
	}

	public Identifier getName() {
		return wGet(MiniJavaFeatureDescriptorEnum.name).wGetAdapter(MiniJavaEntityDescriptorEnum.Identifier);
	}

	public void setName(Identifier name) {
		wSet(MiniJavaFeatureDescriptorEnum.name, name);
	}

	public VariableDeclarations getParameters() {
		return wGet(MiniJavaFeatureDescriptorEnum.parameters)
				.wGetAdapter(MiniJavaEntityDescriptorEnum.VariableDeclarations);
	}

	public void setParameters(VariableDeclarations parameters) {
		wSet(MiniJavaFeatureDescriptorEnum.parameters, parameters);
	}

	public VariableDeclarations getVariables() {
		return wGet(MiniJavaFeatureDescriptorEnum.variables)
				.wGetAdapter(MiniJavaEntityDescriptorEnum.VariableDeclarations);
	}

	public void setVariables(VariableDeclarations variables) {
		wSet(MiniJavaFeatureDescriptorEnum.variables, variables);
	}

	public Statements getStatements() {
		return wGet(MiniJavaFeatureDescriptorEnum.statements).wGetAdapter(MiniJavaEntityDescriptorEnum.Statements);
	}

	public void setStatements(Statements statements) {
		wSet(MiniJavaFeatureDescriptorEnum.statements, statements);
	}

	public Expression getReturnExpression() {
		return wGet(MiniJavaFeatureDescriptorEnum.returnExpression)
				.wGetAdapter(MiniJavaEntityDescriptorEnum.Expression);
	}

	public void setReturnExpression(Expression returnExpression) {
		wSet(MiniJavaFeatureDescriptorEnum.returnExpression, returnExpression);
	}
}
