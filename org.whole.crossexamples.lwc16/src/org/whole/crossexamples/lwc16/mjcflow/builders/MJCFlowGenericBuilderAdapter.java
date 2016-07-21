package org.whole.crossexamples.lwc16.mjcflow.builders;

import org.whole.lang.builders.GenericIdentityBuilder;
import org.whole.lang.contexts.IEntityContext;
import org.whole.lang.reflect.FeatureDescriptor;
import org.whole.crossexamples.lwc16.mjcflow.reflect.MJCFlowFeatureDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.mjcflow.reflect.MJCFlowEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class MJCFlowGenericBuilderAdapter extends GenericIdentityBuilder {
	private IMJCFlowBuilder specificBuilder;

	public MJCFlowGenericBuilderAdapter(IMJCFlowBuilder specificBuilder) {
		this.specificBuilder = specificBuilder;
	}

	public MJCFlowGenericBuilderAdapter(IMJCFlowBuilder specificBuilder, IEntityContext entityContext) {
		this(specificBuilder);
		wSetEntityContext(entityContext);
	}

	public void visit() {
	}

	public void wFeature(FeatureDescriptor featureDesc) {
		switch (featureDesc.getOrdinal()) {
		case MJCFlowFeatureDescriptorEnum.expression_ord:
			specificBuilder.expression();
			break;
		case MJCFlowFeatureDescriptorEnum.statement_ord:
			specificBuilder.statement();
			break;
		}
	}

	public void wEntity(EntityDescriptor<?> entityDesc) {
		switch (entityDesc.getOrdinal()) {
		case MJCFlowEntityDescriptorEnum.UnlessStatement_ord:
			specificBuilder.UnlessStatement();
			break;
		}
	}

	public void wEntity_(EntityDescriptor<?> entityDesc) {
		switch (entityDesc.getOrdinal()) {
		case MJCFlowEntityDescriptorEnum.UnlessStatement_ord:
			specificBuilder.UnlessStatement_();
			break;
		}
	}

	public void _wEntity(EntityDescriptor<?> entityDesc) {
		switch (entityDesc.getOrdinal()) {
		case MJCFlowEntityDescriptorEnum.UnlessStatement_ord:
			specificBuilder._UnlessStatement();
			break;
		}
	}
}
