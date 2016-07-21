package org.whole.crossexamples.lwc16.mjcflow.visitors;

import org.whole.crossexamples.lwc16.mjcflow.visitors.MJCFlowIdentityUnaryVisitor;
import org.whole.crossexamples.lwc16.mjcflow.visitors.IMJCFlowVisitor;
import org.whole.crossexamples.lwc16.mjcflow.model.*;
import org.whole.lang.visitors.IVisitor;

/** 
 * @generator Whole
 */
public class MJCFlowTraverseAllAdjacentsVisitor extends MJCFlowIdentityUnaryVisitor<IMJCFlowVisitor> {
	public MJCFlowTraverseAllAdjacentsVisitor() {
		wSetVisitor1(this);
	}

	public MJCFlowTraverseAllAdjacentsVisitor(IVisitor visitor1) {
		super(visitor1);
	}
}
