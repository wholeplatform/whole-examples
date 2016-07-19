package org.whole.crossexamples.lwc16.metadata.reflect;

import org.whole.lang.reflect.FeatureDescriptorEnum;
import org.whole.lang.reflect.FeatureDescriptor;

/** 
 * @generator Whole
 */
public class MetadataFeatureDescriptorEnum extends FeatureDescriptorEnum {
	public static final int annotable_ord = 0;
	public static final int annotations_ord = 1;
	public static final int major_ord = 2;
	public static final int minor_ord = 3;
	public static final int paragraphs_ord = 4;
	public static final MetadataFeatureDescriptorEnum instance = new MetadataFeatureDescriptorEnum();
	public static final FeatureDescriptor annotable = instance.valueOf(annotable_ord);
	public static final FeatureDescriptor annotations = instance.valueOf(annotations_ord);
	public static final FeatureDescriptor major = instance.valueOf(major_ord);
	public static final FeatureDescriptor minor = instance.valueOf(minor_ord);
	public static final FeatureDescriptor paragraphs = instance.valueOf(paragraphs_ord);

	private MetadataFeatureDescriptorEnum() {
		putFeatureDescriptor(annotable_ord, "annotable");
		putFeatureDescriptor(annotations_ord, "annotations");
		putFeatureDescriptor(major_ord, "major");
		putFeatureDescriptor(minor_ord, "minor");
		putFeatureDescriptor(paragraphs_ord, "paragraphs");
	}

	private static final long serialVersionUID = 1;
}
