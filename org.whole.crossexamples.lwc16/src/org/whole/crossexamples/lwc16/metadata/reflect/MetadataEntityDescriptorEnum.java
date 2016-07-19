package org.whole.crossexamples.lwc16.metadata.reflect;

import org.whole.lang.reflect.EntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.crossexamples.lwc16.metadata.model.Number;

/** 
 * @generator Whole
 */
@SuppressWarnings("unchecked")
public class MetadataEntityDescriptorEnum extends EntityDescriptorEnum {
	public static final int Annotable_ord = 0;
	public static final int Metadata_ord = 1;
	public static final int Annotations_ord = 2;
	public static final int Annotation_ord = 3;
	public static final int Author_ord = 4;
	public static final int Revision_ord = 5;
	public static final int Number_ord = 6;
	public static final int Comment_ord = 7;
	public static final int Paragraphs_ord = 8;
	public static final int Paragraph_ord = 9;
	public static final int Text_ord = 10;
	public static final int IText_ord = 11;
	public static final MetadataEntityDescriptorEnum instance = new MetadataEntityDescriptorEnum();
	public static final EntityDescriptor<Annotable> Annotable = (EntityDescriptor<Annotable>) instance
			.valueOf(Annotable_ord);
	public static final EntityDescriptor<Metadata> Metadata = (EntityDescriptor<Metadata>) instance
			.valueOf(Metadata_ord);
	public static final EntityDescriptor<Annotations> Annotations = (EntityDescriptor<Annotations>) instance
			.valueOf(Annotations_ord);
	public static final EntityDescriptor<Annotation> Annotation = (EntityDescriptor<Annotation>) instance
			.valueOf(Annotation_ord);
	public static final EntityDescriptor<Author> Author = (EntityDescriptor<Author>) instance.valueOf(Author_ord);
	public static final EntityDescriptor<Revision> Revision = (EntityDescriptor<Revision>) instance
			.valueOf(Revision_ord);
	public static final EntityDescriptor<Number> Number = (EntityDescriptor<Number>) instance.valueOf(Number_ord);
	public static final EntityDescriptor<Comment> Comment = (EntityDescriptor<Comment>) instance.valueOf(Comment_ord);
	public static final EntityDescriptor<Paragraphs> Paragraphs = (EntityDescriptor<Paragraphs>) instance
			.valueOf(Paragraphs_ord);
	public static final EntityDescriptor<Paragraph> Paragraph = (EntityDescriptor<Paragraph>) instance
			.valueOf(Paragraph_ord);
	public static final EntityDescriptor<Text> Text = (EntityDescriptor<Text>) instance.valueOf(Text_ord);
	public static final EntityDescriptor<IText> IText = (EntityDescriptor<IText>) instance.valueOf(IText_ord);

	private MetadataEntityDescriptorEnum() {
	}

	private static final long serialVersionUID = 1;

	protected void initEntityDescriptors() {
		putSimpleEntity(Annotable_ord, "Annotable", Annotable.class, true);
		putSimpleEntity(Metadata_ord, "Metadata", Metadata.class, false)
				.withFeature(MetadataFeatureDescriptorEnum.annotable, Annotable_ord)
				.withFeature(MetadataFeatureDescriptorEnum.annotations, Annotations_ord);
		putCompositeEntity(Annotations_ord, "Annotations", Annotations.class, false, Annotation_ord, true, false);
		putSimpleEntity(Annotation_ord, "Annotation", Annotation.class, true, Revision_ord, Comment_ord, Author_ord);
		putDataEntity(Author_ord, "Author", Author.class, false, String.class);
		putSimpleEntity(Revision_ord, "Revision", Revision.class, false)
				.withFeature(MetadataFeatureDescriptorEnum.major, Number_ord)
				.withFeature(MetadataFeatureDescriptorEnum.minor, Number_ord);
		putDataEntity(Number_ord, "Number", Number.class, false, int.class);
		putSimpleEntity(Comment_ord, "Comment", Comment.class, false)
				.withFeature(MetadataFeatureDescriptorEnum.paragraphs, Paragraphs_ord);
		putCompositeEntity(Paragraphs_ord, "Paragraphs", Paragraphs.class, false, Paragraph_ord, true, false);
		putCompositeEntity(Paragraph_ord, "Paragraph", Paragraph.class, false, IText_ord, true, false);
		putDataEntity(Text_ord, "Text", Text.class, false, String.class);
		putSimpleEntity(IText_ord, "IText", IText.class, true, Text_ord);
	}

	protected void initForeignTypeRelations() {
		setAssignableFromAll(true, IText_ord);
		setAssignableFromAll(true, Annotable_ord);
		setAssignableToAll(true, Metadata_ord);
	}
}
