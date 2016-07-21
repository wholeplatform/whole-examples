package org.whole.crossexamples.lwc16.mjcflow.builders;

import org.whole.lang.builders.GenericBuilderContext;
import org.whole.lang.builders.IBuilder;
import org.whole.lang.contexts.IEntityContext;
import org.whole.crossexamples.lwc16.mjcflow.reflect.MJCFlowFeatureDescriptorEnum;
import org.whole.crossexamples.lwc16.mjcflow.reflect.MJCFlowEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class MJCFlowSpecificBuilderAdapter extends GenericBuilderContext implements IMJCFlowBuilder {
	public MJCFlowSpecificBuilderAdapter(IBuilder strategy) {
		super(strategy);
	}

	public MJCFlowSpecificBuilderAdapter(IBuilder strategy, IEntityContext entityContext) {
		super(strategy, entityContext);
	}

	public void statement() {
		wFeature(MJCFlowFeatureDescriptorEnum.statement);
	}

	public void expression() {
		wFeature(MJCFlowFeatureDescriptorEnum.expression);
	}

	public void visit() {
	}

	public void UnlessStatement() {
		wEntity(MJCFlowEntityDescriptorEnum.UnlessStatement);
	}

	public void UnlessStatement_() {
		wEntity_(MJCFlowEntityDescriptorEnum.UnlessStatement);
	}

	public void _UnlessStatement() {
		_wEntity(MJCFlowEntityDescriptorEnum.UnlessStatement);
	}
}
