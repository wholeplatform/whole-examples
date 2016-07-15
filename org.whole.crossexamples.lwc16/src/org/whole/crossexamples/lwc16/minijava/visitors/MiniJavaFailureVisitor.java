package org.whole.crossexamples.lwc16.minijava.visitors;

import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.lang.model.adapters.IEntityAdapter;
import org.whole.lang.visitors.VisitException;
import org.whole.crossexamples.lwc16.minijava.model.Boolean;

/** 
 * @generator Whole
 */
public class MiniJavaFailureVisitor extends MiniJavaIdentityVisitor {
	public boolean visitAdapter(IEntityAdapter entity) {
		throw new VisitException();
	}

	public void visit(Program entity) {
		throw new VisitException();
	}

	public void visit(MainClass entity) {
		throw new VisitException();
	}

	public void visit(ClassDeclarations entity) {
		throw new VisitException();
	}

	public void visit(ClassDeclaration entity) {
		throw new VisitException();
	}

	public void visit(VariableDeclarations entity) {
		throw new VisitException();
	}

	public void visit(VariableDeclaration entity) {
		throw new VisitException();
	}

	public void visit(MethodDeclarations entity) {
		throw new VisitException();
	}

	public void visit(MethodDeclaration entity) {
		throw new VisitException();
	}

	public void visit(Boolean entity) {
		throw new VisitException();
	}

	public void visit(Int entity) {
		throw new VisitException();
	}

	public void visit(IntArray entity) {
		throw new VisitException();
	}

	public void visit(Identifier entity) {
		throw new VisitException();
	}

	public void visit(Statements entity) {
		throw new VisitException();
	}

	public void visit(Block entity) {
		throw new VisitException();
	}

	public void visit(IfStatement entity) {
		throw new VisitException();
	}

	public void visit(WhileStatement entity) {
		throw new VisitException();
	}

	public void visit(PrintlnStatement entity) {
		throw new VisitException();
	}

	public void visit(VariableAssignment entity) {
		throw new VisitException();
	}

	public void visit(ArrayElementAssignment entity) {
		throw new VisitException();
	}

	public void visit(InfixExpression entity) {
		throw new VisitException();
	}

	public void visit(InfixOperator entity) {
		throw new VisitException();
	}

	public void visit(NotExpression entity) {
		throw new VisitException();
	}

	public void visit(ArrayAccess entity) {
		throw new VisitException();
	}

	public void visit(ArrayLength entity) {
		throw new VisitException();
	}

	public void visit(MethodInvocation entity) {
		throw new VisitException();
	}

	public void visit(Arguments entity) {
		throw new VisitException();
	}

	public void visit(BooleanLiteral entity) {
		throw new VisitException();
	}

	public void visit(IntLiteral entity) {
		throw new VisitException();
	}

	public void visit(ThisExpression entity) {
		throw new VisitException();
	}

	public void visit(ArrayCreation entity) {
		throw new VisitException();
	}

	public void visit(ClassInstanceCreation entity) {
		throw new VisitException();
	}
}
