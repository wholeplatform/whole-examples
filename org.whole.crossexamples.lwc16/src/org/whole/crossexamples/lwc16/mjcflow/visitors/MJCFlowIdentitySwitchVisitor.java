package org.whole.crossexamples.lwc16.mjcflow.visitors;

import org.whole.lang.visitors.AbstractVisitor;
import org.whole.crossexamples.lwc16.mjcflow.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.mjcflow.reflect.MJCFlowEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public abstract class MJCFlowIdentitySwitchVisitor extends AbstractVisitor implements IMJCFlowVisitor {
	public void visit(IEntity entity) {
		switch (entity.wGetEntityOrd()) {
		case MJCFlowEntityDescriptorEnum.UnlessStatement_ord:
			visit((UnlessStatement) entity);
			break;
		}
	}
}
