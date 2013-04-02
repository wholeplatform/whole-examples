package org.whole.crossexamples.lwc13.ui.swt;

import java.text.NumberFormat;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ExpressionControl extends AbstractLabeled {
	protected NumberFormat format;
	protected Text text;

	public ExpressionControl(Composite parent, String label, QuestionType questionType) {
		super(label);

		if (questionType.isNumeric())
			format = questionType == QuestionType.INTEGER ?
				NumberFormat.getIntegerInstance() : NumberFormat.getCurrencyInstance();

		Label labelControl = new Label(parent, SWT.NONE);
		labelControl.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false));
		labelControl.setText(getLabel());

		text = new Text(parent, SWT.READ_ONLY | SWT.BORDER | (questionType.isNumeric()  ? SWT.RIGHT : SWT.NONE));
		GridData layoutData = new GridData(SWT.LEFT, SWT.TOP, true, false);
		layoutData.minimumWidth = 300;
		text.setLayoutData(layoutData);
	}

	public void update(Object expression) {
		if (!text.isDisposed())
			text.setText(format != null ? format.format(expression) : String.valueOf(expression));
	}
}
