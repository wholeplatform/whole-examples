package org.whole.crossexamples.lwc13.ui.swt;

import org.eclipse.swt.SWT;

public enum FontStyle {
	NORMAL, BOLD, ITALIC, BOLD_ITALIC;
	
	public int getValue() {
		switch (this) {
		default:
		case NORMAL:
			return SWT.NORMAL;
		case BOLD:
			return SWT.BOLD;
		case ITALIC:
			return SWT.ITALIC;
		case BOLD_ITALIC:
			return SWT.BOLD | SWT.ITALIC;
		}
	}
}
