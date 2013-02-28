package org.whole.crossexamples.lwc13.ui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class StringControl extends AbstractValued<String> {
	protected Label labelControl;
	public StringControl(Composite parent, String label, Runnable notifier) {
		super(parent, label, "", notifier);
	
		labelControl = new Label(parent, SWT.NONE);
		labelControl.setText(getLabel());
		labelControl.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false));

		final Text text = new Text(parent, SWT.BORDER);
		GridData layoutData = new GridData(SWT.LEFT, SWT.TOP, true, false);
		layoutData.minimumWidth = 300;
		text.setLayoutData(layoutData);
		text.setText(String.valueOf(getValue()));
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent event) {
				setValue(text.getText());
				notifyChanged();
			}
		});
	}

	public void setStyle(Style style) {
		style.apply(labelControl);
	}
}
