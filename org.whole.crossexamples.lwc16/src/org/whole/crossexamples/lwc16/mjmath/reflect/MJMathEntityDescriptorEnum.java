package org.whole.crossexamples.lwc16.mjmath.reflect;

import org.whole.lang.reflect.EntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.mjmath.model.*;

/** 
 * @generator Whole
 */
@SuppressWarnings("unchecked")
public class MJMathEntityDescriptorEnum extends EntityDescriptorEnum {
	public static final int Summation_ord = 0;
	public static final int Identifier_ord = 1;
	public static final int Expression_ord = 2;
	public static final MJMathEntityDescriptorEnum instance = new MJMathEntityDescriptorEnum();
	public static final EntityDescriptor<Summation> Summation = (EntityDescriptor<Summation>) instance
			.valueOf(Summation_ord);
	public static final EntityDescriptor<Identifier> Identifier = (EntityDescriptor<Identifier>) instance
			.valueOf(Identifier_ord);
	public static final EntityDescriptor<Expression> Expression = (EntityDescriptor<Expression>) instance
			.valueOf(Expression_ord);

	private MJMathEntityDescriptorEnum() {
	}

	private static final long serialVersionUID = 1;

	protected void initEntityDescriptors() {
		putSimpleEntity(Summation_ord, "Summation", Summation.class, false)
				.withFeature(MJMathFeatureDescriptorEnum.index, Identifier_ord)
				.withFeature(MJMathFeatureDescriptorEnum.lowerBound, Expression_ord)
				.withFeature(MJMathFeatureDescriptorEnum.upperBound, Expression_ord)
				.withFeature(MJMathFeatureDescriptorEnum.expression, Expression_ord);
		putSimpleEntity(Identifier_ord, "Identifier", Identifier.class, true);
		putSimpleEntity(Expression_ord, "Expression", Expression.class, true, Summation_ord);
	}

	protected void initForeignTypeRelations() {
		setAliasOf(true, "whole:org.whole.crossexamples.lwc16.minijava:MiniJavaModel#Identifier", Identifier_ord);
		setAliasOf(true, "whole:org.whole.crossexamples.lwc16.minijava:MiniJavaModel#Expression", Expression_ord);
		setAliasOf(true, "http://lang.whole.org/Math#Expression", Expression_ord);
	}
}
