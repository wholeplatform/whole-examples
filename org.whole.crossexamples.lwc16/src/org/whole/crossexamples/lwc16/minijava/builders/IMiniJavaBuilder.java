package org.whole.crossexamples.lwc16.minijava.builders;

import org.whole.lang.builders.IBuilder;
import org.whole.crossexamples.lwc16.minijava.model.InfixOperatorEnum;

/** 
 * @generator Whole
 */
public interface IMiniJavaBuilder extends IBuilder {
	public void visit();

	public void length();

	public void arguments();

	public void array();

	public void rightOperand();

	public void operator();

	public void leftOperand();

	public void index();

	public void elseStatement();

	public void thenStatement();

	public void expression();

	public void returnExpression();

	public void statements();

	public void parameters();

	public void returnType();

	public void type();

	public void methods();

	public void variables();

	public void superclassName();

	public void statement();

	public void parameterName();

	public void name();

	public void classDeclarations();

	public void mainClass();

	public void Program();

	public void Program_();

	public void _Program();

	public void MainClass();

	public void MainClass_();

	public void _MainClass();

	public void ClassDeclarations();

	public void ClassDeclarations_();

	public void ClassDeclarations_(int initialCapacity);

	public void _ClassDeclarations();

	public void ClassDeclaration();

	public void ClassDeclaration_();

	public void _ClassDeclaration();

	public void VariableDeclarations();

	public void VariableDeclarations_();

	public void VariableDeclarations_(int initialCapacity);

	public void _VariableDeclarations();

	public void VariableDeclaration();

	public void VariableDeclaration_();

	public void _VariableDeclaration();

	public void MethodDeclarations();

	public void MethodDeclarations_();

	public void MethodDeclarations_(int initialCapacity);

	public void _MethodDeclarations();

	public void MethodDeclaration();

	public void MethodDeclaration_();

	public void _MethodDeclaration();

	public void Boolean();

	public void Boolean_();

	public void _Boolean();

	public void Int();

	public void Int_();

	public void _Int();

	public void IntArray();

	public void IntArray_();

	public void _IntArray();

	public void Identifier();

	public void Identifier(String value);

	public void Statements();

	public void Statements_();

	public void Statements_(int initialCapacity);

	public void _Statements();

	public void Block();

	public void Block_();

	public void Block_(int initialCapacity);

	public void _Block();

	public void IfStatement();

	public void IfStatement_();

	public void _IfStatement();

	public void WhileStatement();

	public void WhileStatement_();

	public void _WhileStatement();

	public void PrintlnStatement();

	public void PrintlnStatement_();

	public void _PrintlnStatement();

	public void VariableAssignment();

	public void VariableAssignment_();

	public void _VariableAssignment();

	public void ArrayElementAssignment();

	public void ArrayElementAssignment_();

	public void _ArrayElementAssignment();

	public void InfixExpression();

	public void InfixExpression_();

	public void _InfixExpression();

	public void InfixOperator();

	public void InfixOperator(InfixOperatorEnum.Value value);

	public void InfixOperator(String value);

	public void NotExpression();

	public void NotExpression_();

	public void _NotExpression();

	public void ArrayAccess();

	public void ArrayAccess_();

	public void _ArrayAccess();

	public void ArrayLength();

	public void ArrayLength_();

	public void _ArrayLength();

	public void MethodInvocation();

	public void MethodInvocation_();

	public void _MethodInvocation();

	public void Arguments();

	public void Arguments_();

	public void Arguments_(int initialCapacity);

	public void _Arguments();

	public void BooleanLiteral();

	public void BooleanLiteral(boolean value);

	public void IntLiteral();

	public void IntLiteral(int value);

	public void ThisExpression();

	public void ThisExpression_();

	public void _ThisExpression();

	public void ArrayCreation();

	public void ArrayCreation_();

	public void _ArrayCreation();

	public void ClassInstanceCreation();

	public void ClassInstanceCreation_();

	public void _ClassInstanceCreation();
}
