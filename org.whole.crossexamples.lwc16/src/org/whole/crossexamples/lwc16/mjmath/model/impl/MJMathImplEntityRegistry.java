package org.whole.crossexamples.lwc16.mjmath.model.impl;

import org.whole.lang.factories.AbstractEntityRegistry;
import org.whole.crossexamples.lwc16.mjmath.reflect.MJMathEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class MJMathImplEntityRegistry extends AbstractEntityRegistry {
	public MJMathImplEntityRegistry() {
		super(MJMathEntityDescriptorEnum.instance);
	}

	protected void createPrototypes() {
		put(new SummationImpl());
	}
}
