package org.whole.crossexamples.lwc16.metadata.visitors;

import org.whole.lang.visitors.AbstractVisitor;
import org.whole.crossexamples.lwc16.metadata.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.metadata.model.Number;

/** 
 * @generator Whole
 */
public abstract class MetadataIdentitySwitchVisitor extends AbstractVisitor implements IMetadataVisitor {
	public void visit(IEntity entity) {
		switch (entity.wGetEntityOrd()) {
		case MetadataEntityDescriptorEnum.Metadata_ord:
			visit((Metadata) entity);
			break;
		case MetadataEntityDescriptorEnum.Annotations_ord:
			visit((Annotations) entity);
			break;
		case MetadataEntityDescriptorEnum.Author_ord:
			visit((Author) entity);
			break;
		case MetadataEntityDescriptorEnum.Revision_ord:
			visit((Revision) entity);
			break;
		case MetadataEntityDescriptorEnum.Number_ord:
			visit((Number) entity);
			break;
		case MetadataEntityDescriptorEnum.Comment_ord:
			visit((Comment) entity);
			break;
		case MetadataEntityDescriptorEnum.Paragraphs_ord:
			visit((Paragraphs) entity);
			break;
		case MetadataEntityDescriptorEnum.Paragraph_ord:
			visit((Paragraph) entity);
			break;
		case MetadataEntityDescriptorEnum.Text_ord:
			visit((Text) entity);
			break;
		}
	}
}
