package org.whole.crossexamples.lwc16.minijava.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaFeatureDescriptorEnum;

/** 
 * @generator Whole
 */
public class MainClassAdapter extends AbstractEntityAdapter implements MainClass {
	private static final long serialVersionUID = 1;

	public MainClassAdapter(IEntity implementor) {
		super(implementor);
	}

	public MainClassAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<MainClass> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.MainClass;
	}

	public Identifier getName() {
		return wGet(MiniJavaFeatureDescriptorEnum.name).wGetAdapter(MiniJavaEntityDescriptorEnum.Identifier);
	}

	public void setName(Identifier name) {
		wSet(MiniJavaFeatureDescriptorEnum.name, name);
	}

	public Identifier getParameterName() {
		return wGet(MiniJavaFeatureDescriptorEnum.parameterName).wGetAdapter(MiniJavaEntityDescriptorEnum.Identifier);
	}

	public void setParameterName(Identifier parameterName) {
		wSet(MiniJavaFeatureDescriptorEnum.parameterName, parameterName);
	}

	public Statement getStatement() {
		return wGet(MiniJavaFeatureDescriptorEnum.statement).wGetAdapter(MiniJavaEntityDescriptorEnum.Statement);
	}

	public void setStatement(Statement statement) {
		wSet(MiniJavaFeatureDescriptorEnum.statement, statement);
	}
}
