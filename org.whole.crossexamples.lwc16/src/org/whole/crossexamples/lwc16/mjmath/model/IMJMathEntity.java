package org.whole.crossexamples.lwc16.mjmath.model;

import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.mjmath.visitors.IMJMathVisitor;

/** 
 * @generator Whole
 */
public interface IMJMathEntity extends IEntity {
	public void accept(IMJMathVisitor visitor);
}
