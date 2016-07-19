package org.whole.crossexamples.lwc16.metadata.reflect;

import org.whole.lang.reflect.AbstractLanguageKit;
import org.whole.lang.reflect.EntityDescriptorEnum;
import org.whole.lang.reflect.FeatureDescriptorEnum;
import org.whole.lang.factories.IEntityRegistry;
import org.whole.crossexamples.lwc16.metadata.model.impl.MetadataImplEntityRegistry;
import org.whole.crossexamples.lwc16.metadata.model.impl.MetadataStrictImplEntityRegistry;
import org.whole.crossexamples.lwc16.metadata.model.adapters.MetadataAdaptersEntityRegistry;
import org.whole.lang.templates.ITemplateManager;

/** 
 * @generator Whole
 */
public class MetadataLanguageKit extends AbstractLanguageKit {
	public static final String URI = "whole:org.whole.crossexamples.lwc16.metadata:MetadataModel";

	public String getURI() {
		return URI;
	}

	public String getNamespace() {
		return "org.whole.crossexamples.lwc16.metadata";
	}

	public String getName() {
		return "Metadata";
	}

	public EntityDescriptorEnum getEntityDescriptorEnum() {
		return MetadataEntityDescriptorEnum.instance;
	}

	public FeatureDescriptorEnum getFeatureDescriptorEnum() {
		return MetadataFeatureDescriptorEnum.instance;
	}

	protected IEntityRegistry createImplEntityRegistry() {
		return new MetadataImplEntityRegistry();
	}

	protected IEntityRegistry createStrictImplEntityRegistry() {
		return new MetadataStrictImplEntityRegistry();
	}

	protected IEntityRegistry createAdaptersEntityRegistry() {
		return new MetadataAdaptersEntityRegistry();
	}

	public ITemplateManager getTemplateManager() {
		return MetadataTemplateManager.instance();
	}
}
