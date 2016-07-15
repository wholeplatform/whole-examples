package org.whole.crossexamples.lwc16.minijava.model;

/** 
 * @generator Whole
 */
public interface ArrayElementAssignment extends IMiniJavaEntity, Statement {
	public Identifier getName();

	public void setName(Identifier name);

	public Expression getIndex();

	public void setIndex(Expression index);

	public Expression getExpression();

	public void setExpression(Expression expression);
}
