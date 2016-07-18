package org.whole.crossexamples.lwc16.minijava.visitors;

import org.whole.lang.visitors.IVisitor;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.crossexamples.lwc16.minijava.model.Boolean;

/** 
 * @generator Whole
 */
public interface IMiniJavaVisitor extends IVisitor {
	public void visit(Program entity);

	public void visit(MainClass entity);

	public void visit(ClassDeclarations entity);

	public void visit(ClassDeclaration entity);

	public void visit(VariableDeclarations entity);

	public void visit(VariableDeclaration entity);

	public void visit(MethodDeclarations entity);

	public void visit(MethodDeclaration entity);

	public void visit(Boolean entity);

	public void visit(Int entity);

	public void visit(IntArray entity);

	public void visit(Identifier entity);

	public void visit(Statements entity);

	public void visit(Block entity);

	public void visit(IfStatement entity);

	public void visit(WhileStatement entity);

	public void visit(PrintlnStatement entity);

	public void visit(VariableAssignment entity);

	public void visit(ArrayElementAssignment entity);

	public void visit(InfixExpression entity);

	public void visit(InfixOperator entity);

	public void visit(NotExpression entity);

	public void visit(ParenthesizedExpression entity);

	public void visit(ArrayAccess entity);

	public void visit(ArrayLength entity);

	public void visit(MethodInvocation entity);

	public void visit(Arguments entity);

	public void visit(BooleanLiteral entity);

	public void visit(IntLiteral entity);

	public void visit(ThisExpression entity);

	public void visit(ArrayCreation entity);

	public void visit(ClassInstanceCreation entity);
}
