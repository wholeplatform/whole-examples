package org.whole.crossexamples.cg13.prototypes.java;



public class Int implements Literal {
	protected Int(int value) {
		this.value = value;
	}

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
