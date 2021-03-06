package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractListCompositeEntity;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class VariableDeclarationsImpl extends AbstractListCompositeEntity<VariableDeclaration>
		implements VariableDeclarations {
	private static final long serialVersionUID = 1;

	public void accept(IMiniJavaVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.VariableDeclarations_ord;
	}

	public EntityDescriptor<VariableDeclarations> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.VariableDeclarations;
	}
}
