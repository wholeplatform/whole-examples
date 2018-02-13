package org.whole.crossexamples.cg13.prototypes.java;



public class LessThan implements Expression {

	private Expression exp1;
	private Expression exp2;

	public LessThan() {
	}
	public LessThan(Expression exp1, Expression exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	public Expression getExp1() {
		return exp1;
	}

	public void setExp1(Expression exp1) {
		this.exp1 = exp1;
	}

	public Expression getExp2() {
		return exp2;
	}

	public void setExp2(Expression exp2) {
		this.exp2 = exp2;
	}

}
