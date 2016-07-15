package org.whole.crossexamples.lwc16.minijava.reflect;

import org.whole.lang.reflect.AbstractLanguageDeployer;
import org.whole.lang.reflect.ReflectionFactory;
import org.whole.lang.builders.IBuilderFactory;
import org.whole.lang.builders.IBuilder;
import org.whole.lang.contexts.IEntityContext;
import org.whole.crossexamples.lwc16.minijava.builders.IMiniJavaBuilder;
import org.whole.crossexamples.lwc16.minijava.builders.MiniJavaGenericBuilderAdapter;
import org.whole.lang.builders.GenericBuilderAdapterOperation;
import org.whole.crossexamples.lwc16.minijava.builders.MiniJavaSpecificBuilderAdapter;
import org.whole.lang.builders.SpecificBuilderAdapterOperation;

/** 
 * @generator Whole
 */
public class MiniJavaLanguageDeployer extends AbstractLanguageDeployer {
	public void deploy(ReflectionFactory platform) {
		platform.addLanguageKit(new MiniJavaLanguageKit());
		platform.addOperationFactory(MiniJavaLanguageKit.URI, GenericBuilderAdapterOperation.ID, new IBuilderFactory() {
			public IBuilder create(IBuilder strategy, IEntityContext entityContext) {
				return new MiniJavaGenericBuilderAdapter((IMiniJavaBuilder) strategy, entityContext);
			}
		});
		platform.addOperationFactory(MiniJavaLanguageKit.URI, SpecificBuilderAdapterOperation.ID,
				new IBuilderFactory() {
					public IBuilder create(IBuilder strategy, IEntityContext entityContext) {
						return new MiniJavaSpecificBuilderAdapter(strategy, entityContext);
					}
				});
	}

	public void undeploy(ReflectionFactory platform) {
		platform.removeLanguageKit(MiniJavaLanguageKit.URI);
	}
}
