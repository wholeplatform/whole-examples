package org.whole.crossexamples.lwc16.minijava.visitors;

import org.whole.crossexamples.lwc16.minijava.visitors.MiniJavaIdentityUnaryVisitor;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.lang.visitors.IVisitor;

/** 
 * @generator Whole
 */
public class MiniJavaTraverseAllChildrenVisitor extends MiniJavaIdentityUnaryVisitor<IMiniJavaVisitor> {
	public MiniJavaTraverseAllChildrenVisitor() {
		wSetVisitor1(this);
	}

	public MiniJavaTraverseAllChildrenVisitor(IVisitor visitor1) {
		super(visitor1);
	}

	public void visit(Program entity) {
		entity.getMainClass().accept(wGetVisitor1());
		entity.getClassDeclarations().accept(wGetVisitor1());
	}

	public void visit(MainClass entity) {
		entity.getName().accept(wGetVisitor1());
		entity.getParameterName().accept(wGetVisitor1());
		entity.getStatement().accept(wGetVisitor1());
	}

	public void visit(ClassDeclarations entity) {
		for (int i = 0; i < entity.size(); i++)
			entity.get(i).accept(wGetVisitor1());
	}

	public void visit(ClassDeclaration entity) {
		entity.getName().accept(wGetVisitor1());
		entity.getSuperclassName().accept(wGetVisitor1());
		entity.getVariables().accept(wGetVisitor1());
		entity.getMethods().accept(wGetVisitor1());
	}

	public void visit(VariableDeclarations entity) {
		for (int i = 0; i < entity.size(); i++)
			entity.get(i).accept(wGetVisitor1());
	}

	public void visit(VariableDeclaration entity) {
		entity.getType().accept(wGetVisitor1());
		entity.getName().accept(wGetVisitor1());
	}

	public void visit(MethodDeclarations entity) {
		for (int i = 0; i < entity.size(); i++)
			entity.get(i).accept(wGetVisitor1());
	}

	public void visit(MethodDeclaration entity) {
		entity.getReturnType().accept(wGetVisitor1());
		entity.getName().accept(wGetVisitor1());
		entity.getParameters().accept(wGetVisitor1());
		entity.getVariables().accept(wGetVisitor1());
		entity.getStatements().accept(wGetVisitor1());
		entity.getReturnExpression().accept(wGetVisitor1());
	}

	public void visit(Statements entity) {
		for (int i = 0; i < entity.size(); i++)
			entity.get(i).accept(wGetVisitor1());
	}

	public void visit(Block entity) {
		for (int i = 0; i < entity.size(); i++)
			entity.get(i).accept(wGetVisitor1());
	}

	public void visit(IfStatement entity) {
		entity.getExpression().accept(wGetVisitor1());
		entity.getThenStatement().accept(wGetVisitor1());
		entity.getElseStatement().accept(wGetVisitor1());
	}

	public void visit(WhileStatement entity) {
		entity.getExpression().accept(wGetVisitor1());
		entity.getStatement().accept(wGetVisitor1());
	}

	public void visit(PrintlnStatement entity) {
		entity.getExpression().accept(wGetVisitor1());
	}

	public void visit(VariableAssignment entity) {
		entity.getName().accept(wGetVisitor1());
		entity.getExpression().accept(wGetVisitor1());
	}

	public void visit(ArrayElementAssignment entity) {
		entity.getName().accept(wGetVisitor1());
		entity.getIndex().accept(wGetVisitor1());
		entity.getExpression().accept(wGetVisitor1());
	}

	public void visit(InfixExpression entity) {
		entity.getLeftOperand().accept(wGetVisitor1());
		entity.getOperator().accept(wGetVisitor1());
		entity.getRightOperand().accept(wGetVisitor1());
	}

	public void visit(NotExpression entity) {
		entity.getExpression().accept(wGetVisitor1());
	}

	public void visit(ParenthesizedExpression entity) {
		entity.getExpression().accept(wGetVisitor1());
	}

	public void visit(ArrayAccess entity) {
		entity.getArray().accept(wGetVisitor1());
		entity.getIndex().accept(wGetVisitor1());
	}

	public void visit(ArrayLength entity) {
		entity.getArray().accept(wGetVisitor1());
	}

	public void visit(MethodInvocation entity) {
		entity.getExpression().accept(wGetVisitor1());
		entity.getName().accept(wGetVisitor1());
		entity.getArguments().accept(wGetVisitor1());
	}

	public void visit(Arguments entity) {
		for (int i = 0; i < entity.size(); i++)
			entity.get(i).accept(wGetVisitor1());
	}

	public void visit(ArrayCreation entity) {
		entity.getLength().accept(wGetVisitor1());
	}

	public void visit(ClassInstanceCreation entity) {
		entity.getName().accept(wGetVisitor1());
	}
}
