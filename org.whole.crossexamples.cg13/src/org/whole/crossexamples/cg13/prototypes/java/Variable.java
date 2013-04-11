package org.whole.crossexamples.cg13.prototypes.java;



public class Variable implements Expression {
	protected Variable(String name) {
		this.name = name;
	}

	private String name = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
