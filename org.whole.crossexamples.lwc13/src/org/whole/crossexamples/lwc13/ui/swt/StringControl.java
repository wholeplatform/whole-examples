package org.whole.crossexamples.lwc13.ui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.whole.lang.model.IEntity;

public class StringControl extends AbstractValued<String> {
	protected Label labelControl;
	protected Text text;
	public StringControl(Composite parent, String label, Runnable notifier, Style style) {
		super(parent, label, "", notifier, style);
	
		labelControl = new Label(parent, SWT.NONE);
		labelControl.setText(getLabel());
		labelControl.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false));

		text = new Text(parent, SWT.BORDER);
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
		if (style != null)
			setStyle(style);
	}
	
	@Override
	public void setValue(IEntity value) {
		super.setValue(value);
		text.setText(getValue());
	}

	public void setStyle(Style style) {
		style.apply(labelControl);
	}
}
