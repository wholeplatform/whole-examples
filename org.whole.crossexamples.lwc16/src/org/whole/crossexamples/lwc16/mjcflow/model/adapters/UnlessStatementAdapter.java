package org.whole.crossexamples.lwc16.mjcflow.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.crossexamples.lwc16.mjcflow.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.mjcflow.visitors.IMJCFlowVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.mjcflow.reflect.MJCFlowEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.mjcflow.reflect.MJCFlowFeatureDescriptorEnum;

/** 
 * @generator Whole
 */
public class UnlessStatementAdapter extends AbstractEntityAdapter implements UnlessStatement {
	private static final long serialVersionUID = 1;

	public UnlessStatementAdapter(IEntity implementor) {
		super(implementor);
	}

	public UnlessStatementAdapter() {
	}

	public void accept(IMJCFlowVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<UnlessStatement> wGetEntityDescriptor() {
		return MJCFlowEntityDescriptorEnum.UnlessStatement;
	}

	public Expression getExpression() {
		return wGet(MJCFlowFeatureDescriptorEnum.expression).wGetAdapter(MJCFlowEntityDescriptorEnum.Expression);
	}

	public void setExpression(Expression expression) {
		wSet(MJCFlowFeatureDescriptorEnum.expression, expression);
	}

	public Statement getStatement() {
		return wGet(MJCFlowFeatureDescriptorEnum.statement).wGetAdapter(MJCFlowEntityDescriptorEnum.Statement);
	}

	public void setStatement(Statement statement) {
		wSet(MJCFlowFeatureDescriptorEnum.statement, statement);
	}
}
