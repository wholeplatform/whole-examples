package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.minijava.model.ThisExpression;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;

/** 
 * @generator Whole
 */
public class ThisExpressionImpl extends AbstractSimpleEntity implements ThisExpression {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<ThisExpression> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.ThisExpression;
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.ThisExpression_ord;
	}

	public void accept(IMiniJavaVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}
}
