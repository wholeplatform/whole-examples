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

import org.eclipse.jface.bindings.keys.IKeyLookup;
import org.eclipse.jface.bindings.keys.KeyLookupFactory;
import org.eclipse.jface.bindings.keys.KeySequence;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.whole.crossexamples.lwc16.metadata.reflect.MetadataEntityDescriptorEnum;
import org.whole.lang.text.ui.actions.BackspaceAction;
import org.whole.lang.text.ui.actions.DeleteAction;
import org.whole.lang.text.ui.actions.NewlineAction;
import org.whole.lang.text.ui.actions.SplitOnCaretAction;
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

	public Object[][] textActions() {
		IKeyLookup keyLookup = KeyLookupFactory.getDefault();

		int spaceKey = keyLookup.formalKeyLookup(IKeyLookup.SPACE_NAME);
		KeyStroke spaceKeyStroke = KeyStroke.getInstance(spaceKey);
		KeySequence spaceKeySequence = KeySequence.getInstance(spaceKeyStroke);

		int returnKey = keyLookup.formalKeyLookup(IKeyLookup.RETURN_NAME);
		KeyStroke returnKeyStroke = KeyStroke.getInstance(returnKey);
		KeySequence returnKeySequence = KeySequence.getInstance(returnKeyStroke);

		int backspaceKey = keyLookup.formalKeyLookup(IKeyLookup.BACKSPACE_NAME);
		KeyStroke backspaceKeyStroke = KeyStroke.getInstance(backspaceKey);
		KeySequence backspaceKeySequence = KeySequence.getInstance(backspaceKeyStroke);

		int deleteKey = keyLookup.formalKeyLookup(IKeyLookup.DELETE_NAME);
		KeyStroke deleteKeyStroke = KeyStroke.getInstance(deleteKey);
		KeySequence deleteKeySequence = KeySequence.getInstance(deleteKeyStroke);

		return new Object[][] {
				{ spaceKeySequence, MetadataEntityDescriptorEnum.Text, SplitOnCaretAction.class },
				{ returnKeySequence, MetadataEntityDescriptorEnum.Text, NewlineAction.class },
				{ backspaceKeySequence, MetadataEntityDescriptorEnum.Text, BackspaceAction.class },
				{ deleteKeySequence, MetadataEntityDescriptorEnum.Text, DeleteAction.class },
		}; 
	}
}
