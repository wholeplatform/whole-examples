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
public class ClassDeclarationsImpl extends AbstractListCompositeEntity<ClassDeclaration> implements ClassDeclarations {
	private static final long serialVersionUID = 1;

	public void accept(IMiniJavaVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.ClassDeclarations_ord;
	}

	public EntityDescriptor<ClassDeclarations> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.ClassDeclarations;
	}
}
