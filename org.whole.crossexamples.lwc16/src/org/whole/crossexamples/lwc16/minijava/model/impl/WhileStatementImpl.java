package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.minijava.model.WhileStatement;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.minijava.model.Expression;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.model.Statement;

/** 
 * @generator Whole
 */
public class WhileStatementImpl extends AbstractSimpleEntity implements WhileStatement {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<WhileStatement> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.WhileStatement;
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.WhileStatement_ord;
	}

	public void accept(IMiniJavaVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Expression expression;

	public Expression getExpression() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.expression, expression);
	}

	public void setExpression(Expression expression) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.expression, this.expression, this.expression = expression);
	}

	private Statement statement;

	public Statement getStatement() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.statement, statement);
	}

	public void setStatement(Statement statement) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.statement, this.statement, this.statement = statement);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getExpression().wGetAdaptee(false);
		case 1:
			return getStatement().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setExpression(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Expression));
			break;
		case 1:
			setStatement(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Statement));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 2;
	}
}
