package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.minijava.model.MethodInvocation;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.minijava.model.Expression;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.model.Identifier;
import org.whole.crossexamples.lwc16.minijava.model.Arguments;

/** 
 * @generator Whole
 */
public class MethodInvocationImpl extends AbstractSimpleEntity implements MethodInvocation {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<MethodInvocation> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.MethodInvocation;
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.MethodInvocation_ord;
	}

	public void accept(IMiniJavaVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Expression expression;

	public Expression getExpression() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.expression, expression);
	}

	public void setExpression(Expression expression) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.expression, this.expression, this.expression = expression);
	}

	private Identifier name;

	public Identifier getName() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.name, name);
	}

	public void setName(Identifier name) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.name, this.name, this.name = name);
	}

	private Arguments arguments;

	public Arguments getArguments() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.arguments, arguments);
	}

	public void setArguments(Arguments arguments) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.arguments, this.arguments, this.arguments = arguments);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getExpression().wGetAdaptee(false);
		case 1:
			return getName().wGetAdaptee(false);
		case 2:
			return getArguments().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setExpression(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Expression));
			break;
		case 1:
			setName(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Identifier));
			break;
		case 2:
			setArguments(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Arguments));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 3;
	}
}
