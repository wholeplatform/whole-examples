package org.whole.crossexamples.lwc16.metadata.builders;

import org.whole.lang.builders.GenericBuilderContext;
import org.whole.lang.builders.IBuilder;
import org.whole.lang.contexts.IEntityContext;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataFeatureDescriptorEnum;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class MetadataSpecificBuilderAdapter extends GenericBuilderContext implements IMetadataBuilder {
	public MetadataSpecificBuilderAdapter(IBuilder strategy) {
		super(strategy);
	}

	public MetadataSpecificBuilderAdapter(IBuilder strategy, IEntityContext entityContext) {
		super(strategy, entityContext);
	}

	public void paragraphs() {
		wFeature(MetadataFeatureDescriptorEnum.paragraphs);
	}

	public void minor() {
		wFeature(MetadataFeatureDescriptorEnum.minor);
	}

	public void major() {
		wFeature(MetadataFeatureDescriptorEnum.major);
	}

	public void annotations() {
		wFeature(MetadataFeatureDescriptorEnum.annotations);
	}

	public void annotable() {
		wFeature(MetadataFeatureDescriptorEnum.annotable);
	}

	public void visit() {
	}

	public void Metadata() {
		wEntity(MetadataEntityDescriptorEnum.Metadata);
	}

	public void Metadata_() {
		wEntity_(MetadataEntityDescriptorEnum.Metadata);
	}

	public void _Metadata() {
		_wEntity(MetadataEntityDescriptorEnum.Metadata);
	}

	public void Annotations() {
		wEntity(MetadataEntityDescriptorEnum.Annotations);
	}

	public void Annotations_() {
		wEntity_(MetadataEntityDescriptorEnum.Annotations);
	}

	public void Annotations_(int initialCapacity) {
		wEntity_(MetadataEntityDescriptorEnum.Annotations, initialCapacity);
	}

	public void _Annotations() {
		_wEntity(MetadataEntityDescriptorEnum.Annotations);
	}

	public void Author() {
		wEntity(MetadataEntityDescriptorEnum.Author);
	}

	public void Author(String value) {
		wEntity(MetadataEntityDescriptorEnum.Author, value);
	}

	public void Revision() {
		wEntity(MetadataEntityDescriptorEnum.Revision);
	}

	public void Revision_() {
		wEntity_(MetadataEntityDescriptorEnum.Revision);
	}

	public void _Revision() {
		_wEntity(MetadataEntityDescriptorEnum.Revision);
	}

	public void Number() {
		wEntity(MetadataEntityDescriptorEnum.Number);
	}

	public void Number(int value) {
		wEntity(MetadataEntityDescriptorEnum.Number, value);
	}

	public void Comment() {
		wEntity(MetadataEntityDescriptorEnum.Comment);
	}

	public void Comment_() {
		wEntity_(MetadataEntityDescriptorEnum.Comment);
	}

	public void _Comment() {
		_wEntity(MetadataEntityDescriptorEnum.Comment);
	}

	public void Paragraphs() {
		wEntity(MetadataEntityDescriptorEnum.Paragraphs);
	}

	public void Paragraphs_() {
		wEntity_(MetadataEntityDescriptorEnum.Paragraphs);
	}

	public void Paragraphs_(int initialCapacity) {
		wEntity_(MetadataEntityDescriptorEnum.Paragraphs, initialCapacity);
	}

	public void _Paragraphs() {
		_wEntity(MetadataEntityDescriptorEnum.Paragraphs);
	}

	public void Paragraph() {
		wEntity(MetadataEntityDescriptorEnum.Paragraph);
	}

	public void Paragraph_() {
		wEntity_(MetadataEntityDescriptorEnum.Paragraph);
	}

	public void Paragraph_(int initialCapacity) {
		wEntity_(MetadataEntityDescriptorEnum.Paragraph, initialCapacity);
	}

	public void _Paragraph() {
		_wEntity(MetadataEntityDescriptorEnum.Paragraph);
	}

	public void Text() {
		wEntity(MetadataEntityDescriptorEnum.Text);
	}

	public void Text(String value) {
		wEntity(MetadataEntityDescriptorEnum.Text, value);
	}
}
