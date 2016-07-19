package org.whole.crossexamples.lwc16.metadata.builders;

import org.whole.lang.builders.GenericIdentityBuilder;
import org.whole.lang.contexts.IEntityContext;
import org.whole.lang.reflect.FeatureDescriptor;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataFeatureDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class MetadataGenericBuilderAdapter extends GenericIdentityBuilder {
	private IMetadataBuilder specificBuilder;

	public MetadataGenericBuilderAdapter(IMetadataBuilder specificBuilder) {
		this.specificBuilder = specificBuilder;
	}

	public MetadataGenericBuilderAdapter(IMetadataBuilder specificBuilder, IEntityContext entityContext) {
		this(specificBuilder);
		wSetEntityContext(entityContext);
	}

	public void visit() {
	}

	public void wFeature(FeatureDescriptor featureDesc) {
		switch (featureDesc.getOrdinal()) {
		case MetadataFeatureDescriptorEnum.annotable_ord:
			specificBuilder.annotable();
			break;
		case MetadataFeatureDescriptorEnum.annotations_ord:
			specificBuilder.annotations();
			break;
		case MetadataFeatureDescriptorEnum.major_ord:
			specificBuilder.major();
			break;
		case MetadataFeatureDescriptorEnum.minor_ord:
			specificBuilder.minor();
			break;
		case MetadataFeatureDescriptorEnum.paragraphs_ord:
			specificBuilder.paragraphs();
			break;
		}
	}

	public void wEntity(EntityDescriptor<?> entityDesc) {
		switch (entityDesc.getOrdinal()) {
		case MetadataEntityDescriptorEnum.Metadata_ord:
			specificBuilder.Metadata();
			break;
		case MetadataEntityDescriptorEnum.Annotations_ord:
			specificBuilder.Annotations();
			break;
		case MetadataEntityDescriptorEnum.Revision_ord:
			specificBuilder.Revision();
			break;
		case MetadataEntityDescriptorEnum.Comment_ord:
			specificBuilder.Comment();
			break;
		case MetadataEntityDescriptorEnum.Paragraphs_ord:
			specificBuilder.Paragraphs();
			break;
		case MetadataEntityDescriptorEnum.Paragraph_ord:
			specificBuilder.Paragraph();
			break;
		}
	}

	public void wEntity_(EntityDescriptor<?> entityDesc) {
		switch (entityDesc.getOrdinal()) {
		case MetadataEntityDescriptorEnum.Metadata_ord:
			specificBuilder.Metadata_();
			break;
		case MetadataEntityDescriptorEnum.Annotations_ord:
			specificBuilder.Annotations_();
			break;
		case MetadataEntityDescriptorEnum.Revision_ord:
			specificBuilder.Revision_();
			break;
		case MetadataEntityDescriptorEnum.Comment_ord:
			specificBuilder.Comment_();
			break;
		case MetadataEntityDescriptorEnum.Paragraphs_ord:
			specificBuilder.Paragraphs_();
			break;
		case MetadataEntityDescriptorEnum.Paragraph_ord:
			specificBuilder.Paragraph_();
			break;
		}
	}

	public void _wEntity(EntityDescriptor<?> entityDesc) {
		switch (entityDesc.getOrdinal()) {
		case MetadataEntityDescriptorEnum.Metadata_ord:
			specificBuilder._Metadata();
			break;
		case MetadataEntityDescriptorEnum.Annotations_ord:
			specificBuilder._Annotations();
			break;
		case MetadataEntityDescriptorEnum.Revision_ord:
			specificBuilder._Revision();
			break;
		case MetadataEntityDescriptorEnum.Comment_ord:
			specificBuilder._Comment();
			break;
		case MetadataEntityDescriptorEnum.Paragraphs_ord:
			specificBuilder._Paragraphs();
			break;
		case MetadataEntityDescriptorEnum.Paragraph_ord:
			specificBuilder._Paragraph();
			break;
		}
	}

	public void wEntity_(EntityDescriptor<?> entityDesc, int initialCapacity) {
		switch (entityDesc.getOrdinal()) {
		case MetadataEntityDescriptorEnum.Annotations_ord:
			specificBuilder.Annotations_(initialCapacity);
			break;
		case MetadataEntityDescriptorEnum.Paragraphs_ord:
			specificBuilder.Paragraphs_(initialCapacity);
			break;
		case MetadataEntityDescriptorEnum.Paragraph_ord:
			specificBuilder.Paragraph_(initialCapacity);
			break;
		}
	}

	public void wEntity(EntityDescriptor<?> entityDesc, String value) {
		switch (entityDesc.getOrdinal()) {
		case MetadataEntityDescriptorEnum.Author_ord:
			specificBuilder.Author(value);
			break;
		case MetadataEntityDescriptorEnum.Text_ord:
			specificBuilder.Text(value);
			break;
		}
	}

	public void wEntity(EntityDescriptor<?> entityDesc, int value) {
		switch (entityDesc.getOrdinal()) {
		case MetadataEntityDescriptorEnum.Number_ord:
			specificBuilder.Number(value);
			break;
		}
	}
}
