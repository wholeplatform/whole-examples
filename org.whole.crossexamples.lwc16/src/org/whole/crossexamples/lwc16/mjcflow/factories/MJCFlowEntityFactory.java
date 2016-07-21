package org.whole.crossexamples.lwc16.mjcflow.factories;

import org.whole.lang.factories.GenericEntityFactory;
import org.whole.crossexamples.lwc16.mjcflow.model.*;
import org.whole.lang.factories.RegistryConfigurations;
import org.whole.lang.factories.IEntityRegistryProvider;
import org.whole.crossexamples.lwc16.mjcflow.reflect.MJCFlowEntityDescriptorEnum;
import org.whole.lang.factories.IEntityBuilder;
import org.whole.lang.factories.EntityBuilder;

/** 
 * @generator Whole
 */
public class MJCFlowEntityFactory extends GenericEntityFactory {
	public static final MJCFlowEntityFactory instance = instance(RegistryConfigurations.DEFAULT);

	public static MJCFlowEntityFactory instance(IEntityRegistryProvider provider) {
		return new MJCFlowEntityFactory(provider);
	}

	protected MJCFlowEntityFactory(IEntityRegistryProvider provider) {
		super(provider);
	}

	public UnlessStatement createUnlessStatement() {
		return create(MJCFlowEntityDescriptorEnum.UnlessStatement);
	}

	public UnlessStatement createUnlessStatement(Expression expression, Statement statement) {
		return create(MJCFlowEntityDescriptorEnum.UnlessStatement, expression, statement);
	}

	public IEntityBuilder<UnlessStatement> buildUnlessStatement() {
		return new EntityBuilder<UnlessStatement>(create(MJCFlowEntityDescriptorEnum.UnlessStatement));
	}
}
