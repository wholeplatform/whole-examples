package org.whole.crossexamples.lwc16.metadata.reflect;

import org.whole.lang.reflect.AbstractLanguageDeployer;
import org.whole.lang.reflect.ReflectionFactory;
import org.whole.lang.builders.IBuilderFactory;
import org.whole.lang.builders.IBuilder;
import org.whole.lang.contexts.IEntityContext;
import org.whole.crossexamples.lwc16.metadata.builders.IMetadataBuilder;
import org.whole.crossexamples.lwc16.metadata.builders.MetadataGenericBuilderAdapter;
import org.whole.lang.builders.GenericBuilderAdapterOperation;
import org.whole.crossexamples.lwc16.metadata.builders.MetadataSpecificBuilderAdapter;
import org.whole.lang.builders.SpecificBuilderAdapterOperation;

/** 
 * @generator Whole
 */
public class MetadataLanguageDeployer extends AbstractLanguageDeployer {
	public void deploy(ReflectionFactory platform) {
		platform.addLanguageKit(new MetadataLanguageKit());
		platform.addOperationFactory(MetadataLanguageKit.URI, GenericBuilderAdapterOperation.ID, new IBuilderFactory() {
			public IBuilder create(IBuilder strategy, IEntityContext entityContext) {
				return new MetadataGenericBuilderAdapter((IMetadataBuilder) strategy, entityContext);
			}
		});
		platform.addOperationFactory(MetadataLanguageKit.URI, SpecificBuilderAdapterOperation.ID,
				new IBuilderFactory() {
					public IBuilder create(IBuilder strategy, IEntityContext entityContext) {
						return new MetadataSpecificBuilderAdapter(strategy, entityContext);
					}
				});
	}

	public void undeploy(ReflectionFactory platform) {
		platform.removeLanguageKit(MetadataLanguageKit.URI);
	}
}
