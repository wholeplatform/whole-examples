package org.whole.crossexamples.lwc16.mjcflow.reflect;

import org.whole.lang.reflect.AbstractLanguageKit;
import org.whole.lang.reflect.EntityDescriptorEnum;
import org.whole.lang.reflect.FeatureDescriptorEnum;
import org.whole.lang.factories.IEntityRegistry;
import org.whole.crossexamples.lwc16.mjcflow.model.impl.MJCFlowImplEntityRegistry;
import org.whole.crossexamples.lwc16.mjcflow.model.impl.MJCFlowStrictImplEntityRegistry;
import org.whole.crossexamples.lwc16.mjcflow.model.adapters.MJCFlowAdaptersEntityRegistry;
import org.whole.lang.templates.ITemplateManager;

/** 
 * @generator Whole
 */
public class MJCFlowLanguageKit extends AbstractLanguageKit {
	public static final String URI = "whole:org.whole.crossexamples.lwc16.mjcflow:MiniJavaControlFlowExtensionModel";

	public String getURI() {
		return URI;
	}

	public String getNamespace() {
		return "org.whole.crossexamples.lwc16.mjcflow";
	}

	public String getName() {
		return "MJCFlow";
	}

	public EntityDescriptorEnum getEntityDescriptorEnum() {
		return MJCFlowEntityDescriptorEnum.instance;
	}

	public FeatureDescriptorEnum getFeatureDescriptorEnum() {
		return MJCFlowFeatureDescriptorEnum.instance;
	}

	protected IEntityRegistry createImplEntityRegistry() {
		return new MJCFlowImplEntityRegistry();
	}

	protected IEntityRegistry createStrictImplEntityRegistry() {
		return new MJCFlowStrictImplEntityRegistry();
	}

	protected IEntityRegistry createAdaptersEntityRegistry() {
		return new MJCFlowAdaptersEntityRegistry();
	}

	public ITemplateManager getTemplateManager() {
		return MJCFlowTemplateManager.instance();
	}
}
