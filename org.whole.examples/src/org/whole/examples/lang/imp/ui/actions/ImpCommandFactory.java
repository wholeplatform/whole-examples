package org.whole.examples.lang.imp.ui.actions;

import org.whole.examples.lang.imp.reflect.ImpEntityDescriptorEnum;
import org.whole.lang.factories.GenericEntityFactory;
import org.whole.lang.model.IEntity;
import org.whole.lang.ui.requests.CommandFactory;
import org.whole.lang.ui.requests.IFeatureTransformer;

/** 
 * @author Riccardo Solmi
 */
public class ImpCommandFactory extends CommandFactory {
	private static class SingletonHolder {
		private static final ImpCommandFactory instance = new ImpCommandFactory();
	}
	public static ImpCommandFactory instance() {
		return SingletonHolder.instance;
	}

	private class NameNameExpressionTransformer implements IFeatureTransformer {
		public IEntity transform(IEntity newFeature) {
			IEntity entity = GenericEntityFactory.instance.create(ImpEntityDescriptorEnum.NameExpression);
			entity.wSetValue(newFeature.wStringValue());
			return entity;
		}
	}

	private ImpCommandFactory() {
//		addOverCompositeConstraints(new Class[0][0]);
		addOverCompositeConstraints(new Object[][] {
//				{ ImpVariable.class, Parameters.class },
//				{ Parameter.class, Parameters.class },
//				{ ImpAdapterFragment.class, Parameters.class },
//				{ ImpBaseFragment.class, Parameters.class },
//				{ ExpressionStatement.class, BlockStatement.class },
//				{ SaveStatement.class, BlockStatement.class },
//				{ IfElseStatement.class, BlockStatement.class },
//				{ FunctionDeclaration.class, BlockStatement.class },
//				{ DoWhileStatement.class, BlockStatement.class },
//				{ ForeachStatement.class, BlockStatement.class },
//				{ ForStatement.class, BlockStatement.class },
//				{ VariableDeclaration.class, BlockStatement.class },
//				{ WhileStatement.class, BlockStatement.class },
//				{ ReturnStatement.class, BlockStatement.class },
//				{ EmptyStatement.class, BlockStatement.class },
//				{ PrintlnStatement.class, BlockStatement.class },
//				{ ImpVariable.class, BlockStatement.class },
//				{ PrintStatement.class, BlockStatement.class },
				{ ImpEntityDescriptorEnum.BlockStatement , ImpEntityDescriptorEnum.BlockStatement, IFeatureTransformer.IDENTITY, false }
//				{ IfStatement.class, BlockStatement.class },
//				{ ImpMetaFragment.class, BlockStatement.class },
//				{ ImpAdapterFragment.class, BlockStatement.class },
//				{ ImpBaseFragment.class, BlockStatement.class },
//				{ BooleanLiteral.class, ArrayLiteral.class },
//				{ ImpVariable.class, ArrayLiteral.class },
//				{ IntLiteral.class, ArrayLiteral.class },
//				{ StringLiteral.class, ArrayLiteral.class },
//				{ ArrayLiteral.class, ArrayLiteral.class },
//				{ ImpAdapterFragment.class, ArrayLiteral.class },
//				{ ImpBaseFragment.class, ArrayLiteral.class },
//				{ RangeLiteral.class, ArrayLiteral.class },
//				{ Or.class, Arguments.class },
//				{ SizeExpression.class, Arguments.class },
//				{ Subtraction.class, Arguments.class },
//				{ IntLiteral.class, Arguments.class },
//				{ Multiplication.class, Arguments.class },
//				{ LessOrEquals.class, Arguments.class },
//				{ LessThan.class, Arguments.class },
//				{ StringLiteral.class, Arguments.class },
//				{ And.class, Arguments.class },
//				{ Remainder.class, Arguments.class },
//				{ RunExpression.class, Arguments.class },
//				{ Addition.class, Arguments.class },
//				{ NotEquals.class, Arguments.class },
//				{ ArrayLiteral.class, Arguments.class },
//				{ Equals.class, Arguments.class },
//				{ ImpAdapterFragment.class, Arguments.class },
//				{ LoadExpression.class, Arguments.class },
//				{ BooleanLiteral.class, Arguments.class },
//				{ Not.class, Arguments.class },
//				{ RangeLiteral.class, Arguments.class },
//				{ ImpVariable.class, Arguments.class },
//				{ AssignmentExpression.class, Arguments.class },
//				{ Division.class, Arguments.class },
//				{ NameExpression.class, Arguments.class },
//				{ GreaterOrEquals.class, Arguments.class },
//				{ ImpBaseFragment.class, Arguments.class },
//				{ ImpMetaFragment.class, Arguments.class },
//				{ FunctionInvocationExpression.class, Arguments.class },
//				{ ArrayAccess.class, Arguments.class },
//				{ GreaterThan.class, Arguments.class }
				});
//		addOverSimpleConstraints(new Class[0][0]);
		addOverSimpleConstraints(new Object[][] {
//				{ ArrayType.class, Type.class },
//				{ ImpVariable.class, Type.class },
//				{ PrimitiveType.class, Type.class },
//				{ ImpAdapterFragment.class, Type.class },
//				{ ImpBaseFragment.class, Type.class },
//				{ ImpVariable.class, IVariableDeclaration.class },
//				{ VariableDeclaration.class, IVariableDeclaration.class },
//				{ ImpAdapterFragment.class, IVariableDeclaration.class },
//				{ ImpBaseFragment.class, IVariableDeclaration.class },
//				{ ImpVariable.class, IIntLiteral.class },
//				{ IntLiteral.class, IIntLiteral.class },
//				{ ImpAdapterFragment.class, IIntLiteral.class },
//				{ ImpBaseFragment.class, IIntLiteral.class },
//				{ ImpVariable.class, IImpStringData.class },
//				{ ImpAdapterFragment.class, IImpStringData.class },
//				{ ImpBaseFragment.class, IImpStringData.class },
//				{ ImpStringData.class, IImpStringData.class },
//				{ ImpVariable.class, IName.class },
//				{ Name.class, IName.class },
				{ ImpEntityDescriptorEnum.Name, ImpEntityDescriptorEnum.NameExpression, new NameNameExpressionTransformer(), true },
//				{ ImpAdapterFragment.class, IName.class },
//				{ ImpBaseFragment.class, IName.class },
//				{ ImpVariable.class, IArguments.class },
//				{ ImpAdapterFragment.class, IArguments.class },
//				{ ImpBaseFragment.class, IArguments.class },
//				{ Arguments.class, IArguments.class },
//				{ ImpVariable.class, Declaration.class },
//				{ FunctionDeclaration.class, Declaration.class },
//				{ VariableDeclaration.class, Declaration.class },
//				{ ImpAdapterFragment.class, Declaration.class },
//				{ ImpBaseFragment.class, Declaration.class },
//				{ ExpressionStatement.class, Statement.class },
//				{ SaveStatement.class, Statement.class },
//				{ IfElseStatement.class, Statement.class },
//				{ FunctionDeclaration.class, Statement.class },
//				{ DoWhileStatement.class, Statement.class },
//				{ ForeachStatement.class, Statement.class },
//				{ ForStatement.class, Statement.class },
//				{ VariableDeclaration.class, Statement.class },
//				{ WhileStatement.class, Statement.class },
//				{ ReturnStatement.class, Statement.class },
//				{ EmptyStatement.class, Statement.class },
//				{ PrintlnStatement.class, Statement.class },
//				{ ImpVariable.class, Statement.class },
//				{ PrintStatement.class, Statement.class },
				{ ImpEntityDescriptorEnum.BlockStatement , ImpEntityDescriptorEnum.Statement, IFeatureTransformer.IDENTITY, false },
//				{ IfStatement.class, Statement.class },
//				{ ImpMetaFragment.class, Statement.class },
//				{ ImpAdapterFragment.class, Statement.class },
//				{ ImpBaseFragment.class, Statement.class },
//				{ ImpVariable.class, INameExpression.class },
//				{ NameExpression.class, INameExpression.class},
//				{ ImpAdapterFragment.class, INameExpression.class },
//				{ ImpBaseFragment.class, INameExpression.class },
//				{ Or.class, Expression.class },
//				{ SizeExpression.class, Expression.class },
//				{ Subtraction.class, Expression.class },
//				{ IntLiteral.class, Expression.class },
//				{ Multiplication.class, Expression.class },
//				{ LessOrEquals.class, Expression.class },
//				{ LessThan.class, Expression.class },
//				{ StringLiteral.class, Expression.class },
//				{ And.class, Expression.class },
//				{ Remainder.class, Expression.class },
//				{ RunExpression.class, Expression.class },
//				{ Addition.class, Expression.class },
//				{ NotEquals.class, Expression.class },
//				{ ArrayLiteral.class, Expression.class },
//				{ Equals.class, Expression.class },
//				{ ImpAdapterFragment.class, Expression.class },
//				{ LoadExpression.class, Expression.class },
//				{ BooleanLiteral.class, Expression.class },
//				{ Not.class, Expression.class },
//				{ RangeLiteral.class, Expression.class },
//				{ ImpVariable.class, Expression.class },
//				{ AssignmentExpression.class, Expression.class },
//				{ Division.class, Expression.class },
//				{ NameExpression.class, Expression.class },
//				{ GreaterOrEquals.class, Expression.class },
//				{ ImpBaseFragment.class, Expression.class },
//				{ ImpMetaFragment.class, Expression.class },
//				{ FunctionInvocationExpression.class, Expression.class },
//				{ ArrayAccess.class, Expression.class },
//				{ GreaterThan.class, Expression.class },
//				{ ImpVariable.class, IParameters.class },
//				{ Parameters.class, IParameters.class },
//				{ ImpAdapterFragment.class, IParameters.class },
//				{ ImpBaseFragment.class, IParameters.class },
//				{ BooleanLiteral.class, Literal.class },
//				{ ImpVariable.class, Literal.class },
//				{ IntLiteral.class, Literal.class },
//				{ StringLiteral.class, Literal.class },
//				{ ArrayLiteral.class, Literal.class },
//				{ ImpAdapterFragment.class, Literal.class },
//				{ ImpBaseFragment.class, Literal.class },
//				{ RangeLiteral.class, Literal.class },
//				{ ImpVariable.class, IPrimitiveType.class },
//				{ PrimitiveType.class, IPrimitiveType.class },
//				{ ImpAdapterFragment.class, IPrimitiveType.class },
//				{ ImpBaseFragment.class, IPrimitiveType.class },
//				{ ImpVariable.class, IParameter.class },
//				{ Parameter.class, IParameter.class },
//				{ ImpAdapterFragment.class, IParameter.class },
//				{ ImpBaseFragment.class, IParameter.class } 
				});
	}
}