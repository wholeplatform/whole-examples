package org.whole.crossexamples.lwc16.mjmath.builders;

import org.whole.lang.builders.GenericBuilderContext;
import org.whole.lang.builders.IBuilder;
import org.whole.lang.contexts.IEntityContext;
import org.whole.crossexamples.lwc16.mjmath.reflect.MJMathFeatureDescriptorEnum;
import org.whole.crossexamples.lwc16.mjmath.reflect.MJMathEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class MJMathSpecificBuilderAdapter extends GenericBuilderContext implements IMJMathBuilder {
	public MJMathSpecificBuilderAdapter(IBuilder strategy) {
		super(strategy);
	}

	public MJMathSpecificBuilderAdapter(IBuilder strategy, IEntityContext entityContext) {
		super(strategy, entityContext);
	}

	public void expression() {
		wFeature(MJMathFeatureDescriptorEnum.expression);
	}

	public void upperBound() {
		wFeature(MJMathFeatureDescriptorEnum.upperBound);
	}

	public void lowerBound() {
		wFeature(MJMathFeatureDescriptorEnum.lowerBound);
	}

	public void index() {
		wFeature(MJMathFeatureDescriptorEnum.index);
	}

	public void visit() {
	}

	public void Summation() {
		wEntity(MJMathEntityDescriptorEnum.Summation);
	}

	public void Summation_() {
		wEntity_(MJMathEntityDescriptorEnum.Summation);
	}

	public void _Summation() {
		_wEntity(MJMathEntityDescriptorEnum.Summation);
	}
}
