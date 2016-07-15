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
public class WhileStatementAdapter extends AbstractEntityAdapter implements WhileStatement {
	private static final long serialVersionUID = 1;

	public WhileStatementAdapter(IEntity implementor) {
		super(implementor);
	}

	public WhileStatementAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<WhileStatement> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.WhileStatement;
	}

	public Expression getExpression() {
		return wGet(MiniJavaFeatureDescriptorEnum.expression).wGetAdapter(MiniJavaEntityDescriptorEnum.Expression);
	}

	public void setExpression(Expression expression) {
		wSet(MiniJavaFeatureDescriptorEnum.expression, expression);
	}

	public Statement getStatement() {
		return wGet(MiniJavaFeatureDescriptorEnum.statement).wGetAdapter(MiniJavaEntityDescriptorEnum.Statement);
	}

	public void setStatement(Statement statement) {
		wSet(MiniJavaFeatureDescriptorEnum.statement, statement);
	}
}
