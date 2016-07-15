package org.whole.crossexamples.lwc16.minijava.model;

/** 
 * @generator Whole
 */
public interface VariableAssignment extends IMiniJavaEntity, Statement {
	public Identifier getName();

	public void setName(Identifier name);

	public Expression getExpression();

	public void setExpression(Expression expression);
}
