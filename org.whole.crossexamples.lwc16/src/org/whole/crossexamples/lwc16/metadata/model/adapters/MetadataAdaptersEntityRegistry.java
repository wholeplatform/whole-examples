package org.whole.crossexamples.lwc16.metadata.model.adapters;

import org.whole.lang.factories.AbstractEntityRegistry;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class MetadataAdaptersEntityRegistry extends AbstractEntityRegistry {
	public MetadataAdaptersEntityRegistry() {
		super(MetadataEntityDescriptorEnum.instance);
	}

	protected void createPrototypes() {
		put(new AnnotableAdapter());
		put(new MetadataAdapter());
		put(new AnnotationsAdapter());
		put(new AnnotationAdapter());
		put(new AuthorAdapter());
		put(new RevisionAdapter());
		put(new NumberAdapter());
		put(new CommentAdapter());
		put(new ParagraphsAdapter());
		put(new ParagraphAdapter());
		put(new TextAdapter());
		put(new ITextAdapter());
	}
}
