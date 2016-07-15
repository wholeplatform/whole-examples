package org.whole.crossexamples.lwc16.minijava.model.adapters;

import org.whole.lang.factories.AbstractEntityRegistry;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class MiniJavaAdaptersEntityRegistry extends AbstractEntityRegistry {
	public MiniJavaAdaptersEntityRegistry() {
		super(MiniJavaEntityDescriptorEnum.instance);
	}

	protected void createPrototypes() {
		put(new ProgramAdapter());
		put(new MainClassAdapter());
		put(new ClassDeclarationsAdapter());
		put(new ClassDeclarationAdapter());
		put(new VariableDeclarationsAdapter());
		put(new VariableDeclarationAdapter());
		put(new MethodDeclarationsAdapter());
		put(new MethodDeclarationAdapter());
		put(new TypeAdapter());
		put(new BooleanAdapter());
		put(new IntAdapter());
		put(new IntArrayAdapter());
		put(new IdentifierAdapter());
		put(new StatementsAdapter());
		put(new StatementAdapter());
		put(new BlockAdapter());
		put(new IfStatementAdapter());
		put(new WhileStatementAdapter());
		put(new PrintlnStatementAdapter());
		put(new VariableAssignmentAdapter());
		put(new ArrayElementAssignmentAdapter());
		put(new ExpressionAdapter());
		put(new InfixExpressionAdapter());
		put(new InfixOperatorAdapter());
		put(new NotExpressionAdapter());
		put(new ArrayAccessAdapter());
		put(new ArrayLengthAdapter());
		put(new MethodInvocationAdapter());
		put(new ArgumentsAdapter());
		put(new BooleanLiteralAdapter());
		put(new IntLiteralAdapter());
		put(new ThisExpressionAdapter());
		put(new ArrayCreationAdapter());
		put(new ClassInstanceCreationAdapter());
	}
}
