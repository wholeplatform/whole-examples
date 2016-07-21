package org.whole.crossexamples.lwc16.mjcflow.visitors;

import org.whole.crossexamples.lwc16.mjcflow.model.*;

/** 
 * @generator Whole
 */
public class MJCFlowForwardStagedVisitor extends MJCFlowIdentityVisitor {
	public void visit(UnlessStatement entity) {
		stagedVisit(entity);
	}
}
