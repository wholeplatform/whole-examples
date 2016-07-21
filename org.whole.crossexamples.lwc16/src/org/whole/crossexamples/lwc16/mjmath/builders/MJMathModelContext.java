package org.whole.crossexamples.lwc16.mjmath.builders;

import org.whole.lang.contexts.EntityContext;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.mjmath.reflect.MJMathFeatureDescriptorEnum;

/** 
 * @generator Whole
 */
public class MJMathModelContext extends EntityContext {
	public MJMathModelContext(IEntity root) {
		super(root);
	}

	public MJMathModelContext getIndex() {
		return (MJMathModelContext) wGet(MJMathFeatureDescriptorEnum.index);
	}

	public void setIndex(MJMathModelContext index) {
		wSet(MJMathFeatureDescriptorEnum.index, index);
	}

	public MJMathModelContext getLowerBound() {
		return (MJMathModelContext) wGet(MJMathFeatureDescriptorEnum.lowerBound);
	}

	public void setLowerBound(MJMathModelContext lowerBound) {
		wSet(MJMathFeatureDescriptorEnum.lowerBound, lowerBound);
	}

	public MJMathModelContext getUpperBound() {
		return (MJMathModelContext) wGet(MJMathFeatureDescriptorEnum.upperBound);
	}

	public void setUpperBound(MJMathModelContext upperBound) {
		wSet(MJMathFeatureDescriptorEnum.upperBound, upperBound);
	}

	public MJMathModelContext getExpression() {
		return (MJMathModelContext) wGet(MJMathFeatureDescriptorEnum.expression);
	}

	public void setExpression(MJMathModelContext expression) {
		wSet(MJMathFeatureDescriptorEnum.expression, expression);
	}
}
