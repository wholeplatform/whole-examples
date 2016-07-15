package org.whole.crossexamples.lwc16.minijava.visitors;

import org.whole.lang.visitors.AbstractVisitor;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.model.Boolean;

/** 
 * @generator Whole
 */
public abstract class MiniJavaIdentitySwitchVisitor extends AbstractVisitor implements IMiniJavaVisitor {
	public void visit(IEntity entity) {
		switch (entity.wGetEntityOrd()) {
		case MiniJavaEntityDescriptorEnum.Program_ord:
			visit((Program) entity);
			break;
		case MiniJavaEntityDescriptorEnum.MainClass_ord:
			visit((MainClass) entity);
			break;
		case MiniJavaEntityDescriptorEnum.ClassDeclarations_ord:
			visit((ClassDeclarations) entity);
			break;
		case MiniJavaEntityDescriptorEnum.ClassDeclaration_ord:
			visit((ClassDeclaration) entity);
			break;
		case MiniJavaEntityDescriptorEnum.VariableDeclarations_ord:
			visit((VariableDeclarations) entity);
			break;
		case MiniJavaEntityDescriptorEnum.VariableDeclaration_ord:
			visit((VariableDeclaration) entity);
			break;
		case MiniJavaEntityDescriptorEnum.MethodDeclarations_ord:
			visit((MethodDeclarations) entity);
			break;
		case MiniJavaEntityDescriptorEnum.MethodDeclaration_ord:
			visit((MethodDeclaration) entity);
			break;
		case MiniJavaEntityDescriptorEnum.Boolean_ord:
			visit((Boolean) entity);
			break;
		case MiniJavaEntityDescriptorEnum.Int_ord:
			visit((Int) entity);
			break;
		case MiniJavaEntityDescriptorEnum.IntArray_ord:
			visit((IntArray) entity);
			break;
		case MiniJavaEntityDescriptorEnum.Identifier_ord:
			visit((Identifier) entity);
			break;
		case MiniJavaEntityDescriptorEnum.Statements_ord:
			visit((Statements) entity);
			break;
		case MiniJavaEntityDescriptorEnum.Block_ord:
			visit((Block) entity);
			break;
		case MiniJavaEntityDescriptorEnum.IfStatement_ord:
			visit((IfStatement) entity);
			break;
		case MiniJavaEntityDescriptorEnum.WhileStatement_ord:
			visit((WhileStatement) entity);
			break;
		case MiniJavaEntityDescriptorEnum.PrintlnStatement_ord:
			visit((PrintlnStatement) entity);
			break;
		case MiniJavaEntityDescriptorEnum.VariableAssignment_ord:
			visit((VariableAssignment) entity);
			break;
		case MiniJavaEntityDescriptorEnum.ArrayElementAssignment_ord:
			visit((ArrayElementAssignment) entity);
			break;
		case MiniJavaEntityDescriptorEnum.InfixExpression_ord:
			visit((InfixExpression) entity);
			break;
		case MiniJavaEntityDescriptorEnum.InfixOperator_ord:
			visit((InfixOperator) entity);
			break;
		case MiniJavaEntityDescriptorEnum.NotExpression_ord:
			visit((NotExpression) entity);
			break;
		case MiniJavaEntityDescriptorEnum.ArrayAccess_ord:
			visit((ArrayAccess) entity);
			break;
		case MiniJavaEntityDescriptorEnum.ArrayLength_ord:
			visit((ArrayLength) entity);
			break;
		case MiniJavaEntityDescriptorEnum.MethodInvocation_ord:
			visit((MethodInvocation) entity);
			break;
		case MiniJavaEntityDescriptorEnum.Arguments_ord:
			visit((Arguments) entity);
			break;
		case MiniJavaEntityDescriptorEnum.BooleanLiteral_ord:
			visit((BooleanLiteral) entity);
			break;
		case MiniJavaEntityDescriptorEnum.IntLiteral_ord:
			visit((IntLiteral) entity);
			break;
		case MiniJavaEntityDescriptorEnum.ThisExpression_ord:
			visit((ThisExpression) entity);
			break;
		case MiniJavaEntityDescriptorEnum.ArrayCreation_ord:
			visit((ArrayCreation) entity);
			break;
		case MiniJavaEntityDescriptorEnum.ClassInstanceCreation_ord:
			visit((ClassInstanceCreation) entity);
			break;
		}
	}
}
