package org.whole.crossexamples.lwc16.minijava.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaFeatureDescriptorEnum;

/** 
 * @generator Whole
 */
public class ArrayElementAssignmentAdapter extends AbstractEntityAdapter implements ArrayElementAssignment {
	private static final long serialVersionUID = 1;

	public ArrayElementAssignmentAdapter(IEntity implementor) {
		super(implementor);
	}

	public ArrayElementAssignmentAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<ArrayElementAssignment> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.ArrayElementAssignment;
	}

	public Identifier getName() {
		return wGet(MiniJavaFeatureDescriptorEnum.name).wGetAdapter(MiniJavaEntityDescriptorEnum.Identifier);
	}

	public void setName(Identifier name) {
		wSet(MiniJavaFeatureDescriptorEnum.name, name);
	}

	public Expression getIndex() {
		return wGet(MiniJavaFeatureDescriptorEnum.index).wGetAdapter(MiniJavaEntityDescriptorEnum.Expression);
	}

	public void setIndex(Expression index) {
		wSet(MiniJavaFeatureDescriptorEnum.index, index);
	}

	public Expression getExpression() {
		return wGet(MiniJavaFeatureDescriptorEnum.expression).wGetAdapter(MiniJavaEntityDescriptorEnum.Expression);
	}

	public void setExpression(Expression expression) {
		wSet(MiniJavaFeatureDescriptorEnum.expression, expression);
	}
}
