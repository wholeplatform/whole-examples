package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.minijava.model.MethodDeclaration;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.minijava.model.Type;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.model.Identifier;
import org.whole.crossexamples.lwc16.minijava.model.VariableDeclarations;
import org.whole.crossexamples.lwc16.minijava.model.Statements;
import org.whole.crossexamples.lwc16.minijava.model.Expression;

/** 
 * @generator Whole
 */
public class MethodDeclarationImpl extends AbstractSimpleEntity implements MethodDeclaration {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<MethodDeclaration> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.MethodDeclaration;
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.MethodDeclaration_ord;
	}

	public void accept(IMiniJavaVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Type returnType;

	public Type getReturnType() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.returnType, returnType);
	}

	public void setReturnType(Type returnType) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.returnType, this.returnType, this.returnType = returnType);
	}

	private Identifier name;

	public Identifier getName() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.name, name);
	}

	public void setName(Identifier name) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.name, this.name, this.name = name);
	}

	private VariableDeclarations parameters;

	public VariableDeclarations getParameters() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.parameters, parameters);
	}

	public void setParameters(VariableDeclarations parameters) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.parameters, this.parameters, this.parameters = parameters);
	}

	private VariableDeclarations variables;

	public VariableDeclarations getVariables() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.variables, variables);
	}

	public void setVariables(VariableDeclarations variables) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.variables, this.variables, this.variables = variables);
	}

	private Statements statements;

	public Statements getStatements() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.statements, statements);
	}

	public void setStatements(Statements statements) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.statements, this.statements, this.statements = statements);
	}

	private Expression returnExpression;

	public Expression getReturnExpression() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.returnExpression, returnExpression);
	}

	public void setReturnExpression(Expression returnExpression) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.returnExpression, this.returnExpression,
				this.returnExpression = returnExpression);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getReturnType().wGetAdaptee(false);
		case 1:
			return getName().wGetAdaptee(false);
		case 2:
			return getParameters().wGetAdaptee(false);
		case 3:
			return getVariables().wGetAdaptee(false);
		case 4:
			return getStatements().wGetAdaptee(false);
		case 5:
			return getReturnExpression().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setReturnType(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Type));
			break;
		case 1:
			setName(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Identifier));
			break;
		case 2:
			setParameters(value.wGetAdapter(MiniJavaEntityDescriptorEnum.VariableDeclarations));
			break;
		case 3:
			setVariables(value.wGetAdapter(MiniJavaEntityDescriptorEnum.VariableDeclarations));
			break;
		case 4:
			setStatements(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Statements));
			break;
		case 5:
			setReturnExpression(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Expression));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 6;
	}
}
