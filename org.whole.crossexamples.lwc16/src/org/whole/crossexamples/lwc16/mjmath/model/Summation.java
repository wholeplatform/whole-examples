package org.whole.crossexamples.lwc16.mjmath.model;

/** 
 * @generator Whole
 */
public interface Summation extends IMJMathEntity, Expression {
	public Identifier getIndex();

	public void setIndex(Identifier index);

	public Expression getLowerBound();

	public void setLowerBound(Expression lowerBound);

	public Expression getUpperBound();

	public void setUpperBound(Expression upperBound);

	public Expression getExpression();

	public void setExpression(Expression expression);
}
