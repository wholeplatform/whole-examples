package org.whole.crossexamples.lwc16.minijava.model;

/** 
 * @generator Whole
 */
public interface MethodInvocation extends IMiniJavaEntity, Expression {
	public Expression getExpression();

	public void setExpression(Expression expression);

	public Identifier getName();

	public void setName(Identifier name);

	public Arguments getArguments();

	public void setArguments(Arguments arguments);
}
