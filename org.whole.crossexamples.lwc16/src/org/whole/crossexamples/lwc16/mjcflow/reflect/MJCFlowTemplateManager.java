package org.whole.crossexamples.lwc16.mjcflow.reflect;

import org.whole.lang.templates.AbstractTemplateManager;
import org.whole.lang.templates.AbstractTemplateFactory;
import org.whole.crossexamples.lwc16.mjcflow.model.UnlessStatement;
import org.whole.lang.factories.GenericEntityFactory;

/** 
 * @generator Whole
 */
public class MJCFlowTemplateManager extends AbstractTemplateManager {
	private static class SingletonHolder {
		private static final MJCFlowTemplateManager instance = new MJCFlowTemplateManager();
	}

	public static MJCFlowTemplateManager instance() {
		return SingletonHolder.instance;
	}

	private MJCFlowTemplateManager() {
		put("empty", new AbstractTemplateFactory<UnlessStatement>() {
			public UnlessStatement create() {
				return GenericEntityFactory.instance.create(MJCFlowEntityDescriptorEnum.UnlessStatement);
			}
		});
	}
}
