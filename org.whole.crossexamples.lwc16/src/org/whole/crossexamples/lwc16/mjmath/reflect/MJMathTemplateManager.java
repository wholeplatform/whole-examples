package org.whole.crossexamples.lwc16.mjmath.reflect;

import org.whole.lang.templates.AbstractTemplateManager;
import org.whole.lang.templates.AbstractTemplateFactory;
import org.whole.crossexamples.lwc16.mjmath.model.Summation;
import org.whole.lang.factories.GenericEntityFactory;

/** 
 * @generator Whole
 */
public class MJMathTemplateManager extends AbstractTemplateManager {
	private static class SingletonHolder {
		private static final MJMathTemplateManager instance = new MJMathTemplateManager();
	}

	public static MJMathTemplateManager instance() {
		return SingletonHolder.instance;
	}

	private MJMathTemplateManager() {
		put("empty", new AbstractTemplateFactory<Summation>() {
			public Summation create() {
				return GenericEntityFactory.instance.create(MJMathEntityDescriptorEnum.Summation);
			}
		});
	}
}
