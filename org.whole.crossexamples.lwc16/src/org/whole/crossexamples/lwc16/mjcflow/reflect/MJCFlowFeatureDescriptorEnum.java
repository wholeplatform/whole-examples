package org.whole.crossexamples.lwc16.mjcflow.reflect;

import org.whole.lang.reflect.FeatureDescriptorEnum;
import org.whole.lang.reflect.FeatureDescriptor;

/** 
 * @generator Whole
 */
public class MJCFlowFeatureDescriptorEnum extends FeatureDescriptorEnum {
	public static final int expression_ord = 0;
	public static final int statement_ord = 1;
	public static final MJCFlowFeatureDescriptorEnum instance = new MJCFlowFeatureDescriptorEnum();
	public static final FeatureDescriptor expression = instance.valueOf(expression_ord);
	public static final FeatureDescriptor statement = instance.valueOf(statement_ord);

	private MJCFlowFeatureDescriptorEnum() {
		putFeatureDescriptor(expression_ord, "expression");
		putFeatureDescriptor(statement_ord, "statement");
	}

	private static final long serialVersionUID = 1;
}
