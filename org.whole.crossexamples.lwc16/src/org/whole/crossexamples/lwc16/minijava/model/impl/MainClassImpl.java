package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.minijava.model.MainClass;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.minijava.model.Identifier;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.model.Statement;

/** 
 * @generator Whole
 */
public class MainClassImpl extends AbstractSimpleEntity implements MainClass {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<MainClass> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.MainClass;
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.MainClass_ord;
	}

	public void accept(IMiniJavaVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Identifier name;

	public Identifier getName() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.name, name);
	}

	public void setName(Identifier name) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.name, this.name, this.name = name);
	}

	private Identifier parameterName;

	public Identifier getParameterName() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.parameterName, parameterName);
	}

	public void setParameterName(Identifier parameterName) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.parameterName, this.parameterName,
				this.parameterName = parameterName);
	}

	private Statement statement;

	public Statement getStatement() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.statement, statement);
	}

	public void setStatement(Statement statement) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.statement, this.statement, this.statement = statement);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getName().wGetAdaptee(false);
		case 1:
			return getParameterName().wGetAdaptee(false);
		case 2:
			return getStatement().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setName(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Identifier));
			break;
		case 1:
			setParameterName(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Identifier));
			break;
		case 2:
			setStatement(value.wGetAdapter(MiniJavaEntityDescriptorEnum.Statement));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 3;
	}
}
