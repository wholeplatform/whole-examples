package org.whole.crossexamples.lwc13.ui.swt;

public enum QuestionType {
	BOOLEAN, INTEGER, STRING, DATE, MONEY;

	public boolean isNumeric() {
		return equals(INTEGER) || equals(MONEY);
	}
}
