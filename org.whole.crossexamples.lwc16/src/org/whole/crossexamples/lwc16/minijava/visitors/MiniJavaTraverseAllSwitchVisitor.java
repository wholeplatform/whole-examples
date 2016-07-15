package org.whole.crossexamples.lwc16.minijava.visitors;

import org.whole.crossexamples.lwc16.minijava.visitors.MiniJavaIdentityUnaryVisitor;
import org.whole.lang.visitors.IVisitor;
import org.whole.crossexamples.lwc16.minijava.model.*;

/** 
 * @generator Whole
 */
public class MiniJavaTraverseAllSwitchVisitor extends MiniJavaIdentityUnaryVisitor<IVisitor> {
	public MiniJavaTraverseAllSwitchVisitor(IVisitor visitor1) {
		super(visitor1);
	}

	public void visit(Program entity) {
		wGetVisitor1().visit(entity.getMainClass());
		wGetVisitor1().visit(entity.getClassDeclarations());
	}

	public void visit(MainClass entity) {
		wGetVisitor1().visit(entity.getName());
		wGetVisitor1().visit(entity.getParameterName());
		wGetVisitor1().visit(entity.getStatement());
	}

	public void visit(ClassDeclarations entity) {
		for (int i = 0; i < entity.size(); i++)
			wGetVisitor1().visit(entity.get(i));
	}

	public void visit(ClassDeclaration entity) {
		wGetVisitor1().visit(entity.getName());
		wGetVisitor1().visit(entity.getSuperclassName());
		wGetVisitor1().visit(entity.getVariables());
		wGetVisitor1().visit(entity.getMethods());
	}

	public void visit(VariableDeclarations entity) {
		for (int i = 0; i < entity.size(); i++)
			wGetVisitor1().visit(entity.get(i));
	}

	public void visit(VariableDeclaration entity) {
		wGetVisitor1().visit(entity.getType());
		wGetVisitor1().visit(entity.getName());
	}

	public void visit(MethodDeclarations entity) {
		for (int i = 0; i < entity.size(); i++)
			wGetVisitor1().visit(entity.get(i));
	}

	public void visit(MethodDeclaration entity) {
		wGetVisitor1().visit(entity.getReturnType());
		wGetVisitor1().visit(entity.getName());
		wGetVisitor1().visit(entity.getParameters());
		wGetVisitor1().visit(entity.getVariables());
		wGetVisitor1().visit(entity.getStatements());
		wGetVisitor1().visit(entity.getReturnExpression());
	}

	public void visit(Statements entity) {
		for (int i = 0; i < entity.size(); i++)
			wGetVisitor1().visit(entity.get(i));
	}

	public void visit(Block entity) {
		for (int i = 0; i < entity.size(); i++)
			wGetVisitor1().visit(entity.get(i));
	}

	public void visit(IfStatement entity) {
		wGetVisitor1().visit(entity.getExpression());
		wGetVisitor1().visit(entity.getThenStatement());
		wGetVisitor1().visit(entity.getElseStatement());
	}

	public void visit(WhileStatement entity) {
		wGetVisitor1().visit(entity.getExpression());
		wGetVisitor1().visit(entity.getStatement());
	}

	public void visit(PrintlnStatement entity) {
		wGetVisitor1().visit(entity.getExpression());
	}

	public void visit(VariableAssignment entity) {
		wGetVisitor1().visit(entity.getName());
		wGetVisitor1().visit(entity.getExpression());
	}

	public void visit(ArrayElementAssignment entity) {
		wGetVisitor1().visit(entity.getName());
		wGetVisitor1().visit(entity.getIndex());
		wGetVisitor1().visit(entity.getExpression());
	}

	public void visit(InfixExpression entity) {
		wGetVisitor1().visit(entity.getLeftOperand());
		wGetVisitor1().visit(entity.getOperator());
		wGetVisitor1().visit(entity.getRightOperand());
	}

	public void visit(NotExpression entity) {
		wGetVisitor1().visit(entity.getExpression());
	}

	public void visit(ArrayAccess entity) {
		wGetVisitor1().visit(entity.getArray());
		wGetVisitor1().visit(entity.getIndex());
	}

	public void visit(ArrayLength entity) {
		wGetVisitor1().visit(entity.getArray());
	}

	public void visit(MethodInvocation entity) {
		wGetVisitor1().visit(entity.getExpression());
		wGetVisitor1().visit(entity.getName());
		wGetVisitor1().visit(entity.getArguments());
	}

	public void visit(Arguments entity) {
		for (int i = 0; i < entity.size(); i++)
			wGetVisitor1().visit(entity.get(i));
	}

	public void visit(ArrayCreation entity) {
		wGetVisitor1().visit(entity.getLength());
	}

	public void visit(ClassInstanceCreation entity) {
		wGetVisitor1().visit(entity.getName());
	}
}
