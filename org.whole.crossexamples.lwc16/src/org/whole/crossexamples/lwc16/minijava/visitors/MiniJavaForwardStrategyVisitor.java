package org.whole.crossexamples.lwc16.minijava.visitors;

import org.whole.lang.visitors.GenericForwardStrategyVisitor;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.model.Boolean;

/** 
 * @generator Whole
 */
public class MiniJavaForwardStrategyVisitor extends GenericForwardStrategyVisitor<IMiniJavaVisitor>
		implements IMiniJavaVisitor {
	public MiniJavaForwardStrategyVisitor() {
		this(new MiniJavaIdentityVisitor());
	}

	public MiniJavaForwardStrategyVisitor(IMiniJavaVisitor... initialStrategies) {
		super(initialStrategies);
	}

	public void visit(IEntity entity) {
		((IMiniJavaEntity) entity).accept(this);
	}

	public void visit(Program entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(MainClass entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(ClassDeclarations entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(ClassDeclaration entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(VariableDeclarations entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(VariableDeclaration entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(MethodDeclarations entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(MethodDeclaration entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(Boolean entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(Int entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(IntArray entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(Identifier entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(Statements entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(Block entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(IfStatement entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(WhileStatement entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(PrintlnStatement entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(VariableAssignment entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(ArrayElementAssignment entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(InfixExpression entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(InfixOperator entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(NotExpression entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(ArrayAccess entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(ArrayLength entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(MethodInvocation entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(Arguments entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(BooleanLiteral entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(IntLiteral entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(ThisExpression entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(ArrayCreation entity) {
		wGetStrategy().visit(entity);
	}

	public void visit(ClassInstanceCreation entity) {
		wGetStrategy().visit(entity);
	}
}
