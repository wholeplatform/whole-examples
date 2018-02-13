package org.whole.crossexamples.cg13.prototypes.java;



public class Not implements Expression {
	protected Not() {}

	private Expression exp;

	public Expression getExp() {
		return exp;
	}

	public void setExp(Expression exp) {
		this.exp = exp;
	}

	public Not(Expression exp) {
		this.exp = exp;
	}

}
