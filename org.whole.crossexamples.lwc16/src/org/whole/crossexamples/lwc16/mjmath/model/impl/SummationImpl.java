package org.whole.crossexamples.lwc16.mjmath.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.mjmath.model.Summation;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.mjmath.reflect.MJMathEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.mjmath.visitors.IMJMathVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.mjmath.model.Identifier;
import org.whole.crossexamples.lwc16.mjmath.reflect.MJMathFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.mjmath.model.Expression;

/** 
 * @generator Whole
 */
public class SummationImpl extends AbstractSimpleEntity implements Summation {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<Summation> wGetEntityDescriptor() {
		return MJMathEntityDescriptorEnum.Summation;
	}

	public int wGetEntityOrd() {
		return MJMathEntityDescriptorEnum.Summation_ord;
	}

	public void accept(IMJMathVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Identifier index;

	public Identifier getIndex() {
		return notifyRequested(MJMathFeatureDescriptorEnum.index, index);
	}

	public void setIndex(Identifier index) {
		notifyChanged(MJMathFeatureDescriptorEnum.index, this.index, this.index = index);
	}

	private Expression lowerBound;

	public Expression getLowerBound() {
		return notifyRequested(MJMathFeatureDescriptorEnum.lowerBound, lowerBound);
	}

	public void setLowerBound(Expression lowerBound) {
		notifyChanged(MJMathFeatureDescriptorEnum.lowerBound, this.lowerBound, this.lowerBound = lowerBound);
	}

	private Expression upperBound;

	public Expression getUpperBound() {
		return notifyRequested(MJMathFeatureDescriptorEnum.upperBound, upperBound);
	}

	public void setUpperBound(Expression upperBound) {
		notifyChanged(MJMathFeatureDescriptorEnum.upperBound, this.upperBound, this.upperBound = upperBound);
	}

	private Expression expression;

	public Expression getExpression() {
		return notifyRequested(MJMathFeatureDescriptorEnum.expression, expression);
	}

	public void setExpression(Expression expression) {
		notifyChanged(MJMathFeatureDescriptorEnum.expression, this.expression, this.expression = expression);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getIndex().wGetAdaptee(false);
		case 1:
			return getLowerBound().wGetAdaptee(false);
		case 2:
			return getUpperBound().wGetAdaptee(false);
		case 3:
			return getExpression().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setIndex(value.wGetAdapter(MJMathEntityDescriptorEnum.Identifier));
			break;
		case 1:
			setLowerBound(value.wGetAdapter(MJMathEntityDescriptorEnum.Expression));
			break;
		case 2:
			setUpperBound(value.wGetAdapter(MJMathEntityDescriptorEnum.Expression));
			break;
		case 3:
			setExpression(value.wGetAdapter(MJMathEntityDescriptorEnum.Expression));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 4;
	}
}
