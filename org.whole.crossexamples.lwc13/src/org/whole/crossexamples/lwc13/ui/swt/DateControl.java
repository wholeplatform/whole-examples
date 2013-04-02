package org.whole.crossexamples.lwc13.ui.swt;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.whole.lang.model.IEntity;

public class DateControl extends AbstractValued<Date> {
	protected NumberFormat format;
	protected Label labelControl;
	protected DateTime dateTime;

	public DateControl(Composite parent, String label, Runnable notifier, Style style) {
		super(parent, label, new Date(), notifier, style);
	
		format = NumberFormat.getIntegerInstance();

		labelControl = new Label(parent, SWT.NONE);
		labelControl.setText(getLabel());
		labelControl.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false));

		dateTime = new DateTime(parent, SWT.CALENDAR);
		GridData layoutData = new GridData(SWT.LEFT, SWT.TOP, true, false);
		layoutData.minimumWidth = 150;
		dateTime.setLayoutData(layoutData);
		unparse(getValue());
		dateTime.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				try {
					setValue(parse());
					notifyChanged();
				} catch (Exception e) {
				}
			}
		});
		if (style != null)
			setStyle(style);
	}

	@Override
	public void setValue(IEntity value) {
		super.setValue(value);
		unparse(getValue());
	}

	public void setStyle(Style style) {
		style.apply(labelControl);
	}

	protected void unparse(Date date) {
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(date);
		dateTime.setDay(calendar.get(Calendar.DAY_OF_MONTH));
		dateTime.setMonth(calendar.get(Calendar.MONTH));
		dateTime.setYear(calendar.get(Calendar.YEAR));
	}
	protected Date parse() throws ParseException {
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, dateTime.getDay());
		calendar.set(Calendar.MONTH, dateTime.getMonth());
		calendar.set(Calendar.YEAR, dateTime.getYear());
		return calendar.getTime();
	}
}
