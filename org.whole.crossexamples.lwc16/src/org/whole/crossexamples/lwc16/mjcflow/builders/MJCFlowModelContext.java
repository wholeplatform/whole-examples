package org.whole.crossexamples.lwc16.mjcflow.builders;

import org.whole.lang.contexts.EntityContext;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.mjcflow.reflect.MJCFlowFeatureDescriptorEnum;

/** 
 * @generator Whole
 */
public class MJCFlowModelContext extends EntityContext {
	public MJCFlowModelContext(IEntity root) {
		super(root);
	}

	public MJCFlowModelContext getExpression() {
		return (MJCFlowModelContext) wGet(MJCFlowFeatureDescriptorEnum.expression);
	}

	public void setExpression(MJCFlowModelContext expression) {
		wSet(MJCFlowFeatureDescriptorEnum.expression, expression);
	}

	public MJCFlowModelContext getStatement() {
		return (MJCFlowModelContext) wGet(MJCFlowFeatureDescriptorEnum.statement);
	}

	public void setStatement(MJCFlowModelContext statement) {
		wSet(MJCFlowFeatureDescriptorEnum.statement, statement);
	}
}
