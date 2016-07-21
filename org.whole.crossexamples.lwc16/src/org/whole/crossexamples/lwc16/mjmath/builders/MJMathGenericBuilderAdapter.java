package org.whole.crossexamples.lwc16.mjmath.builders;

import org.whole.lang.builders.GenericIdentityBuilder;
import org.whole.lang.contexts.IEntityContext;
import org.whole.lang.reflect.FeatureDescriptor;
import org.whole.crossexamples.lwc16.mjmath.reflect.MJMathFeatureDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.mjmath.reflect.MJMathEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class MJMathGenericBuilderAdapter extends GenericIdentityBuilder {
	private IMJMathBuilder specificBuilder;

	public MJMathGenericBuilderAdapter(IMJMathBuilder specificBuilder) {
		this.specificBuilder = specificBuilder;
	}

	public MJMathGenericBuilderAdapter(IMJMathBuilder specificBuilder, IEntityContext entityContext) {
		this(specificBuilder);
		wSetEntityContext(entityContext);
	}

	public void visit() {
	}

	public void wFeature(FeatureDescriptor featureDesc) {
		switch (featureDesc.getOrdinal()) {
		case MJMathFeatureDescriptorEnum.index_ord:
			specificBuilder.index();
			break;
		case MJMathFeatureDescriptorEnum.lowerBound_ord:
			specificBuilder.lowerBound();
			break;
		case MJMathFeatureDescriptorEnum.upperBound_ord:
			specificBuilder.upperBound();
			break;
		case MJMathFeatureDescriptorEnum.expression_ord:
			specificBuilder.expression();
			break;
		}
	}

	public void wEntity(EntityDescriptor<?> entityDesc) {
		switch (entityDesc.getOrdinal()) {
		case MJMathEntityDescriptorEnum.Summation_ord:
			specificBuilder.Summation();
			break;
		}
	}

	public void wEntity_(EntityDescriptor<?> entityDesc) {
		switch (entityDesc.getOrdinal()) {
		case MJMathEntityDescriptorEnum.Summation_ord:
			specificBuilder.Summation_();
			break;
		}
	}

	public void _wEntity(EntityDescriptor<?> entityDesc) {
		switch (entityDesc.getOrdinal()) {
		case MJMathEntityDescriptorEnum.Summation_ord:
			specificBuilder._Summation();
			break;
		}
	}
}
