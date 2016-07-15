package org.whole.crossexamples.lwc16.minijava.model;

/** 
 * @generator Whole
 */
public interface InfixExpression extends IMiniJavaEntity, Expression {
	public Expression getLeftOperand();

	public void setLeftOperand(Expression leftOperand);

	public InfixOperator getOperator();

	public void setOperator(InfixOperator operator);

	public Expression getRightOperand();

	public void setRightOperand(Expression rightOperand);
}
