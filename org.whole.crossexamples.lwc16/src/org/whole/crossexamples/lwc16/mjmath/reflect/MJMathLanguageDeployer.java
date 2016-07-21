package org.whole.crossexamples.lwc16.mjmath.reflect;

import org.whole.lang.reflect.AbstractLanguageDeployer;
import org.whole.lang.reflect.ReflectionFactory;
import org.whole.lang.builders.IBuilderFactory;
import org.whole.lang.builders.IBuilder;
import org.whole.lang.contexts.IEntityContext;
import org.whole.crossexamples.lwc16.mjmath.builders.IMJMathBuilder;
import org.whole.crossexamples.lwc16.mjmath.builders.MJMathGenericBuilderAdapter;
import org.whole.lang.builders.GenericBuilderAdapterOperation;
import org.whole.crossexamples.lwc16.mjmath.builders.MJMathSpecificBuilderAdapter;
import org.whole.lang.builders.SpecificBuilderAdapterOperation;

/** 
 * @generator Whole
 */
public class MJMathLanguageDeployer extends AbstractLanguageDeployer {
	public void deploy(ReflectionFactory platform) {
		platform.addLanguageKit(new MJMathLanguageKit());
		platform.addOperationFactory(MJMathLanguageKit.URI, GenericBuilderAdapterOperation.ID, new IBuilderFactory() {
			public IBuilder create(IBuilder strategy, IEntityContext entityContext) {
				return new MJMathGenericBuilderAdapter((IMJMathBuilder) strategy, entityContext);
			}
		});
		platform.addOperationFactory(MJMathLanguageKit.URI, SpecificBuilderAdapterOperation.ID, new IBuilderFactory() {
			public IBuilder create(IBuilder strategy, IEntityContext entityContext) {
				return new MJMathSpecificBuilderAdapter(strategy, entityContext);
			}
		});
	}

	public void undeploy(ReflectionFactory platform) {
		platform.removeLanguageKit(MJMathLanguageKit.URI);
	}
}
