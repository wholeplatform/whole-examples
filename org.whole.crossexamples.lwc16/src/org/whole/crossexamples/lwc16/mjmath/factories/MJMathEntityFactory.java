package org.whole.crossexamples.lwc16.mjmath.factories;

import org.whole.lang.factories.GenericEntityFactory;
import org.whole.crossexamples.lwc16.mjmath.model.*;
import org.whole.lang.factories.RegistryConfigurations;
import org.whole.lang.factories.IEntityRegistryProvider;
import org.whole.crossexamples.lwc16.mjmath.reflect.MJMathEntityDescriptorEnum;
import org.whole.lang.factories.IEntityBuilder;
import org.whole.lang.factories.EntityBuilder;

/** 
 * @generator Whole
 */
public class MJMathEntityFactory extends GenericEntityFactory {
	public static final MJMathEntityFactory instance = instance(RegistryConfigurations.DEFAULT);

	public static MJMathEntityFactory instance(IEntityRegistryProvider provider) {
		return new MJMathEntityFactory(provider);
	}

	protected MJMathEntityFactory(IEntityRegistryProvider provider) {
		super(provider);
	}

	public Summation createSummation() {
		return create(MJMathEntityDescriptorEnum.Summation);
	}

	public Summation createSummation(Identifier index, Expression lowerBound, Expression upperBound,
			Expression expression) {
		return create(MJMathEntityDescriptorEnum.Summation, index, lowerBound, upperBound, expression);
	}

	public IEntityBuilder<Summation> buildSummation() {
		return new EntityBuilder<Summation>(create(MJMathEntityDescriptorEnum.Summation));
	}
}
