package org.whole.crossexamples.lwc16.minijava.reflect;

import org.whole.lang.templates.AbstractTemplateManager;
import org.whole.lang.templates.AbstractTemplateFactory;
import org.whole.crossexamples.lwc16.minijava.model.Program;
import org.whole.lang.factories.GenericEntityFactory;

/** 
 * @generator Whole
 */
public class MiniJavaTemplateManager extends AbstractTemplateManager {
	private static class SingletonHolder {
		private static final MiniJavaTemplateManager instance = new MiniJavaTemplateManager();
	}

	public static MiniJavaTemplateManager instance() {
		return SingletonHolder.instance;
	}

	private MiniJavaTemplateManager() {
		put("empty", new AbstractTemplateFactory<Program>() {
			public Program create() {
				return GenericEntityFactory.instance.create(MiniJavaEntityDescriptorEnum.Program);
			}
		});
	}
}
