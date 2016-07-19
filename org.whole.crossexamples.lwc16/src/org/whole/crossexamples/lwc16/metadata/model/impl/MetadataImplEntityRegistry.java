package org.whole.crossexamples.lwc16.metadata.model.impl;

import org.whole.lang.factories.AbstractEntityRegistry;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class MetadataImplEntityRegistry extends AbstractEntityRegistry {
	public MetadataImplEntityRegistry() {
		super(MetadataEntityDescriptorEnum.instance);
	}

	protected void createPrototypes() {
		put(new MetadataImpl());
		put(new AnnotationsImpl());
		put(new AuthorImpl());
		put(new RevisionImpl());
		put(new NumberImpl());
		put(new CommentImpl());
		put(new ParagraphsImpl());
		put(new ParagraphImpl());
		put(new TextImpl());
	}
}
