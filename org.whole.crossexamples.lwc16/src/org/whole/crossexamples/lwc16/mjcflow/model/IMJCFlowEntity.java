package org.whole.crossexamples.lwc16.mjcflow.model;

import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.mjcflow.visitors.IMJCFlowVisitor;

/** 
 * @generator Whole
 */
public interface IMJCFlowEntity extends IEntity {
	public void accept(IMJCFlowVisitor visitor);
}
