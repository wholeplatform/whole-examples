package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.minijava.model.Boolean;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;

/** 
 * @generator Whole
 */
public class BooleanImpl extends AbstractSimpleEntity implements Boolean {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<Boolean> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.Boolean;
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.Boolean_ord;
	}

	public void accept(IMiniJavaVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}
}
