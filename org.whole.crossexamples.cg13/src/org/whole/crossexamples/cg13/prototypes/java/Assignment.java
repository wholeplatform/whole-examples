package org.whole.crossexamples.cg13.prototypes.java;



public class Assignment implements Statement {
	protected Assignment(Variable variable, Expression expression) {
		this.variable = variable;
		this.expression = expression;
	}

	private Variable variable;

	public Variable getVariable() {
		return variable;
	}

	public void setVariable(Variable variable) {
		this.variable = variable;
	}

	private Expression expression;

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

}
