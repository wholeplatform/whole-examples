package org.whole.crossexamples.lwc13.ui.swt;

import java.text.NumberFormat;
import java.text.ParseException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class IntegerControl extends AbstractValued<Integer> {
	protected NumberFormat format;
	protected Label labelControl;
	protected Text text;

	public IntegerControl(Composite parent, String label, Runnable notifier) {
		super(parent, label, 0, notifier);
	
		format = NumberFormat.getIntegerInstance();

		labelControl = new Label(parent, SWT.NONE);
		labelControl.setText(getLabel());
		labelControl.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false));

		text = new Text(parent, SWT.BORDER | SWT.RIGHT);
		GridData layoutData = new GridData(SWT.LEFT, SWT.TOP, true, false);
		layoutData.minimumWidth = 150;
		text.setLayoutData(layoutData);
		unparse(getValue());
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent event) {
				try {
					setValue(parse());
					notifyChanged();
				} catch (Exception e) {
				}
			}
		});
	}

	public void setStyle(Style style) {
		style.apply(labelControl);
	}

	protected void unparse(int value) {
		text.setText(format.format(value));
	}
	protected int parse() throws ParseException {
		return format.parse(text.getText()).intValue();
	}
}
