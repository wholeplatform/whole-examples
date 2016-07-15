package org.whole.crossexamples.lwc16.minijava.model;

/** 
 * @generator Whole
 */
public interface MethodDeclaration extends IMiniJavaEntity {
	public Type getReturnType();

	public void setReturnType(Type returnType);

	public Identifier getName();

	public void setName(Identifier name);

	public VariableDeclarations getParameters();

	public void setParameters(VariableDeclarations parameters);

	public VariableDeclarations getVariables();

	public void setVariables(VariableDeclarations variables);

	public Statements getStatements();

	public void setStatements(Statements statements);

	public Expression getReturnExpression();

	public void setReturnExpression(Expression returnExpression);
}
