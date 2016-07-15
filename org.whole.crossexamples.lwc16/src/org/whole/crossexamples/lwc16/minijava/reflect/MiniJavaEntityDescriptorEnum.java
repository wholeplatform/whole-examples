package org.whole.crossexamples.lwc16.minijava.reflect;

import org.whole.lang.reflect.EntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.crossexamples.lwc16.minijava.model.Boolean;

/** 
 * @generator Whole
 */
@SuppressWarnings("unchecked")
public class MiniJavaEntityDescriptorEnum extends EntityDescriptorEnum {
	public static final int Program_ord = 0;
	public static final int MainClass_ord = 1;
	public static final int ClassDeclarations_ord = 2;
	public static final int ClassDeclaration_ord = 3;
	public static final int VariableDeclarations_ord = 4;
	public static final int VariableDeclaration_ord = 5;
	public static final int MethodDeclarations_ord = 6;
	public static final int MethodDeclaration_ord = 7;
	public static final int Type_ord = 8;
	public static final int Boolean_ord = 9;
	public static final int Int_ord = 10;
	public static final int IntArray_ord = 11;
	public static final int Identifier_ord = 12;
	public static final int Statements_ord = 13;
	public static final int Statement_ord = 14;
	public static final int Block_ord = 15;
	public static final int IfStatement_ord = 16;
	public static final int WhileStatement_ord = 17;
	public static final int PrintlnStatement_ord = 18;
	public static final int VariableAssignment_ord = 19;
	public static final int ArrayElementAssignment_ord = 20;
	public static final int Expression_ord = 21;
	public static final int InfixExpression_ord = 22;
	public static final int InfixOperator_ord = 23;
	public static final int NotExpression_ord = 24;
	public static final int ArrayAccess_ord = 25;
	public static final int ArrayLength_ord = 26;
	public static final int MethodInvocation_ord = 27;
	public static final int Arguments_ord = 28;
	public static final int BooleanLiteral_ord = 29;
	public static final int IntLiteral_ord = 30;
	public static final int ThisExpression_ord = 31;
	public static final int ArrayCreation_ord = 32;
	public static final int ClassInstanceCreation_ord = 33;
	public static final MiniJavaEntityDescriptorEnum instance = new MiniJavaEntityDescriptorEnum();
	public static final EntityDescriptor<Program> Program = (EntityDescriptor<Program>) instance.valueOf(Program_ord);
	public static final EntityDescriptor<MainClass> MainClass = (EntityDescriptor<MainClass>) instance
			.valueOf(MainClass_ord);
	public static final EntityDescriptor<ClassDeclarations> ClassDeclarations = (EntityDescriptor<ClassDeclarations>) instance
			.valueOf(ClassDeclarations_ord);
	public static final EntityDescriptor<ClassDeclaration> ClassDeclaration = (EntityDescriptor<ClassDeclaration>) instance
			.valueOf(ClassDeclaration_ord);
	public static final EntityDescriptor<VariableDeclarations> VariableDeclarations = (EntityDescriptor<VariableDeclarations>) instance
			.valueOf(VariableDeclarations_ord);
	public static final EntityDescriptor<VariableDeclaration> VariableDeclaration = (EntityDescriptor<VariableDeclaration>) instance
			.valueOf(VariableDeclaration_ord);
	public static final EntityDescriptor<MethodDeclarations> MethodDeclarations = (EntityDescriptor<MethodDeclarations>) instance
			.valueOf(MethodDeclarations_ord);
	public static final EntityDescriptor<MethodDeclaration> MethodDeclaration = (EntityDescriptor<MethodDeclaration>) instance
			.valueOf(MethodDeclaration_ord);
	public static final EntityDescriptor<Type> Type = (EntityDescriptor<Type>) instance.valueOf(Type_ord);
	public static final EntityDescriptor<Boolean> Boolean = (EntityDescriptor<Boolean>) instance.valueOf(Boolean_ord);
	public static final EntityDescriptor<Int> Int = (EntityDescriptor<Int>) instance.valueOf(Int_ord);
	public static final EntityDescriptor<IntArray> IntArray = (EntityDescriptor<IntArray>) instance
			.valueOf(IntArray_ord);
	public static final EntityDescriptor<Identifier> Identifier = (EntityDescriptor<Identifier>) instance
			.valueOf(Identifier_ord);
	public static final EntityDescriptor<Statements> Statements = (EntityDescriptor<Statements>) instance
			.valueOf(Statements_ord);
	public static final EntityDescriptor<Statement> Statement = (EntityDescriptor<Statement>) instance
			.valueOf(Statement_ord);
	public static final EntityDescriptor<Block> Block = (EntityDescriptor<Block>) instance.valueOf(Block_ord);
	public static final EntityDescriptor<IfStatement> IfStatement = (EntityDescriptor<IfStatement>) instance
			.valueOf(IfStatement_ord);
	public static final EntityDescriptor<WhileStatement> WhileStatement = (EntityDescriptor<WhileStatement>) instance
			.valueOf(WhileStatement_ord);
	public static final EntityDescriptor<PrintlnStatement> PrintlnStatement = (EntityDescriptor<PrintlnStatement>) instance
			.valueOf(PrintlnStatement_ord);
	public static final EntityDescriptor<VariableAssignment> VariableAssignment = (EntityDescriptor<VariableAssignment>) instance
			.valueOf(VariableAssignment_ord);
	public static final EntityDescriptor<ArrayElementAssignment> ArrayElementAssignment = (EntityDescriptor<ArrayElementAssignment>) instance
			.valueOf(ArrayElementAssignment_ord);
	public static final EntityDescriptor<Expression> Expression = (EntityDescriptor<Expression>) instance
			.valueOf(Expression_ord);
	public static final EntityDescriptor<InfixExpression> InfixExpression = (EntityDescriptor<InfixExpression>) instance
			.valueOf(InfixExpression_ord);
	public static final EntityDescriptor<InfixOperator> InfixOperator = (EntityDescriptor<InfixOperator>) instance
			.valueOf(InfixOperator_ord);
	public static final EntityDescriptor<NotExpression> NotExpression = (EntityDescriptor<NotExpression>) instance
			.valueOf(NotExpression_ord);
	public static final EntityDescriptor<ArrayAccess> ArrayAccess = (EntityDescriptor<ArrayAccess>) instance
			.valueOf(ArrayAccess_ord);
	public static final EntityDescriptor<ArrayLength> ArrayLength = (EntityDescriptor<ArrayLength>) instance
			.valueOf(ArrayLength_ord);
	public static final EntityDescriptor<MethodInvocation> MethodInvocation = (EntityDescriptor<MethodInvocation>) instance
			.valueOf(MethodInvocation_ord);
	public static final EntityDescriptor<Arguments> Arguments = (EntityDescriptor<Arguments>) instance
			.valueOf(Arguments_ord);
	public static final EntityDescriptor<BooleanLiteral> BooleanLiteral = (EntityDescriptor<BooleanLiteral>) instance
			.valueOf(BooleanLiteral_ord);
	public static final EntityDescriptor<IntLiteral> IntLiteral = (EntityDescriptor<IntLiteral>) instance
			.valueOf(IntLiteral_ord);
	public static final EntityDescriptor<ThisExpression> ThisExpression = (EntityDescriptor<ThisExpression>) instance
			.valueOf(ThisExpression_ord);
	public static final EntityDescriptor<ArrayCreation> ArrayCreation = (EntityDescriptor<ArrayCreation>) instance
			.valueOf(ArrayCreation_ord);
	public static final EntityDescriptor<ClassInstanceCreation> ClassInstanceCreation = (EntityDescriptor<ClassInstanceCreation>) instance
			.valueOf(ClassInstanceCreation_ord);

	private MiniJavaEntityDescriptorEnum() {
	}

	private static final long serialVersionUID = 1;

	protected void initEntityDescriptors() {
		putSimpleEntity(Program_ord, "Program", Program.class, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.mainClass, MainClass_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.classDeclarations, ClassDeclarations_ord);
		putSimpleEntity(MainClass_ord, "MainClass", MainClass.class, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.name, Identifier_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.parameterName, Identifier_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.statement, Statement_ord);
		putCompositeEntity(ClassDeclarations_ord, "ClassDeclarations", ClassDeclarations.class, false,
				ClassDeclaration_ord, true, false);
		putSimpleEntity(ClassDeclaration_ord, "ClassDeclaration", ClassDeclaration.class, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.name, Identifier_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.superclassName, Identifier_ord, true, false, false, false,
						false)
				.withFeature(MiniJavaFeatureDescriptorEnum.variables, VariableDeclarations_ord, true, false, false,
						false, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.methods, MethodDeclarations_ord, true, false, false, false,
						false);
		putCompositeEntity(VariableDeclarations_ord, "VariableDeclarations", VariableDeclarations.class, false,
				VariableDeclaration_ord, true, false);
		putSimpleEntity(VariableDeclaration_ord, "VariableDeclaration", VariableDeclaration.class, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.type, Type_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.name, Identifier_ord);
		putCompositeEntity(MethodDeclarations_ord, "MethodDeclarations", MethodDeclarations.class, false,
				MethodDeclaration_ord, true, false);
		putSimpleEntity(MethodDeclaration_ord, "MethodDeclaration", MethodDeclaration.class, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.returnType, Type_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.name, Identifier_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.parameters, VariableDeclarations_ord, true, false, false,
						false, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.variables, VariableDeclarations_ord, true, false, false,
						false, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.statements, Statements_ord, true, false, false, false, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.returnExpression, Expression_ord);
		putSimpleEntity(Type_ord, "Type", Type.class, true, Identifier_ord, IntArray_ord, Boolean_ord, Int_ord);
		putSimpleEntity(Boolean_ord, "Boolean", Boolean.class, false);
		putSimpleEntity(Int_ord, "Int", Int.class, false);
		putSimpleEntity(IntArray_ord, "IntArray", IntArray.class, false);
		putDataEntity(Identifier_ord, "Identifier", Identifier.class, false, String.class);
		putCompositeEntity(Statements_ord, "Statements", Statements.class, false, Statement_ord, true, false);
		putSimpleEntity(Statement_ord, "Statement", Statement.class, true, IfStatement_ord, PrintlnStatement_ord,
				Block_ord, WhileStatement_ord, ArrayElementAssignment_ord, VariableAssignment_ord);
		putCompositeEntity(Block_ord, "Block", Block.class, false, Statement_ord, true, false);
		putSimpleEntity(IfStatement_ord, "IfStatement", IfStatement.class, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.expression, Expression_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.thenStatement, Statement_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.elseStatement, Statement_ord);
		putSimpleEntity(WhileStatement_ord, "WhileStatement", WhileStatement.class, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.expression, Expression_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.statement, Statement_ord);
		putSimpleEntity(PrintlnStatement_ord, "PrintlnStatement", PrintlnStatement.class, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.expression, Expression_ord);
		putSimpleEntity(VariableAssignment_ord, "VariableAssignment", VariableAssignment.class, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.name, Identifier_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.expression, Expression_ord);
		putSimpleEntity(ArrayElementAssignment_ord, "ArrayElementAssignment", ArrayElementAssignment.class, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.name, Identifier_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.index, Expression_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.expression, Expression_ord);
		putSimpleEntity(Expression_ord, "Expression", Expression.class, true, ClassInstanceCreation_ord,
				ThisExpression_ord, ArrayAccess_ord, Identifier_ord, BooleanLiteral_ord, InfixExpression_ord,
				ArrayCreation_ord, ArrayLength_ord, NotExpression_ord, MethodInvocation_ord, IntLiteral_ord);
		putSimpleEntity(InfixExpression_ord, "InfixExpression", InfixExpression.class, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.leftOperand, Expression_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.operator, InfixOperator_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.rightOperand, Expression_ord);
		putDataEntity(InfixOperator_ord, "InfixOperator", InfixOperator.class, false, InfixOperatorEnum.Value.class);
		putSimpleEntity(NotExpression_ord, "NotExpression", NotExpression.class, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.expression, Expression_ord);
		putSimpleEntity(ArrayAccess_ord, "ArrayAccess", ArrayAccess.class, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.array, Expression_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.index, Expression_ord);
		putSimpleEntity(ArrayLength_ord, "ArrayLength", ArrayLength.class, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.array, Expression_ord);
		putSimpleEntity(MethodInvocation_ord, "MethodInvocation", MethodInvocation.class, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.expression, Expression_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.name, Identifier_ord)
				.withFeature(MiniJavaFeatureDescriptorEnum.arguments, Arguments_ord, true, false, false, false, false);
		putCompositeEntity(Arguments_ord, "Arguments", Arguments.class, false, Expression_ord, true, false);
		putDataEntity(BooleanLiteral_ord, "BooleanLiteral", BooleanLiteral.class, false, boolean.class);
		putDataEntity(IntLiteral_ord, "IntLiteral", IntLiteral.class, false, int.class);
		putSimpleEntity(ThisExpression_ord, "ThisExpression", ThisExpression.class, false);
		putSimpleEntity(ArrayCreation_ord, "ArrayCreation", ArrayCreation.class, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.length, Expression_ord);
		putSimpleEntity(ClassInstanceCreation_ord, "ClassInstanceCreation", ClassInstanceCreation.class, false)
				.withFeature(MiniJavaFeatureDescriptorEnum.name, Identifier_ord);
	}
}
