package org.whole.crossexamples.lwc16.metadata.model;

import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.metadata.visitors.IMetadataVisitor;

/** 
 * @generator Whole
 */
public interface IMetadataEntity extends IEntity {
	public void accept(IMetadataVisitor visitor);
}
