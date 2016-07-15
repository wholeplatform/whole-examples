package org.whole.crossexamples.lwc16.minijava.model.adapters;

import org.whole.lang.model.adapters.AbstractListEntityAdapter;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class VariableDeclarationsAdapter extends AbstractListEntityAdapter<VariableDeclaration>
		implements VariableDeclarations {
	private static final long serialVersionUID = 1;

	public VariableDeclarationsAdapter(IEntity implementor) {
		super(implementor);
	}

	public VariableDeclarationsAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<VariableDeclarations> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.VariableDeclarations;
	}
}
