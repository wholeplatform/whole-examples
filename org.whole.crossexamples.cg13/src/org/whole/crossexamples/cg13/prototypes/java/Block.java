package org.whole.crossexamples.cg13.prototypes.java;

import java.util.Arrays;
import java.util.List;



public class Block implements Statement {

	protected Block(Statement... statements) {
		this.statement = Arrays.asList(statements);
	}

	private List<Statement> statement;

	public List<Statement> getChildren() {
		return statement;
	}

	public void setChildren(List<Statement> children) {
		statement = children;
	}

}
