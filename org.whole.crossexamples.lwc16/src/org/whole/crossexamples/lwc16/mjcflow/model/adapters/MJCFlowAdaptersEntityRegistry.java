package org.whole.crossexamples.lwc16.mjcflow.model.adapters;

import org.whole.lang.factories.AbstractEntityRegistry;
import org.whole.crossexamples.lwc16.mjcflow.reflect.MJCFlowEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class MJCFlowAdaptersEntityRegistry extends AbstractEntityRegistry {
	public MJCFlowAdaptersEntityRegistry() {
		super(MJCFlowEntityDescriptorEnum.instance);
	}

	protected void createPrototypes() {
		put(new UnlessStatementAdapter());
		put(new ExpressionAdapter());
		put(new StatementAdapter());
	}
}
