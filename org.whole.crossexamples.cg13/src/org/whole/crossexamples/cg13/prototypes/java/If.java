package org.whole.crossexamples.cg13.prototypes.java;



public class If implements Statement {
	private Expression condition;
	private Statement trueBody;
	private Statement falseBody;
	
	public If() {
	}
	public If(Expression condition, Statement trueBody, Statement falseBody) {
		this.condition = condition;
		this.trueBody = trueBody;
		this.falseBody = falseBody;
	}

	public Statement getFalseBody() {
		return falseBody;
	}

	public void setFalseBody(Statement falseBody) {
		this.falseBody = falseBody;
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
