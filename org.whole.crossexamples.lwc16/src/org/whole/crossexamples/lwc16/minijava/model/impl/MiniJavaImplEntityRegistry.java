package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.factories.AbstractEntityRegistry;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class MiniJavaImplEntityRegistry extends AbstractEntityRegistry {
	public MiniJavaImplEntityRegistry() {
		super(MiniJavaEntityDescriptorEnum.instance);
	}

	protected void createPrototypes() {
		put(new ProgramImpl());
		put(new MainClassImpl());
		put(new ClassDeclarationsImpl());
		put(new ClassDeclarationImpl());
		put(new VariableDeclarationsImpl());
		put(new VariableDeclarationImpl());
		put(new MethodDeclarationsImpl());
		put(new MethodDeclarationImpl());
		put(new BooleanImpl());
		put(new IntImpl());
		put(new IntArrayImpl());
		put(new IdentifierImpl());
		put(new StatementsImpl());
		put(new BlockImpl());
		put(new IfStatementImpl());
		put(new WhileStatementImpl());
		put(new PrintlnStatementImpl());
		put(new VariableAssignmentImpl());
		put(new ArrayElementAssignmentImpl());
		put(new InfixExpressionImpl());
		put(new InfixOperatorImpl());
		put(new NotExpressionImpl());
		put(new ArrayAccessImpl());
		put(new ArrayLengthImpl());
		put(new MethodInvocationImpl());
		put(new ArgumentsImpl());
		put(new BooleanLiteralImpl());
		put(new IntLiteralImpl());
		put(new ThisExpressionImpl());
		put(new ArrayCreationImpl());
		put(new ClassInstanceCreationImpl());
	}
}
