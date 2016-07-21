package org.whole.crossexamples.lwc16.mjmath.reflect;

import org.whole.lang.reflect.FeatureDescriptorEnum;
import org.whole.lang.reflect.FeatureDescriptor;

/** 
 * @generator Whole
 */
public class MJMathFeatureDescriptorEnum extends FeatureDescriptorEnum {
	public static final int index_ord = 0;
	public static final int lowerBound_ord = 1;
	public static final int upperBound_ord = 2;
	public static final int expression_ord = 3;
	public static final MJMathFeatureDescriptorEnum instance = new MJMathFeatureDescriptorEnum();
	public static final FeatureDescriptor index = instance.valueOf(index_ord);
	public static final FeatureDescriptor lowerBound = instance.valueOf(lowerBound_ord);
	public static final FeatureDescriptor upperBound = instance.valueOf(upperBound_ord);
	public static final FeatureDescriptor expression = instance.valueOf(expression_ord);

	private MJMathFeatureDescriptorEnum() {
		putFeatureDescriptor(index_ord, "index");
		putFeatureDescriptor(lowerBound_ord, "lowerBound");
		putFeatureDescriptor(upperBound_ord, "upperBound");
		putFeatureDescriptor(expression_ord, "expression");
	}

	private static final long serialVersionUID = 1;
}
