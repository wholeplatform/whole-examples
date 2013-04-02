package org.whole.crossexamples.lwc13.ui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.whole.lang.model.IEntity;

public class BooleanControl extends AbstractValued<Boolean> {
	protected Button button;
	public BooleanControl(Composite parent, String label, Runnable notifier, Style style) {
		super(parent, label, false, notifier, style);
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
		if (style != null)
			setStyle(style);
	}

	@Override
	public void setValue(IEntity value) {
		super.setValue(value);
		button.setSelection(getValue());
	}

	public void setStyle(Style style) {
		style.apply(button);
	}
}
