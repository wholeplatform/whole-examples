package org.whole.crossexamples.lwc16.minijava.reflect;

import org.whole.lang.reflect.AbstractLanguageKit;
import org.whole.lang.reflect.EntityDescriptorEnum;
import org.whole.lang.reflect.FeatureDescriptorEnum;
import org.whole.lang.factories.IEntityRegistry;
import org.whole.crossexamples.lwc16.minijava.model.impl.MiniJavaImplEntityRegistry;
import org.whole.crossexamples.lwc16.minijava.model.impl.MiniJavaStrictImplEntityRegistry;
import org.whole.crossexamples.lwc16.minijava.model.adapters.MiniJavaAdaptersEntityRegistry;
import org.whole.lang.templates.ITemplateManager;

/** 
 * @generator Whole
 */
public class MiniJavaLanguageKit extends AbstractLanguageKit {
	public static final String URI = "whole:org.whole.crossexamples.lwc16.minijava:MiniJavaModel";

	public String getURI() {
		return URI;
	}

	public String getNamespace() {
		return "org.whole.crossexamples.lwc16.minijava";
	}

	public String getName() {
		return "MiniJava";
	}

	public EntityDescriptorEnum getEntityDescriptorEnum() {
		return MiniJavaEntityDescriptorEnum.instance;
	}

	public FeatureDescriptorEnum getFeatureDescriptorEnum() {
		return MiniJavaFeatureDescriptorEnum.instance;
	}

	protected IEntityRegistry createImplEntityRegistry() {
		return new MiniJavaImplEntityRegistry();
	}

	protected IEntityRegistry createStrictImplEntityRegistry() {
		return new MiniJavaStrictImplEntityRegistry();
	}

	protected IEntityRegistry createAdaptersEntityRegistry() {
		return new MiniJavaAdaptersEntityRegistry();
	}

	public ITemplateManager getTemplateManager() {
		return MiniJavaTemplateManager.instance();
	}
}
