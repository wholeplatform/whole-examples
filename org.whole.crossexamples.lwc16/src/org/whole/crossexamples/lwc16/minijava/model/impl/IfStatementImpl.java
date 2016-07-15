package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.minijava.model.IfStatement;
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
public class IfStatementImpl extends AbstractSimpleEntity implements IfStatement {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<IfStatement> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.IfStatement;
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.IfStatement_ord;
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

	private Statement thenStatement;

	public Statement getThenStatement() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.thenStatement, thenStatement);
	}

	public void setThenStatement(Statement thenStatement) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.thenStatement, this.thenStatement,
				this.thenStatement = thenStatement);
	}

	private Statement elseStatement;

	public Statement getElseStatement() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.elseStatement, elseStatement);
	}

	public void setElseStatement(Statement elseStatement) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.elseStatement, this.elseStatement,
				this.elseStatement = elseStatement);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getExpression().wGetAdaptee(false);
		case 1:
			return getThenStatement().wGetAdaptee(false);
		case 2:
			return getElseStatement().wGetAdaptee(false);
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
			setThenStatement(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Statement));
			break;
		case 2:
			setElseStatement(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Statement));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 3;
	}
}
