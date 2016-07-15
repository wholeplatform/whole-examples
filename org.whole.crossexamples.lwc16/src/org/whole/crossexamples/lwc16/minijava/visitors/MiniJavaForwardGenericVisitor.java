package org.whole.crossexamples.lwc16.minijava.visitors;

import org.whole.lang.visitors.AbstractUnaryVisitor;
import org.whole.lang.visitors.IVisitor;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.model.Boolean;

/** 
 * @generator Whole
 */
public class MiniJavaForwardGenericVisitor extends AbstractUnaryVisitor<IVisitor> implements IMiniJavaVisitor {
	public MiniJavaForwardGenericVisitor(IVisitor visitor1) {
		super(visitor1);
	}

	public void visit(IEntity entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(Program entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(MainClass entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(ClassDeclarations entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(ClassDeclaration entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(VariableDeclarations entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(VariableDeclaration entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(MethodDeclarations entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(MethodDeclaration entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(Boolean entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(Int entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(IntArray entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(Identifier entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(Statements entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(Block entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(IfStatement entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(WhileStatement entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(PrintlnStatement entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(VariableAssignment entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(ArrayElementAssignment entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(InfixExpression entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(InfixOperator entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(NotExpression entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(ArrayAccess entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(ArrayLength entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(MethodInvocation entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(Arguments entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(BooleanLiteral entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(IntLiteral entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(ThisExpression entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(ArrayCreation entity) {
		wGetVisitor1().visit(entity);
	}

	public void visit(ClassInstanceCreation entity) {
		wGetVisitor1().visit(entity);
	}
}
