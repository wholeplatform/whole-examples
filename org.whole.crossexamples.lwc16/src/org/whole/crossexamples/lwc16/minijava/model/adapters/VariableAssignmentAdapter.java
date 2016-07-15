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
public class VariableAssignmentAdapter extends AbstractEntityAdapter implements VariableAssignment {
	private static final long serialVersionUID = 1;

	public VariableAssignmentAdapter(IEntity implementor) {
		super(implementor);
	}

	public VariableAssignmentAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<VariableAssignment> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.VariableAssignment;
	}

	public Identifier getName() {
		return wGet(MiniJavaFeatureDescriptorEnum.name).wGetAdapter(MiniJavaEntityDescriptorEnum.Identifier);
	}

	public void setName(Identifier name) {
		wSet(MiniJavaFeatureDescriptorEnum.name, name);
	}

	public Expression getExpression() {
		return wGet(MiniJavaFeatureDescriptorEnum.expression).wGetAdapter(MiniJavaEntityDescriptorEnum.Expression);
	}

	public void setExpression(Expression expression) {
		wSet(MiniJavaFeatureDescriptorEnum.expression, expression);
	}
}
