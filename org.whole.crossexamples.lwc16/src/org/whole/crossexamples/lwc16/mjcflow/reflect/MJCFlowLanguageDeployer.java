package org.whole.crossexamples.lwc16.mjcflow.reflect;

import org.whole.lang.reflect.AbstractLanguageDeployer;
import org.whole.lang.reflect.ReflectionFactory;
import org.whole.lang.builders.IBuilderFactory;
import org.whole.lang.builders.IBuilder;
import org.whole.lang.contexts.IEntityContext;
import org.whole.crossexamples.lwc16.mjcflow.builders.IMJCFlowBuilder;
import org.whole.crossexamples.lwc16.mjcflow.builders.MJCFlowGenericBuilderAdapter;
import org.whole.lang.builders.GenericBuilderAdapterOperation;
import org.whole.crossexamples.lwc16.mjcflow.builders.MJCFlowSpecificBuilderAdapter;
import org.whole.lang.builders.SpecificBuilderAdapterOperation;

/** 
 * @generator Whole
 */
public class MJCFlowLanguageDeployer extends AbstractLanguageDeployer {
	public void deploy(ReflectionFactory platform) {
		platform.addLanguageKit(new MJCFlowLanguageKit());
		platform.addOperationFactory(MJCFlowLanguageKit.URI, GenericBuilderAdapterOperation.ID, new IBuilderFactory() {
			public IBuilder create(IBuilder strategy, IEntityContext entityContext) {
				return new MJCFlowGenericBuilderAdapter((IMJCFlowBuilder) strategy, entityContext);
			}
		});
		platform.addOperationFactory(MJCFlowLanguageKit.URI, SpecificBuilderAdapterOperation.ID, new IBuilderFactory() {
			public IBuilder create(IBuilder strategy, IEntityContext entityContext) {
				return new MJCFlowSpecificBuilderAdapter(strategy, entityContext);
			}
		});
	}

	public void undeploy(ReflectionFactory platform) {
		platform.removeLanguageKit(MJCFlowLanguageKit.URI);
	}
}
