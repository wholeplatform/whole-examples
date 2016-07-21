package org.whole.crossexamples.lwc16.mjmath.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.crossexamples.lwc16.mjmath.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.mjmath.visitors.IMJMathVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.mjmath.reflect.MJMathEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.mjmath.reflect.MJMathFeatureDescriptorEnum;

/** 
 * @generator Whole
 */
public class SummationAdapter extends AbstractEntityAdapter implements Summation {
	private static final long serialVersionUID = 1;

	public SummationAdapter(IEntity implementor) {
		super(implementor);
	}

	public SummationAdapter() {
	}

	public void accept(IMJMathVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Summation> wGetEntityDescriptor() {
		return MJMathEntityDescriptorEnum.Summation;
	}

	public Identifier getIndex() {
		return wGet(MJMathFeatureDescriptorEnum.index).wGetAdapter(MJMathEntityDescriptorEnum.Identifier);
	}

	public void setIndex(Identifier index) {
		wSet(MJMathFeatureDescriptorEnum.index, index);
	}

	public Expression getLowerBound() {
		return wGet(MJMathFeatureDescriptorEnum.lowerBound).wGetAdapter(MJMathEntityDescriptorEnum.Expression);
	}

	public void setLowerBound(Expression lowerBound) {
		wSet(MJMathFeatureDescriptorEnum.lowerBound, lowerBound);
	}

	public Expression getUpperBound() {
		return wGet(MJMathFeatureDescriptorEnum.upperBound).wGetAdapter(MJMathEntityDescriptorEnum.Expression);
	}

	public void setUpperBound(Expression upperBound) {
		wSet(MJMathFeatureDescriptorEnum.upperBound, upperBound);
	}

	public Expression getExpression() {
		return wGet(MJMathFeatureDescriptorEnum.expression).wGetAdapter(MJMathEntityDescriptorEnum.Expression);
	}

	public void setExpression(Expression expression) {
		wSet(MJMathFeatureDescriptorEnum.expression, expression);
	}
}
