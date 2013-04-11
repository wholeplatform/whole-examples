package org.whole.crossexamples.cg13.prototypes.java;



public class Bool implements Literal {
	// Singleton
	public static final Bool TRUE = new Bool(true);
	public static final Bool FALSE = new Bool(false);
	public static final Bool instance(boolean value) {
		return value ? TRUE: FALSE;
	}
	private Bool(boolean val) {
		this.value = val;
	}

	private boolean value;

	public boolean getValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

}
