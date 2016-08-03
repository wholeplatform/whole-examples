package org.whole.crossexamples.lwc16.mjmath.reflect;

import org.whole.lang.reflect.AbstractLanguageKit;
import org.whole.lang.reflect.EntityDescriptorEnum;
import org.whole.lang.reflect.FeatureDescriptorEnum;
import org.whole.lang.factories.IEntityRegistry;
import org.whole.crossexamples.lwc16.mjmath.model.impl.MJMathImplEntityRegistry;
import org.whole.crossexamples.lwc16.mjmath.model.impl.MJMathStrictImplEntityRegistry;
import org.whole.crossexamples.lwc16.mjmath.model.adapters.MJMathAdaptersEntityRegistry;
import org.whole.lang.templates.ITemplateManager;

/** 
 * @generator Whole
 */
public class MJMathLanguageKit extends AbstractLanguageKit {
	public static final String URI = "whole:org.whole.crossexamples.lwc16.mjmath:MJMathExtensionModel";

	public String getURI() {
		return URI;
	}

	public String getNamespace() {
		return "org.whole.crossexamples.lwc16.mjmath";
	}

	public String getName() {
		return "MJMath";
	}

	public EntityDescriptorEnum getEntityDescriptorEnum() {
		return MJMathEntityDescriptorEnum.instance;
	}

	public FeatureDescriptorEnum getFeatureDescriptorEnum() {
		return MJMathFeatureDescriptorEnum.instance;
	}

	protected IEntityRegistry createImplEntityRegistry() {
		return new MJMathImplEntityRegistry();
	}

	protected IEntityRegistry createStrictImplEntityRegistry() {
		return new MJMathStrictImplEntityRegistry();
	}

	protected IEntityRegistry createAdaptersEntityRegistry() {
		return new MJMathAdaptersEntityRegistry();
	}

	public ITemplateManager getTemplateManager() {
		return MJMathTemplateManager.instance();
	}
}
