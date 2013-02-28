package org.whole.crossexamples.lwc13.ui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

public class SectionControl {
	private Group group;

	public SectionControl(Composite parent, String title) {
		this(parent, title, null);
	}

	public SectionControl(Composite parent, String title, Style titleStyle) {
		this.group = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		layout.horizontalSpacing = layout.verticalSpacing = 10;
		group.setLayout(layout);
		group.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 2, 1));
		group.setText(title);
		if (titleStyle != null)
			titleStyle.apply(group);
	}

	public Composite getComposite() {
		return group;
	}

	public void setVisible(boolean visible) {
		if (!group.isDisposed())
			group.setVisible(visible);
	}
}
