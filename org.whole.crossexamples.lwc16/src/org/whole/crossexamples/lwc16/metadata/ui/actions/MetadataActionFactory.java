/**
 * Copyright 2004-2016 Riccardo Solmi. All rights reserved.
 * This file is part of the Whole Platform.
 *
 * The Whole Platform is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The Whole Platform is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the Whole Platform. If not, see <http://www.gnu.org/licenses/>.
 */
package org.whole.crossexamples.lwc16.metadata.ui.actions;

import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;
import org.whole.lang.e4.ui.actions.ArrowDownAction;
import org.whole.lang.e4.ui.actions.ArrowLeftAction;
import org.whole.lang.e4.ui.actions.ArrowRightAction;
import org.whole.lang.e4.ui.actions.ArrowUpAction;
import org.whole.lang.e4.ui.actions.BackspaceAction;
import org.whole.lang.e4.ui.actions.DeleteAction;
import org.whole.lang.e4.ui.actions.NewlineAction;
import org.whole.lang.e4.ui.actions.SplitOnCaretAction;
import org.whole.lang.e4.ui.util.E4Utils;
import org.whole.lang.ui.actions.EnablerPredicateFactory;
import org.whole.lang.ui.editor.ActionFactory;

/** 
 * @generator Whole
 */
public class MetadataActionFactory extends ActionFactory {
	private static class SingletonHolder {
		private static final MetadataActionFactory instance = new MetadataActionFactory();
	}
	public static MetadataActionFactory instance() {
		return SingletonHolder.instance;
	}
	private MetadataActionFactory() {
	}

	public Object[][] wrapActions() {
		EnablerPredicateFactory pf = EnablerPredicateFactory.instance;
		return new Object[][] {
			{pf.assignableTo(MetadataEntityDescriptorEnum.Annotable), MetadataEntityDescriptorEnum.Metadata, "Metadata", wrapIn0}
		};
	}

	public Object[][] textActions() {

		return new Object[][] {
			{ E4Utils.lookupSpace(), MetadataEntityDescriptorEnum.Text, SplitOnCaretAction.class },
		}; 
	}
}
