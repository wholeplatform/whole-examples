package org.whole.crossexamples.lwc16.minijava.visitors;

import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.crossexamples.lwc16.minijava.model.Boolean;

/** 
 * @generator Whole
 */
public class MiniJavaForwardStagedVisitor extends MiniJavaIdentityVisitor {
	public void visit(Program entity) {
		stagedVisit(entity);
	}

	public void visit(MainClass entity) {
		stagedVisit(entity);
	}

	public void visit(ClassDeclarations entity) {
		stagedVisit(entity);
	}

	public void visit(ClassDeclaration entity) {
		stagedVisit(entity);
	}

	public void visit(VariableDeclarations entity) {
		stagedVisit(entity);
	}

	public void visit(VariableDeclaration entity) {
		stagedVisit(entity);
	}

	public void visit(MethodDeclarations entity) {
		stagedVisit(entity);
	}

	public void visit(MethodDeclaration entity) {
		stagedVisit(entity);
	}

	public void visit(Boolean entity) {
		stagedVisit(entity);
	}

	public void visit(Int entity) {
		stagedVisit(entity);
	}

	public void visit(IntArray entity) {
		stagedVisit(entity);
	}

	public void visit(Identifier entity) {
		stagedVisit(entity);
	}

	public void visit(Statements entity) {
		stagedVisit(entity);
	}

	public void visit(Block entity) {
		stagedVisit(entity);
	}

	public void visit(IfStatement entity) {
		stagedVisit(entity);
	}

	public void visit(WhileStatement entity) {
		stagedVisit(entity);
	}

	public void visit(PrintlnStatement entity) {
		stagedVisit(entity);
	}

	public void visit(VariableAssignment entity) {
		stagedVisit(entity);
	}

	public void visit(ArrayElementAssignment entity) {
		stagedVisit(entity);
	}

	public void visit(InfixExpression entity) {
		stagedVisit(entity);
	}

	public void visit(InfixOperator entity) {
		stagedVisit(entity);
	}

	public void visit(NotExpression entity) {
		stagedVisit(entity);
	}

	public void visit(ParenthesizedExpression entity) {
		stagedVisit(entity);
	}

	public void visit(ArrayAccess entity) {
		stagedVisit(entity);
	}

	public void visit(ArrayLength entity) {
		stagedVisit(entity);
	}

	public void visit(MethodInvocation entity) {
		stagedVisit(entity);
	}

	public void visit(Arguments entity) {
		stagedVisit(entity);
	}

	public void visit(BooleanLiteral entity) {
		stagedVisit(entity);
	}

	public void visit(IntLiteral entity) {
		stagedVisit(entity);
	}

	public void visit(ThisExpression entity) {
		stagedVisit(entity);
	}

	public void visit(ArrayCreation entity) {
		stagedVisit(entity);
	}

	public void visit(ClassInstanceCreation entity) {
		stagedVisit(entity);
	}
}
