package org.whole.crossexamples.lwc16.metadata.model;

/** 
 * @generator Whole
 */
public interface Revision extends IMetadataEntity, Annotation {
	public Number getMajor();

	public void setMajor(Number major);

	public Number getMinor();

	public void setMinor(Number minor);
}
