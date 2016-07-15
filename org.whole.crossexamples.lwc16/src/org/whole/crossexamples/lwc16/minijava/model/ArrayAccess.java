package org.whole.crossexamples.lwc16.minijava.model;

/** 
 * @generator Whole
 */
public interface ArrayAccess extends IMiniJavaEntity, Expression {
	public Expression getArray();

	public void setArray(Expression array);

	public Expression getIndex();

	public void setIndex(Expression index);
}
