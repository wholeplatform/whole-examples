package org.whole.crossexamples.lwc16.mjcflow.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.mjcflow.model.UnlessStatement;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.mjcflow.reflect.MJCFlowEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.mjcflow.visitors.IMJCFlowVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.mjcflow.model.Expression;
import org.whole.crossexamples.lwc16.mjcflow.reflect.MJCFlowFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.mjcflow.model.Statement;

/** 
 * @generator Whole
 */
public class UnlessStatementImpl extends AbstractSimpleEntity implements UnlessStatement {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<UnlessStatement> wGetEntityDescriptor() {
		return MJCFlowEntityDescriptorEnum.UnlessStatement;
	}

	public int wGetEntityOrd() {
		return MJCFlowEntityDescriptorEnum.UnlessStatement_ord;
	}

	public void accept(IMJCFlowVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Expression expression;

	public Expression getExpression() {
		return notifyRequested(MJCFlowFeatureDescriptorEnum.expression, expression);
	}

	public void setExpression(Expression expression) {
		notifyChanged(MJCFlowFeatureDescriptorEnum.expression, this.expression, this.expression = expression);
	}

	private Statement statement;

	public Statement getStatement() {
		return notifyRequested(MJCFlowFeatureDescriptorEnum.statement, statement);
	}

	public void setStatement(Statement statement) {
		notifyChanged(MJCFlowFeatureDescriptorEnum.statement, this.statement, this.statement = statement);
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
			setExpression(value.wGetAdapter(MJCFlowEntityDescriptorEnum.Expression));
			break;
		case 1:
			setStatement(value.wGetAdapter(MJCFlowEntityDescriptorEnum.Statement));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 2;
	}
}
