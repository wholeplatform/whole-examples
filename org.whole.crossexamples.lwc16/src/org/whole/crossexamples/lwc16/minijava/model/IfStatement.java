package org.whole.crossexamples.lwc16.minijava.model;

/** 
 * @generator Whole
 */
public interface IfStatement extends IMiniJavaEntity, Statement {
	public Expression getExpression();

	public void setExpression(Expression expression);

	public Statement getThenStatement();

	public void setThenStatement(Statement thenStatement);

	public Statement getElseStatement();

	public void setElseStatement(Statement elseStatement);
}
