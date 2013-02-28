package org.whole.crossexamples.lwc13.ui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class BooleanControl extends AbstractValued<Boolean> {
	protected Button button;
	public BooleanControl(Composite parent, String label, Runnable notifier) {
		super(parent, label, false, notifier);
		button = new Button(parent, SWT.CHECK);
		button.setSelection(getValue());
		button.setText(getLabel());
		button.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 2, 1));

		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				setValue(button.getSelection());
				notifyChanged();
			}
		});
	}

	public void setStyle(Style style) {
		style.apply(button);
	}
}
