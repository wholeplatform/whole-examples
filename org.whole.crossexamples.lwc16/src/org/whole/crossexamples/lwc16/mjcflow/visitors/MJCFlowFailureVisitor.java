package org.whole.crossexamples.lwc16.mjcflow.visitors;

import org.whole.crossexamples.lwc16.mjcflow.model.*;
import org.whole.lang.model.adapters.IEntityAdapter;
import org.whole.lang.visitors.VisitException;

/** 
 * @generator Whole
 */
public class MJCFlowFailureVisitor extends MJCFlowIdentityVisitor {
	public boolean visitAdapter(IEntityAdapter entity) {
		throw new VisitException();
	}

	public void visit(UnlessStatement entity) {
		throw new VisitException();
	}
}
