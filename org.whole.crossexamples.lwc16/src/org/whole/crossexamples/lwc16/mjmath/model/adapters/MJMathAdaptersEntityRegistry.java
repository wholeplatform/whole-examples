package org.whole.crossexamples.lwc16.mjmath.model.adapters;

import org.whole.lang.factories.AbstractEntityRegistry;
import org.whole.crossexamples.lwc16.mjmath.reflect.MJMathEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class MJMathAdaptersEntityRegistry extends AbstractEntityRegistry {
	public MJMathAdaptersEntityRegistry() {
		super(MJMathEntityDescriptorEnum.instance);
	}

	protected void createPrototypes() {
		put(new SummationAdapter());
		put(new IdentifierAdapter());
		put(new ExpressionAdapter());
	}
}
