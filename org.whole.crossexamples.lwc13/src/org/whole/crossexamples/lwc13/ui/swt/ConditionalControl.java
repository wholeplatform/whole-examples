package org.whole.crossexamples.lwc13.ui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class ConditionalControl {
	private Composite composite;
	public ConditionalControl(Composite parent) {
		this.composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		layout.horizontalSpacing = layout.verticalSpacing = 5;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 2, 1));
		composite.setVisible(false);
	}

	public Composite getComposite() {
		return composite;
	}

	public void setVisible(boolean visible) {
		if (!composite.isDisposed())
			composite.setVisible(visible);
	}
}
