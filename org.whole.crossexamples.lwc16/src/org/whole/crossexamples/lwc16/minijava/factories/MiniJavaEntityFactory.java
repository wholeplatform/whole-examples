package org.whole.crossexamples.lwc16.minijava.factories;

import org.whole.lang.factories.GenericEntityFactory;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.lang.factories.RegistryConfigurations;
import org.whole.lang.factories.IEntityRegistryProvider;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.lang.factories.IEntityBuilder;
import org.whole.lang.factories.EntityBuilder;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.model.Boolean;

/** 
 * @generator Whole
 */
public class MiniJavaEntityFactory extends GenericEntityFactory {
	public static final MiniJavaEntityFactory instance = instance(RegistryConfigurations.DEFAULT);

	public static MiniJavaEntityFactory instance(IEntityRegistryProvider provider) {
		return new MiniJavaEntityFactory(provider);
	}

	protected MiniJavaEntityFactory(IEntityRegistryProvider provider) {
		super(provider);
	}

	public Program createProgram() {
		return create(MiniJavaEntityDescriptorEnum.Program);
	}

	public Program createProgram(MainClass mainClass, ClassDeclarations classDeclarations) {
		return create(MiniJavaEntityDescriptorEnum.Program, mainClass, classDeclarations);
	}

	public IEntityBuilder<Program> buildProgram() {
		return new EntityBuilder<Program>(create(MiniJavaEntityDescriptorEnum.Program));
	}

	public MainClass createMainClass() {
		return create(MiniJavaEntityDescriptorEnum.MainClass);
	}

	public MainClass createMainClass(Identifier name, Identifier parameterName, Statement statement) {
		return create(MiniJavaEntityDescriptorEnum.MainClass, name, parameterName, statement);
	}

	public IEntityBuilder<MainClass> buildMainClass() {
		return new EntityBuilder<MainClass>(create(MiniJavaEntityDescriptorEnum.MainClass));
	}

	public ClassDeclarations createClassDeclarations() {
		return create(MiniJavaEntityDescriptorEnum.ClassDeclarations);
	}

	public ClassDeclarations createClassDeclarations(ClassDeclaration... entities) {
		return create(MiniJavaEntityDescriptorEnum.ClassDeclarations, (IEntity[]) entities);
	}

	public ClassDeclarations createClassDeclarations(int initialSize) {
		return clone(MiniJavaEntityDescriptorEnum.ClassDeclarations, initialSize);
	}

	public ClassDeclaration createClassDeclaration() {
		return create(MiniJavaEntityDescriptorEnum.ClassDeclaration);
	}

	public ClassDeclaration createClassDeclaration(Identifier name, Identifier superclassName,
			VariableDeclarations variables, MethodDeclarations methods) {
		return create(MiniJavaEntityDescriptorEnum.ClassDeclaration, name, superclassName, variables, methods);
	}

	public IEntityBuilder<ClassDeclaration> buildClassDeclaration() {
		return new EntityBuilder<ClassDeclaration>(create(MiniJavaEntityDescriptorEnum.ClassDeclaration));
	}

	public VariableDeclarations createVariableDeclarations() {
		return create(MiniJavaEntityDescriptorEnum.VariableDeclarations);
	}

	public VariableDeclarations createVariableDeclarations(VariableDeclaration... entities) {
		return create(MiniJavaEntityDescriptorEnum.VariableDeclarations, (IEntity[]) entities);
	}

	public VariableDeclarations createVariableDeclarations(int initialSize) {
		return clone(MiniJavaEntityDescriptorEnum.VariableDeclarations, initialSize);
	}

	public VariableDeclaration createVariableDeclaration() {
		return create(MiniJavaEntityDescriptorEnum.VariableDeclaration);
	}

	public VariableDeclaration createVariableDeclaration(Type type, Identifier name) {
		return create(MiniJavaEntityDescriptorEnum.VariableDeclaration, type, name);
	}

	public IEntityBuilder<VariableDeclaration> buildVariableDeclaration() {
		return new EntityBuilder<VariableDeclaration>(create(MiniJavaEntityDescriptorEnum.VariableDeclaration));
	}

	public MethodDeclarations createMethodDeclarations() {
		return create(MiniJavaEntityDescriptorEnum.MethodDeclarations);
	}

	public MethodDeclarations createMethodDeclarations(MethodDeclaration... entities) {
		return create(MiniJavaEntityDescriptorEnum.MethodDeclarations, (IEntity[]) entities);
	}

	public MethodDeclarations createMethodDeclarations(int initialSize) {
		return clone(MiniJavaEntityDescriptorEnum.MethodDeclarations, initialSize);
	}

	public MethodDeclaration createMethodDeclaration() {
		return create(MiniJavaEntityDescriptorEnum.MethodDeclaration);
	}

	public MethodDeclaration createMethodDeclaration(Type returnType, Identifier name, VariableDeclarations parameters,
			VariableDeclarations variables, Statements statements, Expression returnExpression) {
		return create(MiniJavaEntityDescriptorEnum.MethodDeclaration, returnType, name, parameters, variables,
				statements, returnExpression);
	}

	public IEntityBuilder<MethodDeclaration> buildMethodDeclaration() {
		return new EntityBuilder<MethodDeclaration>(create(MiniJavaEntityDescriptorEnum.MethodDeclaration));
	}

	public Boolean createBoolean() {
		return create(MiniJavaEntityDescriptorEnum.Boolean);
	}

	public Int createInt() {
		return create(MiniJavaEntityDescriptorEnum.Int);
	}

	public IntArray createIntArray() {
		return create(MiniJavaEntityDescriptorEnum.IntArray);
	}

	public Identifier createIdentifier() {
		return create(MiniJavaEntityDescriptorEnum.Identifier);
	}

	public Identifier createIdentifier(String value) {
		return create(MiniJavaEntityDescriptorEnum.Identifier, value);
	}

	public Statements createStatements() {
		return create(MiniJavaEntityDescriptorEnum.Statements);
	}

	public Statements createStatements(Statement... entities) {
		return create(MiniJavaEntityDescriptorEnum.Statements, (IEntity[]) entities);
	}

	public Statements createStatements(int initialSize) {
		return clone(MiniJavaEntityDescriptorEnum.Statements, initialSize);
	}

	public Block createBlock() {
		return create(MiniJavaEntityDescriptorEnum.Block);
	}

	public Block createBlock(Statement... entities) {
		return create(MiniJavaEntityDescriptorEnum.Block, (IEntity[]) entities);
	}

	public Block createBlock(int initialSize) {
		return clone(MiniJavaEntityDescriptorEnum.Block, initialSize);
	}

	public IfStatement createIfStatement() {
		return create(MiniJavaEntityDescriptorEnum.IfStatement);
	}

	public IfStatement createIfStatement(Expression expression, Statement thenStatement, Statement elseStatement) {
		return create(MiniJavaEntityDescriptorEnum.IfStatement, expression, thenStatement, elseStatement);
	}

	public IEntityBuilder<IfStatement> buildIfStatement() {
		return new EntityBuilder<IfStatement>(create(MiniJavaEntityDescriptorEnum.IfStatement));
	}

	public WhileStatement createWhileStatement() {
		return create(MiniJavaEntityDescriptorEnum.WhileStatement);
	}

	public WhileStatement createWhileStatement(Expression expression, Statement statement) {
		return create(MiniJavaEntityDescriptorEnum.WhileStatement, expression, statement);
	}

	public IEntityBuilder<WhileStatement> buildWhileStatement() {
		return new EntityBuilder<WhileStatement>(create(MiniJavaEntityDescriptorEnum.WhileStatement));
	}

	public PrintlnStatement createPrintlnStatement() {
		return create(MiniJavaEntityDescriptorEnum.PrintlnStatement);
	}

	public PrintlnStatement createPrintlnStatement(Expression expression) {
		return create(MiniJavaEntityDescriptorEnum.PrintlnStatement, expression);
	}

	public VariableAssignment createVariableAssignment() {
		return create(MiniJavaEntityDescriptorEnum.VariableAssignment);
	}

	public VariableAssignment createVariableAssignment(Identifier name, Expression expression) {
		return create(MiniJavaEntityDescriptorEnum.VariableAssignment, name, expression);
	}

	public IEntityBuilder<VariableAssignment> buildVariableAssignment() {
		return new EntityBuilder<VariableAssignment>(create(MiniJavaEntityDescriptorEnum.VariableAssignment));
	}

	public ArrayElementAssignment createArrayElementAssignment() {
		return create(MiniJavaEntityDescriptorEnum.ArrayElementAssignment);
	}

	public ArrayElementAssignment createArrayElementAssignment(Identifier name, Expression index,
			Expression expression) {
		return create(MiniJavaEntityDescriptorEnum.ArrayElementAssignment, name, index, expression);
	}

	public IEntityBuilder<ArrayElementAssignment> buildArrayElementAssignment() {
		return new EntityBuilder<ArrayElementAssignment>(create(MiniJavaEntityDescriptorEnum.ArrayElementAssignment));
	}

	public InfixExpression createInfixExpression() {
		return create(MiniJavaEntityDescriptorEnum.InfixExpression);
	}

	public InfixExpression createInfixExpression(Expression leftOperand, InfixOperator operator,
			Expression rightOperand) {
		return create(MiniJavaEntityDescriptorEnum.InfixExpression, leftOperand, operator, rightOperand);
	}

	public IEntityBuilder<InfixExpression> buildInfixExpression() {
		return new EntityBuilder<InfixExpression>(create(MiniJavaEntityDescriptorEnum.InfixExpression));
	}

	public InfixOperator createInfixOperator() {
		return create(MiniJavaEntityDescriptorEnum.InfixOperator);
	}

	public InfixOperator createInfixOperator(InfixOperatorEnum.Value value) {
		return create(MiniJavaEntityDescriptorEnum.InfixOperator, value);
	}

	public NotExpression createNotExpression() {
		return create(MiniJavaEntityDescriptorEnum.NotExpression);
	}

	public NotExpression createNotExpression(Expression expression) {
		return create(MiniJavaEntityDescriptorEnum.NotExpression, expression);
	}

	public ParenthesizedExpression createParenthesizedExpression() {
		return create(MiniJavaEntityDescriptorEnum.ParenthesizedExpression);
	}

	public ParenthesizedExpression createParenthesizedExpression(Expression expression) {
		return create(MiniJavaEntityDescriptorEnum.ParenthesizedExpression, expression);
	}

	public ArrayAccess createArrayAccess() {
		return create(MiniJavaEntityDescriptorEnum.ArrayAccess);
	}

	public ArrayAccess createArrayAccess(Expression array, Expression index) {
		return create(MiniJavaEntityDescriptorEnum.ArrayAccess, array, index);
	}

	public IEntityBuilder<ArrayAccess> buildArrayAccess() {
		return new EntityBuilder<ArrayAccess>(create(MiniJavaEntityDescriptorEnum.ArrayAccess));
	}

	public ArrayLength createArrayLength() {
		return create(MiniJavaEntityDescriptorEnum.ArrayLength);
	}

	public ArrayLength createArrayLength(Expression array) {
		return create(MiniJavaEntityDescriptorEnum.ArrayLength, array);
	}

	public MethodInvocation createMethodInvocation() {
		return create(MiniJavaEntityDescriptorEnum.MethodInvocation);
	}

	public MethodInvocation createMethodInvocation(Expression expression, Identifier name, Arguments arguments) {
		return create(MiniJavaEntityDescriptorEnum.MethodInvocation, expression, name, arguments);
	}

	public IEntityBuilder<MethodInvocation> buildMethodInvocation() {
		return new EntityBuilder<MethodInvocation>(create(MiniJavaEntityDescriptorEnum.MethodInvocation));
	}

	public Arguments createArguments() {
		return create(MiniJavaEntityDescriptorEnum.Arguments);
	}

	public Arguments createArguments(Expression... entities) {
		return create(MiniJavaEntityDescriptorEnum.Arguments, (IEntity[]) entities);
	}

	public Arguments createArguments(int initialSize) {
		return clone(MiniJavaEntityDescriptorEnum.Arguments, initialSize);
	}

	public BooleanLiteral createBooleanLiteral() {
		return create(MiniJavaEntityDescriptorEnum.BooleanLiteral);
	}

	public BooleanLiteral createBooleanLiteral(boolean value) {
		return create(MiniJavaEntityDescriptorEnum.BooleanLiteral, value);
	}

	public IntLiteral createIntLiteral() {
		return create(MiniJavaEntityDescriptorEnum.IntLiteral);
	}

	public IntLiteral createIntLiteral(int value) {
		return create(MiniJavaEntityDescriptorEnum.IntLiteral, value);
	}

	public ThisExpression createThisExpression() {
		return create(MiniJavaEntityDescriptorEnum.ThisExpression);
	}

	public ArrayCreation createArrayCreation() {
		return create(MiniJavaEntityDescriptorEnum.ArrayCreation);
	}

	public ArrayCreation createArrayCreation(Expression length) {
		return create(MiniJavaEntityDescriptorEnum.ArrayCreation, length);
	}

	public ClassInstanceCreation createClassInstanceCreation() {
		return create(MiniJavaEntityDescriptorEnum.ClassInstanceCreation);
	}

	public ClassInstanceCreation createClassInstanceCreation(Identifier name) {
		return create(MiniJavaEntityDescriptorEnum.ClassInstanceCreation, name);
	}
}
