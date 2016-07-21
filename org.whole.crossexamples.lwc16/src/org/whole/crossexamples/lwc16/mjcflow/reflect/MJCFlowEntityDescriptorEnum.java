package org.whole.crossexamples.lwc16.mjcflow.reflect;

import org.whole.lang.reflect.EntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.mjcflow.model.*;

/** 
 * @generator Whole
 */
@SuppressWarnings("unchecked")
public class MJCFlowEntityDescriptorEnum extends EntityDescriptorEnum {
	public static final int UnlessStatement_ord = 0;
	public static final int Expression_ord = 1;
	public static final int Statement_ord = 2;
	public static final MJCFlowEntityDescriptorEnum instance = new MJCFlowEntityDescriptorEnum();
	public static final EntityDescriptor<UnlessStatement> UnlessStatement = (EntityDescriptor<UnlessStatement>) instance
			.valueOf(UnlessStatement_ord);
	public static final EntityDescriptor<Expression> Expression = (EntityDescriptor<Expression>) instance
			.valueOf(Expression_ord);
	public static final EntityDescriptor<Statement> Statement = (EntityDescriptor<Statement>) instance
			.valueOf(Statement_ord);

	private MJCFlowEntityDescriptorEnum() {
	}

	private static final long serialVersionUID = 1;

	protected void initEntityDescriptors() {
		putSimpleEntity(UnlessStatement_ord, "UnlessStatement", UnlessStatement.class, false)
				.withFeature(MJCFlowFeatureDescriptorEnum.expression, Expression_ord)
				.withFeature(MJCFlowFeatureDescriptorEnum.statement, Statement_ord);
		putSimpleEntity(Expression_ord, "Expression", Expression.class, true);
		putSimpleEntity(Statement_ord, "Statement", Statement.class, true, UnlessStatement_ord);
	}

	protected void initForeignTypeRelations() {
		setAliasOf(true, "whole:org.whole.crossexamples.lwc16.minijava:MiniJavaModel#Statement", Statement_ord);
		setAliasOf(true, "whole:org.whole.crossexamples.lwc16.minijava:MiniJavaModel#Expression", Expression_ord);
	}
}
