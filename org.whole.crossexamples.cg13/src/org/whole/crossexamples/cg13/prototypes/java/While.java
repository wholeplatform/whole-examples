package org.whole.crossexamples.cg13.prototypes.java;



public class While implements Statement {
	private Expression condition;
	private Statement trueBody;

	public While() {
	}
	public While(Expression condition, Statement trueBody) {
		this.condition = condition;
		this.trueBody = trueBody;
	}

	public Expression getCondition() {
		return condition;
	}

	public void setCondition(Expression condition) {
		this.condition = condition;
	}

	public Statement getTrueBody() {
		return trueBody;
	}

	public void setTrueBody(Statement trueBody) {
		this.trueBody = trueBody;
	}


}
