/**
 * Copyright 2004-2019 Riccardo Solmi. All rights reserved.
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
package org.whole.crossexamples.lwc16.minijava.events;

import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.lang.bindings.BindingManagerFactory;
import org.whole.lang.bindings.IBindingManager;
import org.whole.lang.events.IdentityEventHandler;
import org.whole.lang.matchers.Matcher;
import org.whole.lang.model.IEntity;
import org.whole.lang.reflect.FeatureDescriptor;
import org.whole.lang.util.BehaviorUtils;
import org.whole.lang.util.StringUtils;

/**
 * @author Riccardo Solmi
 */
public class MiniJavaReactionsHandler extends IdentityEventHandler {
	private static final long serialVersionUID = 1L;

	@Override
	public void notifyChanged(IEntity source, FeatureDescriptor fd, IEntity oldValue, IEntity newValue) {
		if (Matcher.match(MiniJavaEntityDescriptorEnum.Identifier, newValue)) {
			//enforce naming conventions
			if (!StringUtils.isValidJavaName(newValue.wStringValue())) {
				source.wGetModel().getCompoundModel().getHistoryManager().setRollbackOnly();
				return;
			}
		}
	}

	@Override
	public void notifyChanged(IEntity source, FeatureDescriptor fd, String oldValue, String newValue) {
		if (Matcher.match(MiniJavaEntityDescriptorEnum.Identifier, source)) {
			//enforce naming conventions
			if (!StringUtils.isValidJavaName(newValue)) {
				source.wGetModel().getCompoundModel().getHistoryManager().setRollbackOnly();
				return;
			}

			IBindingManager bm = BindingManagerFactory.instance.createArguments();
			bm.wDefValue("name", oldValue);
			bm.wDefValue("newName", newValue);
			BehaviorUtils.apply("whole:org.whole.crossexamples.lwc16.minijava:MiniJavaLibrarySemantics#rename", source, bm);
		}
	}
}
