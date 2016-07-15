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
public class IfStatementAdapter extends AbstractEntityAdapter implements IfStatement {
	private static final long serialVersionUID = 1;

	public IfStatementAdapter(IEntity implementor) {
		super(implementor);
	}

	public IfStatementAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<IfStatement> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.IfStatement;
	}

	public Expression getExpression() {
		return wGet(MiniJavaFeatureDescriptorEnum.expression).wGetAdapter(MiniJavaEntityDescriptorEnum.Expression);
	}

	public void setExpression(Expression expression) {
		wSet(MiniJavaFeatureDescriptorEnum.expression, expression);
	}

	public Statement getThenStatement() {
		return wGet(MiniJavaFeatureDescriptorEnum.thenStatement).wGetAdapter(MiniJavaEntityDescriptorEnum.Statement);
	}

	public void setThenStatement(Statement thenStatement) {
		wSet(MiniJavaFeatureDescriptorEnum.thenStatement, thenStatement);
	}

	public Statement getElseStatement() {
		return wGet(MiniJavaFeatureDescriptorEnum.elseStatement).wGetAdapter(MiniJavaEntityDescriptorEnum.Statement);
	}

	public void setElseStatement(Statement elseStatement) {
		wSet(MiniJavaFeatureDescriptorEnum.elseStatement, elseStatement);
	}
}
