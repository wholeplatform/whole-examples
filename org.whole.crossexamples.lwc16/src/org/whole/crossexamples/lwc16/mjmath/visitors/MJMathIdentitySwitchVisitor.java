package org.whole.crossexamples.lwc16.mjmath.visitors;

import org.whole.lang.visitors.AbstractVisitor;
import org.whole.crossexamples.lwc16.mjmath.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.mjmath.reflect.MJMathEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public abstract class MJMathIdentitySwitchVisitor extends AbstractVisitor implements IMJMathVisitor {
	public void visit(IEntity entity) {
		switch (entity.wGetEntityOrd()) {
		case MJMathEntityDescriptorEnum.Summation_ord:
			visit((Summation) entity);
			break;
		}
	}
}
