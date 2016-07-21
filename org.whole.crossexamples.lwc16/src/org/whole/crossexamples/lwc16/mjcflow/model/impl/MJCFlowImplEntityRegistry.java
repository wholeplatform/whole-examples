package org.whole.crossexamples.lwc16.mjcflow.model.impl;

import org.whole.lang.factories.AbstractEntityRegistry;
import org.whole.crossexamples.lwc16.mjcflow.reflect.MJCFlowEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class MJCFlowImplEntityRegistry extends AbstractEntityRegistry {
	public MJCFlowImplEntityRegistry() {
		super(MJCFlowEntityDescriptorEnum.instance);
	}

	protected void createPrototypes() {
		put(new UnlessStatementImpl());
	}
}
