package org.whole.crossexamples.lwc16.metadata.factories;

import org.whole.lang.factories.GenericEntityFactory;
import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.lang.factories.RegistryConfigurations;
import org.whole.lang.factories.IEntityRegistryProvider;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;
import org.whole.lang.factories.IEntityBuilder;
import org.whole.lang.factories.EntityBuilder;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.metadata.model.Number;

/** 
 * @generator Whole
 */
public class MetadataEntityFactory extends GenericEntityFactory {
	public static final MetadataEntityFactory instance = instance(RegistryConfigurations.DEFAULT);

	public static MetadataEntityFactory instance(IEntityRegistryProvider provider) {
		return new MetadataEntityFactory(provider);
	}

	protected MetadataEntityFactory(IEntityRegistryProvider provider) {
		super(provider);
	}

	public Metadata createMetadata() {
		return create(MetadataEntityDescriptorEnum.Metadata);
	}

	public Metadata createMetadata(Annotable annotable, Annotations annotations) {
		return create(MetadataEntityDescriptorEnum.Metadata, annotable, annotations);
	}

	public IEntityBuilder<Metadata> buildMetadata() {
		return new EntityBuilder<Metadata>(create(MetadataEntityDescriptorEnum.Metadata));
	}

	public Annotations createAnnotations() {
		return create(MetadataEntityDescriptorEnum.Annotations);
	}

	public Annotations createAnnotations(Annotation... entities) {
		return create(MetadataEntityDescriptorEnum.Annotations, (IEntity[]) entities);
	}

	public Annotations createAnnotations(int initialSize) {
		return clone(MetadataEntityDescriptorEnum.Annotations, initialSize);
	}

	public Author createAuthor() {
		return create(MetadataEntityDescriptorEnum.Author);
	}

	public Author createAuthor(String value) {
		return create(MetadataEntityDescriptorEnum.Author, value);
	}

	public Revision createRevision() {
		return create(MetadataEntityDescriptorEnum.Revision);
	}

	public Revision createRevision(Number major, Number minor) {
		return create(MetadataEntityDescriptorEnum.Revision, major, minor);
	}

	public IEntityBuilder<Revision> buildRevision() {
		return new EntityBuilder<Revision>(create(MetadataEntityDescriptorEnum.Revision));
	}

	public Number createNumber() {
		return create(MetadataEntityDescriptorEnum.Number);
	}

	public Number createNumber(int value) {
		return create(MetadataEntityDescriptorEnum.Number, value);
	}

	public Comment createComment() {
		return create(MetadataEntityDescriptorEnum.Comment);
	}

	public Comment createComment(Paragraphs paragraphs) {
		return create(MetadataEntityDescriptorEnum.Comment, paragraphs);
	}

	public Paragraphs createParagraphs() {
		return create(MetadataEntityDescriptorEnum.Paragraphs);
	}

	public Paragraphs createParagraphs(Paragraph... entities) {
		return create(MetadataEntityDescriptorEnum.Paragraphs, (IEntity[]) entities);
	}

	public Paragraphs createParagraphs(int initialSize) {
		return clone(MetadataEntityDescriptorEnum.Paragraphs, initialSize);
	}

	public Paragraph createParagraph() {
		return create(MetadataEntityDescriptorEnum.Paragraph);
	}

	public Paragraph createParagraph(IText... entities) {
		return create(MetadataEntityDescriptorEnum.Paragraph, (IEntity[]) entities);
	}

	public Paragraph createParagraph(int initialSize) {
		return clone(MetadataEntityDescriptorEnum.Paragraph, initialSize);
	}

	public Text createText() {
		return create(MetadataEntityDescriptorEnum.Text);
	}

	public Text createText(String value) {
		return create(MetadataEntityDescriptorEnum.Text, value);
	}
}
