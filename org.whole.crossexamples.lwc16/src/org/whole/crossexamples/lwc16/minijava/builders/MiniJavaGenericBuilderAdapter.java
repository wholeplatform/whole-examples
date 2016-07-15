package org.whole.crossexamples.lwc16.minijava.builders;

import org.whole.lang.builders.GenericIdentityBuilder;
import org.whole.lang.contexts.IEntityContext;
import org.whole.lang.reflect.FeatureDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaFeatureDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.lang.model.EnumValue;
import org.whole.crossexamples.lwc16.minijava.model.InfixOperatorEnum.Value;

/** 
 * @generator Whole
 */
public class MiniJavaGenericBuilderAdapter extends GenericIdentityBuilder {
	private IMiniJavaBuilder specificBuilder;

	public MiniJavaGenericBuilderAdapter(IMiniJavaBuilder specificBuilder) {
		this.specificBuilder = specificBuilder;
	}

	public MiniJavaGenericBuilderAdapter(IMiniJavaBuilder specificBuilder, IEntityContext entityContext) {
		this(specificBuilder);
		wSetEntityContext(entityContext);
	}

	public void visit() {
	}

	public void wFeature(FeatureDescriptor featureDesc) {
		switch (featureDesc.getOrdinal()) {
		case MiniJavaFeatureDescriptorEnum.mainClass_ord:
			specificBuilder.mainClass();
			break;
		case MiniJavaFeatureDescriptorEnum.classDeclarations_ord:
			specificBuilder.classDeclarations();
			break;
		case MiniJavaFeatureDescriptorEnum.name_ord:
			specificBuilder.name();
			break;
		case MiniJavaFeatureDescriptorEnum.parameterName_ord:
			specificBuilder.parameterName();
			break;
		case MiniJavaFeatureDescriptorEnum.statement_ord:
			specificBuilder.statement();
			break;
		case MiniJavaFeatureDescriptorEnum.superclassName_ord:
			specificBuilder.superclassName();
			break;
		case MiniJavaFeatureDescriptorEnum.variables_ord:
			specificBuilder.variables();
			break;
		case MiniJavaFeatureDescriptorEnum.methods_ord:
			specificBuilder.methods();
			break;
		case MiniJavaFeatureDescriptorEnum.type_ord:
			specificBuilder.type();
			break;
		case MiniJavaFeatureDescriptorEnum.returnType_ord:
			specificBuilder.returnType();
			break;
		case MiniJavaFeatureDescriptorEnum.parameters_ord:
			specificBuilder.parameters();
			break;
		case MiniJavaFeatureDescriptorEnum.statements_ord:
			specificBuilder.statements();
			break;
		case MiniJavaFeatureDescriptorEnum.returnExpression_ord:
			specificBuilder.returnExpression();
			break;
		case MiniJavaFeatureDescriptorEnum.expression_ord:
			specificBuilder.expression();
			break;
		case MiniJavaFeatureDescriptorEnum.thenStatement_ord:
			specificBuilder.thenStatement();
			break;
		case MiniJavaFeatureDescriptorEnum.elseStatement_ord:
			specificBuilder.elseStatement();
			break;
		case MiniJavaFeatureDescriptorEnum.index_ord:
			specificBuilder.index();
			break;
		case MiniJavaFeatureDescriptorEnum.leftOperand_ord:
			specificBuilder.leftOperand();
			break;
		case MiniJavaFeatureDescriptorEnum.operator_ord:
			specificBuilder.operator();
			break;
		case MiniJavaFeatureDescriptorEnum.rightOperand_ord:
			specificBuilder.rightOperand();
			break;
		case MiniJavaFeatureDescriptorEnum.array_ord:
			specificBuilder.array();
			break;
		case MiniJavaFeatureDescriptorEnum.arguments_ord:
			specificBuilder.arguments();
			break;
		case MiniJavaFeatureDescriptorEnum.length_ord:
			specificBuilder.length();
			break;
		}
	}

	public void wEntity(EntityDescriptor<?> entityDesc) {
		switch (entityDesc.getOrdinal()) {
		case MiniJavaEntityDescriptorEnum.Program_ord:
			specificBuilder.Program();
			break;
		case MiniJavaEntityDescriptorEnum.MainClass_ord:
			specificBuilder.MainClass();
			break;
		case MiniJavaEntityDescriptorEnum.ClassDeclarations_ord:
			specificBuilder.ClassDeclarations();
			break;
		case MiniJavaEntityDescriptorEnum.ClassDeclaration_ord:
			specificBuilder.ClassDeclaration();
			break;
		case MiniJavaEntityDescriptorEnum.VariableDeclarations_ord:
			specificBuilder.VariableDeclarations();
			break;
		case MiniJavaEntityDescriptorEnum.VariableDeclaration_ord:
			specificBuilder.VariableDeclaration();
			break;
		case MiniJavaEntityDescriptorEnum.MethodDeclarations_ord:
			specificBuilder.MethodDeclarations();
			break;
		case MiniJavaEntityDescriptorEnum.MethodDeclaration_ord:
			specificBuilder.MethodDeclaration();
			break;
		case MiniJavaEntityDescriptorEnum.Boolean_ord:
			specificBuilder.Boolean();
			break;
		case MiniJavaEntityDescriptorEnum.Int_ord:
			specificBuilder.Int();
			break;
		case MiniJavaEntityDescriptorEnum.IntArray_ord:
			specificBuilder.IntArray();
			break;
		case MiniJavaEntityDescriptorEnum.Statements_ord:
			specificBuilder.Statements();
			break;
		case MiniJavaEntityDescriptorEnum.Block_ord:
			specificBuilder.Block();
			break;
		case MiniJavaEntityDescriptorEnum.IfStatement_ord:
			specificBuilder.IfStatement();
			break;
		case MiniJavaEntityDescriptorEnum.WhileStatement_ord:
			specificBuilder.WhileStatement();
			break;
		case MiniJavaEntityDescriptorEnum.PrintlnStatement_ord:
			specificBuilder.PrintlnStatement();
			break;
		case MiniJavaEntityDescriptorEnum.VariableAssignment_ord:
			specificBuilder.VariableAssignment();
			break;
		case MiniJavaEntityDescriptorEnum.ArrayElementAssignment_ord:
			specificBuilder.ArrayElementAssignment();
			break;
		case MiniJavaEntityDescriptorEnum.InfixExpression_ord:
			specificBuilder.InfixExpression();
			break;
		case MiniJavaEntityDescriptorEnum.NotExpression_ord:
			specificBuilder.NotExpression();
			break;
		case MiniJavaEntityDescriptorEnum.ArrayAccess_ord:
			specificBuilder.ArrayAccess();
			break;
		case MiniJavaEntityDescriptorEnum.ArrayLength_ord:
			specificBuilder.ArrayLength();
			break;
		case MiniJavaEntityDescriptorEnum.MethodInvocation_ord:
			specificBuilder.MethodInvocation();
			break;
		case MiniJavaEntityDescriptorEnum.Arguments_ord:
			specificBuilder.Arguments();
			break;
		case MiniJavaEntityDescriptorEnum.ThisExpression_ord:
			specificBuilder.ThisExpression();
			break;
		case MiniJavaEntityDescriptorEnum.ArrayCreation_ord:
			specificBuilder.ArrayCreation();
			break;
		case MiniJavaEntityDescriptorEnum.ClassInstanceCreation_ord:
			specificBuilder.ClassInstanceCreation();
			break;
		}
	}

	public void wEntity_(EntityDescriptor<?> entityDesc) {
		switch (entityDesc.getOrdinal()) {
		case MiniJavaEntityDescriptorEnum.Program_ord:
			specificBuilder.Program_();
			break;
		case MiniJavaEntityDescriptorEnum.MainClass_ord:
			specificBuilder.MainClass_();
			break;
		case MiniJavaEntityDescriptorEnum.ClassDeclarations_ord:
			specificBuilder.ClassDeclarations_();
			break;
		case MiniJavaEntityDescriptorEnum.ClassDeclaration_ord:
			specificBuilder.ClassDeclaration_();
			break;
		case MiniJavaEntityDescriptorEnum.VariableDeclarations_ord:
			specificBuilder.VariableDeclarations_();
			break;
		case MiniJavaEntityDescriptorEnum.VariableDeclaration_ord:
			specificBuilder.VariableDeclaration_();
			break;
		case MiniJavaEntityDescriptorEnum.MethodDeclarations_ord:
			specificBuilder.MethodDeclarations_();
			break;
		case MiniJavaEntityDescriptorEnum.MethodDeclaration_ord:
			specificBuilder.MethodDeclaration_();
			break;
		case MiniJavaEntityDescriptorEnum.Boolean_ord:
			specificBuilder.Boolean_();
			break;
		case MiniJavaEntityDescriptorEnum.Int_ord:
			specificBuilder.Int_();
			break;
		case MiniJavaEntityDescriptorEnum.IntArray_ord:
			specificBuilder.IntArray_();
			break;
		case MiniJavaEntityDescriptorEnum.Statements_ord:
			specificBuilder.Statements_();
			break;
		case MiniJavaEntityDescriptorEnum.Block_ord:
			specificBuilder.Block_();
			break;
		case MiniJavaEntityDescriptorEnum.IfStatement_ord:
			specificBuilder.IfStatement_();
			break;
		case MiniJavaEntityDescriptorEnum.WhileStatement_ord:
			specificBuilder.WhileStatement_();
			break;
		case MiniJavaEntityDescriptorEnum.PrintlnStatement_ord:
			specificBuilder.PrintlnStatement_();
			break;
		case MiniJavaEntityDescriptorEnum.VariableAssignment_ord:
			specificBuilder.VariableAssignment_();
			break;
		case MiniJavaEntityDescriptorEnum.ArrayElementAssignment_ord:
			specificBuilder.ArrayElementAssignment_();
			break;
		case MiniJavaEntityDescriptorEnum.InfixExpression_ord:
			specificBuilder.InfixExpression_();
			break;
		case MiniJavaEntityDescriptorEnum.NotExpression_ord:
			specificBuilder.NotExpression_();
			break;
		case MiniJavaEntityDescriptorEnum.ArrayAccess_ord:
			specificBuilder.ArrayAccess_();
			break;
		case MiniJavaEntityDescriptorEnum.ArrayLength_ord:
			specificBuilder.ArrayLength_();
			break;
		case MiniJavaEntityDescriptorEnum.MethodInvocation_ord:
			specificBuilder.MethodInvocation_();
			break;
		case MiniJavaEntityDescriptorEnum.Arguments_ord:
			specificBuilder.Arguments_();
			break;
		case MiniJavaEntityDescriptorEnum.ThisExpression_ord:
			specificBuilder.ThisExpression_();
			break;
		case MiniJavaEntityDescriptorEnum.ArrayCreation_ord:
			specificBuilder.ArrayCreation_();
			break;
		case MiniJavaEntityDescriptorEnum.ClassInstanceCreation_ord:
			specificBuilder.ClassInstanceCreation_();
			break;
		}
	}

	public void _wEntity(EntityDescriptor<?> entityDesc) {
		switch (entityDesc.getOrdinal()) {
		case MiniJavaEntityDescriptorEnum.Program_ord:
			specificBuilder._Program();
			break;
		case MiniJavaEntityDescriptorEnum.MainClass_ord:
			specificBuilder._MainClass();
			break;
		case MiniJavaEntityDescriptorEnum.ClassDeclarations_ord:
			specificBuilder._ClassDeclarations();
			break;
		case MiniJavaEntityDescriptorEnum.ClassDeclaration_ord:
			specificBuilder._ClassDeclaration();
			break;
		case MiniJavaEntityDescriptorEnum.VariableDeclarations_ord:
			specificBuilder._VariableDeclarations();
			break;
		case MiniJavaEntityDescriptorEnum.VariableDeclaration_ord:
			specificBuilder._VariableDeclaration();
			break;
		case MiniJavaEntityDescriptorEnum.MethodDeclarations_ord:
			specificBuilder._MethodDeclarations();
			break;
		case MiniJavaEntityDescriptorEnum.MethodDeclaration_ord:
			specificBuilder._MethodDeclaration();
			break;
		case MiniJavaEntityDescriptorEnum.Boolean_ord:
			specificBuilder._Boolean();
			break;
		case MiniJavaEntityDescriptorEnum.Int_ord:
			specificBuilder._Int();
			break;
		case MiniJavaEntityDescriptorEnum.IntArray_ord:
			specificBuilder._IntArray();
			break;
		case MiniJavaEntityDescriptorEnum.Statements_ord:
			specificBuilder._Statements();
			break;
		case MiniJavaEntityDescriptorEnum.Block_ord:
			specificBuilder._Block();
			break;
		case MiniJavaEntityDescriptorEnum.IfStatement_ord:
			specificBuilder._IfStatement();
			break;
		case MiniJavaEntityDescriptorEnum.WhileStatement_ord:
			specificBuilder._WhileStatement();
			break;
		case MiniJavaEntityDescriptorEnum.PrintlnStatement_ord:
			specificBuilder._PrintlnStatement();
			break;
		case MiniJavaEntityDescriptorEnum.VariableAssignment_ord:
			specificBuilder._VariableAssignment();
			break;
		case MiniJavaEntityDescriptorEnum.ArrayElementAssignment_ord:
			specificBuilder._ArrayElementAssignment();
			break;
		case MiniJavaEntityDescriptorEnum.InfixExpression_ord:
			specificBuilder._InfixExpression();
			break;
		case MiniJavaEntityDescriptorEnum.NotExpression_ord:
			specificBuilder._NotExpression();
			break;
		case MiniJavaEntityDescriptorEnum.ArrayAccess_ord:
			specificBuilder._ArrayAccess();
			break;
		case MiniJavaEntityDescriptorEnum.ArrayLength_ord:
			specificBuilder._ArrayLength();
			break;
		case MiniJavaEntityDescriptorEnum.MethodInvocation_ord:
			specificBuilder._MethodInvocation();
			break;
		case MiniJavaEntityDescriptorEnum.Arguments_ord:
			specificBuilder._Arguments();
			break;
		case MiniJavaEntityDescriptorEnum.ThisExpression_ord:
			specificBuilder._ThisExpression();
			break;
		case MiniJavaEntityDescriptorEnum.ArrayCreation_ord:
			specificBuilder._ArrayCreation();
			break;
		case MiniJavaEntityDescriptorEnum.ClassInstanceCreation_ord:
			specificBuilder._ClassInstanceCreation();
			break;
		}
	}

	public void wEntity_(EntityDescriptor<?> entityDesc, int initialCapacity) {
		switch (entityDesc.getOrdinal()) {
		case MiniJavaEntityDescriptorEnum.ClassDeclarations_ord:
			specificBuilder.ClassDeclarations_(initialCapacity);
			break;
		case MiniJavaEntityDescriptorEnum.VariableDeclarations_ord:
			specificBuilder.VariableDeclarations_(initialCapacity);
			break;
		case MiniJavaEntityDescriptorEnum.MethodDeclarations_ord:
			specificBuilder.MethodDeclarations_(initialCapacity);
			break;
		case MiniJavaEntityDescriptorEnum.Statements_ord:
			specificBuilder.Statements_(initialCapacity);
			break;
		case MiniJavaEntityDescriptorEnum.Block_ord:
			specificBuilder.Block_(initialCapacity);
			break;
		case MiniJavaEntityDescriptorEnum.Arguments_ord:
			specificBuilder.Arguments_(initialCapacity);
			break;
		}
	}

	public void wEntity(EntityDescriptor<?> entityDesc, String value) {
		switch (entityDesc.getOrdinal()) {
		case MiniJavaEntityDescriptorEnum.Identifier_ord:
			specificBuilder.Identifier(value);
			break;
		}
	}

	public void wEntity(EntityDescriptor<?> entityDesc, EnumValue value) {
		switch (entityDesc.getOrdinal()) {
		case MiniJavaEntityDescriptorEnum.InfixOperator_ord:
			specificBuilder.InfixOperator((Value) value);
			break;
		}
	}

	public void wEntity(EntityDescriptor<?> entityDesc, boolean value) {
		switch (entityDesc.getOrdinal()) {
		case MiniJavaEntityDescriptorEnum.BooleanLiteral_ord:
			specificBuilder.BooleanLiteral(value);
			break;
		}
	}

	public void wEntity(EntityDescriptor<?> entityDesc, int value) {
		switch (entityDesc.getOrdinal()) {
		case MiniJavaEntityDescriptorEnum.IntLiteral_ord:
			specificBuilder.IntLiteral(value);
			break;
		}
	}
}
