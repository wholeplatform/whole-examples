package org.whole.crossexamples.lwc16.metadata.reflect;

import org.whole.lang.templates.AbstractTemplateManager;
import org.whole.lang.templates.AbstractTemplateFactory;
import org.whole.crossexamples.lwc16.metadata.model.Metadata;
import org.whole.lang.factories.GenericEntityFactory;

/** 
 * @generator Whole
 */
public class MetadataTemplateManager extends AbstractTemplateManager {
	private static class SingletonHolder {
		private static final MetadataTemplateManager instance = new MetadataTemplateManager();
	}

	public static MetadataTemplateManager instance() {
		return SingletonHolder.instance;
	}

	private MetadataTemplateManager() {
		put("empty", new AbstractTemplateFactory<Metadata>() {
			public Metadata create() {
				return GenericEntityFactory.instance.create(MetadataEntityDescriptorEnum.Metadata);
			}
		});
	}
}
