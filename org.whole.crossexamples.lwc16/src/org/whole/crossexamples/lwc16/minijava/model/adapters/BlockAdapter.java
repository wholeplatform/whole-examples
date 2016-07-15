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
public class BlockAdapter extends AbstractListEntityAdapter<Statement> implements Block {
	private static final long serialVersionUID = 1;

	public BlockAdapter(IEntity implementor) {
		super(implementor);
	}

	public BlockAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Block> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.Block;
	}
}
