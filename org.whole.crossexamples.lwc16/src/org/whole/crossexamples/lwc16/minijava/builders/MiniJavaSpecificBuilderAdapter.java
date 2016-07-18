package org.whole.crossexamples.lwc16.minijava.builders;

import org.whole.lang.builders.GenericBuilderContext;
import org.whole.lang.builders.IBuilder;
import org.whole.lang.contexts.IEntityContext;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaFeatureDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.model.InfixOperatorEnum;

/** 
 * @generator Whole
 */
public class MiniJavaSpecificBuilderAdapter extends GenericBuilderContext implements IMiniJavaBuilder {
	public MiniJavaSpecificBuilderAdapter(IBuilder strategy) {
		super(strategy);
	}

	public MiniJavaSpecificBuilderAdapter(IBuilder strategy, IEntityContext entityContext) {
		super(strategy, entityContext);
	}

	public void length() {
		wFeature(MiniJavaFeatureDescriptorEnum.length);
	}

	public void arguments() {
		wFeature(MiniJavaFeatureDescriptorEnum.arguments);
	}

	public void array() {
		wFeature(MiniJavaFeatureDescriptorEnum.array);
	}

	public void rightOperand() {
		wFeature(MiniJavaFeatureDescriptorEnum.rightOperand);
	}

	public void operator() {
		wFeature(MiniJavaFeatureDescriptorEnum.operator);
	}

	public void leftOperand() {
		wFeature(MiniJavaFeatureDescriptorEnum.leftOperand);
	}

	public void index() {
		wFeature(MiniJavaFeatureDescriptorEnum.index);
	}

	public void elseStatement() {
		wFeature(MiniJavaFeatureDescriptorEnum.elseStatement);
	}

	public void thenStatement() {
		wFeature(MiniJavaFeatureDescriptorEnum.thenStatement);
	}

	public void expression() {
		wFeature(MiniJavaFeatureDescriptorEnum.expression);
	}

	public void returnExpression() {
		wFeature(MiniJavaFeatureDescriptorEnum.returnExpression);
	}

	public void statements() {
		wFeature(MiniJavaFeatureDescriptorEnum.statements);
	}

	public void parameters() {
		wFeature(MiniJavaFeatureDescriptorEnum.parameters);
	}

	public void returnType() {
		wFeature(MiniJavaFeatureDescriptorEnum.returnType);
	}

	public void type() {
		wFeature(MiniJavaFeatureDescriptorEnum.type);
	}

	public void methods() {
		wFeature(MiniJavaFeatureDescriptorEnum.methods);
	}

	public void variables() {
		wFeature(MiniJavaFeatureDescriptorEnum.variables);
	}

	public void superclassName() {
		wFeature(MiniJavaFeatureDescriptorEnum.superclassName);
	}

	public void statement() {
		wFeature(MiniJavaFeatureDescriptorEnum.statement);
	}

	public void parameterName() {
		wFeature(MiniJavaFeatureDescriptorEnum.parameterName);
	}

	public void name() {
		wFeature(MiniJavaFeatureDescriptorEnum.name);
	}

	public void classDeclarations() {
		wFeature(MiniJavaFeatureDescriptorEnum.classDeclarations);
	}

	public void mainClass() {
		wFeature(MiniJavaFeatureDescriptorEnum.mainClass);
	}

	public void visit() {
	}

	public void Program() {
		wEntity(MiniJavaEntityDescriptorEnum.Program);
	}

	public void Program_() {
		wEntity_(MiniJavaEntityDescriptorEnum.Program);
	}

	public void _Program() {
		_wEntity(MiniJavaEntityDescriptorEnum.Program);
	}

	public void MainClass() {
		wEntity(MiniJavaEntityDescriptorEnum.MainClass);
	}

	public void MainClass_() {
		wEntity_(MiniJavaEntityDescriptorEnum.MainClass);
	}

	public void _MainClass() {
		_wEntity(MiniJavaEntityDescriptorEnum.MainClass);
	}

	public void ClassDeclarations() {
		wEntity(MiniJavaEntityDescriptorEnum.ClassDeclarations);
	}

	public void ClassDeclarations_() {
		wEntity_(MiniJavaEntityDescriptorEnum.ClassDeclarations);
	}

	public void ClassDeclarations_(int initialCapacity) {
		wEntity_(MiniJavaEntityDescriptorEnum.ClassDeclarations, initialCapacity);
	}

	public void _ClassDeclarations() {
		_wEntity(MiniJavaEntityDescriptorEnum.ClassDeclarations);
	}

	public void ClassDeclaration() {
		wEntity(MiniJavaEntityDescriptorEnum.ClassDeclaration);
	}

	public void ClassDeclaration_() {
		wEntity_(MiniJavaEntityDescriptorEnum.ClassDeclaration);
	}

	public void _ClassDeclaration() {
		_wEntity(MiniJavaEntityDescriptorEnum.ClassDeclaration);
	}

	public void VariableDeclarations() {
		wEntity(MiniJavaEntityDescriptorEnum.VariableDeclarations);
	}

	public void VariableDeclarations_() {
		wEntity_(MiniJavaEntityDescriptorEnum.VariableDeclarations);
	}

	public void VariableDeclarations_(int initialCapacity) {
		wEntity_(MiniJavaEntityDescriptorEnum.VariableDeclarations, initialCapacity);
	}

	public void _VariableDeclarations() {
		_wEntity(MiniJavaEntityDescriptorEnum.VariableDeclarations);
	}

	public void VariableDeclaration() {
		wEntity(MiniJavaEntityDescriptorEnum.VariableDeclaration);
	}

	public void VariableDeclaration_() {
		wEntity_(MiniJavaEntityDescriptorEnum.VariableDeclaration);
	}

	public void _VariableDeclaration() {
		_wEntity(MiniJavaEntityDescriptorEnum.VariableDeclaration);
	}

	public void MethodDeclarations() {
		wEntity(MiniJavaEntityDescriptorEnum.MethodDeclarations);
	}

	public void MethodDeclarations_() {
		wEntity_(MiniJavaEntityDescriptorEnum.MethodDeclarations);
	}

	public void MethodDeclarations_(int initialCapacity) {
		wEntity_(MiniJavaEntityDescriptorEnum.MethodDeclarations, initialCapacity);
	}

	public void _MethodDeclarations() {
		_wEntity(MiniJavaEntityDescriptorEnum.MethodDeclarations);
	}

	public void MethodDeclaration() {
		wEntity(MiniJavaEntityDescriptorEnum.MethodDeclaration);
	}

	public void MethodDeclaration_() {
		wEntity_(MiniJavaEntityDescriptorEnum.MethodDeclaration);
	}

	public void _MethodDeclaration() {
		_wEntity(MiniJavaEntityDescriptorEnum.MethodDeclaration);
	}

	public void Boolean() {
		wEntity(MiniJavaEntityDescriptorEnum.Boolean);
	}

	public void Boolean_() {
		wEntity_(MiniJavaEntityDescriptorEnum.Boolean);
	}

	public void _Boolean() {
		_wEntity(MiniJavaEntityDescriptorEnum.Boolean);
	}

	public void Int() {
		wEntity(MiniJavaEntityDescriptorEnum.Int);
	}

	public void Int_() {
		wEntity_(MiniJavaEntityDescriptorEnum.Int);
	}

	public void _Int() {
		_wEntity(MiniJavaEntityDescriptorEnum.Int);
	}

	public void IntArray() {
		wEntity(MiniJavaEntityDescriptorEnum.IntArray);
	}

	public void IntArray_() {
		wEntity_(MiniJavaEntityDescriptorEnum.IntArray);
	}

	public void _IntArray() {
		_wEntity(MiniJavaEntityDescriptorEnum.IntArray);
	}

	public void Identifier() {
		wEntity(MiniJavaEntityDescriptorEnum.Identifier);
	}

	public void Identifier(String value) {
		wEntity(MiniJavaEntityDescriptorEnum.Identifier, value);
	}

	public void Statements() {
		wEntity(MiniJavaEntityDescriptorEnum.Statements);
	}

	public void Statements_() {
		wEntity_(MiniJavaEntityDescriptorEnum.Statements);
	}

	public void Statements_(int initialCapacity) {
		wEntity_(MiniJavaEntityDescriptorEnum.Statements, initialCapacity);
	}

	public void _Statements() {
		_wEntity(MiniJavaEntityDescriptorEnum.Statements);
	}

	public void Block() {
		wEntity(MiniJavaEntityDescriptorEnum.Block);
	}

	public void Block_() {
		wEntity_(MiniJavaEntityDescriptorEnum.Block);
	}

	public void Block_(int initialCapacity) {
		wEntity_(MiniJavaEntityDescriptorEnum.Block, initialCapacity);
	}

	public void _Block() {
		_wEntity(MiniJavaEntityDescriptorEnum.Block);
	}

	public void IfStatement() {
		wEntity(MiniJavaEntityDescriptorEnum.IfStatement);
	}

	public void IfStatement_() {
		wEntity_(MiniJavaEntityDescriptorEnum.IfStatement);
	}

	public void _IfStatement() {
		_wEntity(MiniJavaEntityDescriptorEnum.IfStatement);
	}

	public void WhileStatement() {
		wEntity(MiniJavaEntityDescriptorEnum.WhileStatement);
	}

	public void WhileStatement_() {
		wEntity_(MiniJavaEntityDescriptorEnum.WhileStatement);
	}

	public void _WhileStatement() {
		_wEntity(MiniJavaEntityDescriptorEnum.WhileStatement);
	}

	public void PrintlnStatement() {
		wEntity(MiniJavaEntityDescriptorEnum.PrintlnStatement);
	}

	public void PrintlnStatement_() {
		wEntity_(MiniJavaEntityDescriptorEnum.PrintlnStatement);
	}

	public void _PrintlnStatement() {
		_wEntity(MiniJavaEntityDescriptorEnum.PrintlnStatement);
	}

	public void VariableAssignment() {
		wEntity(MiniJavaEntityDescriptorEnum.VariableAssignment);
	}

	public void VariableAssignment_() {
		wEntity_(MiniJavaEntityDescriptorEnum.VariableAssignment);
	}

	public void _VariableAssignment() {
		_wEntity(MiniJavaEntityDescriptorEnum.VariableAssignment);
	}

	public void ArrayElementAssignment() {
		wEntity(MiniJavaEntityDescriptorEnum.ArrayElementAssignment);
	}

	public void ArrayElementAssignment_() {
		wEntity_(MiniJavaEntityDescriptorEnum.ArrayElementAssignment);
	}

	public void _ArrayElementAssignment() {
		_wEntity(MiniJavaEntityDescriptorEnum.ArrayElementAssignment);
	}

	public void InfixExpression() {
		wEntity(MiniJavaEntityDescriptorEnum.InfixExpression);
	}

	public void InfixExpression_() {
		wEntity_(MiniJavaEntityDescriptorEnum.InfixExpression);
	}

	public void _InfixExpression() {
		_wEntity(MiniJavaEntityDescriptorEnum.InfixExpression);
	}

	public void InfixOperator() {
		wEntity(MiniJavaEntityDescriptorEnum.InfixOperator);
	}

	public void InfixOperator(InfixOperatorEnum.Value value) {
		wEntity(MiniJavaEntityDescriptorEnum.InfixOperator, value);
	}

	public void InfixOperator(String value) {
		wEntity(MiniJavaEntityDescriptorEnum.InfixOperator, value);
	}

	public void NotExpression() {
		wEntity(MiniJavaEntityDescriptorEnum.NotExpression);
	}

	public void NotExpression_() {
		wEntity_(MiniJavaEntityDescriptorEnum.NotExpression);
	}

	public void _NotExpression() {
		_wEntity(MiniJavaEntityDescriptorEnum.NotExpression);
	}

	public void ParenthesizedExpression() {
		wEntity(MiniJavaEntityDescriptorEnum.ParenthesizedExpression);
	}

	public void ParenthesizedExpression_() {
		wEntity_(MiniJavaEntityDescriptorEnum.ParenthesizedExpression);
	}

	public void _ParenthesizedExpression() {
		_wEntity(MiniJavaEntityDescriptorEnum.ParenthesizedExpression);
	}

	public void ArrayAccess() {
		wEntity(MiniJavaEntityDescriptorEnum.ArrayAccess);
	}

	public void ArrayAccess_() {
		wEntity_(MiniJavaEntityDescriptorEnum.ArrayAccess);
	}

	public void _ArrayAccess() {
		_wEntity(MiniJavaEntityDescriptorEnum.ArrayAccess);
	}

	public void ArrayLength() {
		wEntity(MiniJavaEntityDescriptorEnum.ArrayLength);
	}

	public void ArrayLength_() {
		wEntity_(MiniJavaEntityDescriptorEnum.ArrayLength);
	}

	public void _ArrayLength() {
		_wEntity(MiniJavaEntityDescriptorEnum.ArrayLength);
	}

	public void MethodInvocation() {
		wEntity(MiniJavaEntityDescriptorEnum.MethodInvocation);
	}

	public void MethodInvocation_() {
		wEntity_(MiniJavaEntityDescriptorEnum.MethodInvocation);
	}

	public void _MethodInvocation() {
		_wEntity(MiniJavaEntityDescriptorEnum.MethodInvocation);
	}

	public void Arguments() {
		wEntity(MiniJavaEntityDescriptorEnum.Arguments);
	}

	public void Arguments_() {
		wEntity_(MiniJavaEntityDescriptorEnum.Arguments);
	}

	public void Arguments_(int initialCapacity) {
		wEntity_(MiniJavaEntityDescriptorEnum.Arguments, initialCapacity);
	}

	public void _Arguments() {
		_wEntity(MiniJavaEntityDescriptorEnum.Arguments);
	}

	public void BooleanLiteral() {
		wEntity(MiniJavaEntityDescriptorEnum.BooleanLiteral);
	}

	public void BooleanLiteral(boolean value) {
		wEntity(MiniJavaEntityDescriptorEnum.BooleanLiteral, value);
	}

	public void IntLiteral() {
		wEntity(MiniJavaEntityDescriptorEnum.IntLiteral);
	}

	public void IntLiteral(int value) {
		wEntity(MiniJavaEntityDescriptorEnum.IntLiteral, value);
	}

	public void ThisExpression() {
		wEntity(MiniJavaEntityDescriptorEnum.ThisExpression);
	}

	public void ThisExpression_() {
		wEntity_(MiniJavaEntityDescriptorEnum.ThisExpression);
	}

	public void _ThisExpression() {
		_wEntity(MiniJavaEntityDescriptorEnum.ThisExpression);
	}

	public void ArrayCreation() {
		wEntity(MiniJavaEntityDescriptorEnum.ArrayCreation);
	}

	public void ArrayCreation_() {
		wEntity_(MiniJavaEntityDescriptorEnum.ArrayCreation);
	}

	public void _ArrayCreation() {
		_wEntity(MiniJavaEntityDescriptorEnum.ArrayCreation);
	}

	public void ClassInstanceCreation() {
		wEntity(MiniJavaEntityDescriptorEnum.ClassInstanceCreation);
	}

	public void ClassInstanceCreation_() {
		wEntity_(MiniJavaEntityDescriptorEnum.ClassInstanceCreation);
	}

	public void _ClassInstanceCreation() {
		_wEntity(MiniJavaEntityDescriptorEnum.ClassInstanceCreation);
	}
}
