package org.whole.crossexamples.lwc16.minijava.visitors;

import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.crossexamples.lwc16.minijava.model.Boolean;

/** 
 * @generator Whole
 */
public class MiniJavaIdentityDefaultVisitor extends MiniJavaIdentityVisitor {
	public void visit(IMiniJavaEntity entity) {
	}

	public void visit(Program entity) {
		visit((IMiniJavaEntity) entity);
	}

	public void visit(MainClass entity) {
		visit((IMiniJavaEntity) entity);
	}

	public void visit(ClassDeclarations entity) {
		visit((IMiniJavaEntity) entity);
	}

	public void visit(ClassDeclaration entity) {
		visit((IMiniJavaEntity) entity);
	}

	public void visit(VariableDeclarations entity) {
		visit((IMiniJavaEntity) entity);
	}

	public void visit(VariableDeclaration entity) {
		visit((IMiniJavaEntity) entity);
	}

	public void visit(MethodDeclarations entity) {
		visit((IMiniJavaEntity) entity);
	}

	public void visit(MethodDeclaration entity) {
		visit((IMiniJavaEntity) entity);
	}

	public void visit(Type entity) {
	}

	public void visit(Boolean entity) {
		visit((IMiniJavaEntity) entity);
		visit((Type) entity);
	}

	public void visit(Int entity) {
		visit((IMiniJavaEntity) entity);
		visit((Type) entity);
	}

	public void visit(IntArray entity) {
		visit((IMiniJavaEntity) entity);
		visit((Type) entity);
	}

	public void visit(Identifier entity) {
		visit((IMiniJavaEntity) entity);
		visit((Type) entity);
		visit((Expression) entity);
	}

	public void visit(Expression entity) {
	}

	public void visit(Statements entity) {
		visit((IMiniJavaEntity) entity);
	}

	public void visit(Statement entity) {
	}

	public void visit(Block entity) {
		visit((IMiniJavaEntity) entity);
		visit((Statement) entity);
	}

	public void visit(IfStatement entity) {
		visit((IMiniJavaEntity) entity);
		visit((Statement) entity);
	}

	public void visit(WhileStatement entity) {
		visit((IMiniJavaEntity) entity);
		visit((Statement) entity);
	}

	public void visit(PrintlnStatement entity) {
		visit((IMiniJavaEntity) entity);
		visit((Statement) entity);
	}

	public void visit(VariableAssignment entity) {
		visit((IMiniJavaEntity) entity);
		visit((Statement) entity);
	}

	public void visit(ArrayElementAssignment entity) {
		visit((IMiniJavaEntity) entity);
		visit((Statement) entity);
	}

	public void visit(InfixExpression entity) {
		visit((IMiniJavaEntity) entity);
		visit((Expression) entity);
	}

	public void visit(InfixOperator entity) {
		visit((IMiniJavaEntity) entity);
	}

	public void visit(NotExpression entity) {
		visit((IMiniJavaEntity) entity);
		visit((Expression) entity);
	}

	public void visit(ArrayAccess entity) {
		visit((IMiniJavaEntity) entity);
		visit((Expression) entity);
	}

	public void visit(ArrayLength entity) {
		visit((IMiniJavaEntity) entity);
		visit((Expression) entity);
	}

	public void visit(MethodInvocation entity) {
		visit((IMiniJavaEntity) entity);
		visit((Expression) entity);
	}

	public void visit(Arguments entity) {
		visit((IMiniJavaEntity) entity);
	}

	public void visit(BooleanLiteral entity) {
		visit((IMiniJavaEntity) entity);
		visit((Expression) entity);
	}

	public void visit(IntLiteral entity) {
		visit((IMiniJavaEntity) entity);
		visit((Expression) entity);
	}

	public void visit(ThisExpression entity) {
		visit((IMiniJavaEntity) entity);
		visit((Expression) entity);
	}

	public void visit(ArrayCreation entity) {
		visit((IMiniJavaEntity) entity);
		visit((Expression) entity);
	}

	public void visit(ClassInstanceCreation entity) {
		visit((IMiniJavaEntity) entity);
		visit((Expression) entity);
	}
}
