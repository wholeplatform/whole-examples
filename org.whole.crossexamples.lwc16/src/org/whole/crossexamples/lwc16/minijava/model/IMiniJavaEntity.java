package org.whole.crossexamples.lwc16.minijava.model;

import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;

/** 
 * @generator Whole
 */
public interface IMiniJavaEntity extends IEntity {
	public void accept(IMiniJavaVisitor visitor);
}
