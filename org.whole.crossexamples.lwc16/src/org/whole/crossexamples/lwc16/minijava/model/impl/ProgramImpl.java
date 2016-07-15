package org.whole.crossexamples.lwc16.minijava.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.crossexamples.lwc16.minijava.model.Program;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaEntityDescriptorEnum;
import org.whole.crossexamples.lwc16.minijava.visitors.IMiniJavaVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.crossexamples.lwc16.minijava.model.MainClass;
import org.whole.crossexamples.lwc16.minijava.reflect.MiniJavaFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;
import org.whole.crossexamples.lwc16.minijava.model.ClassDeclarations;

/** 
 * @generator Whole
 */
public class ProgramImpl extends AbstractSimpleEntity implements Program {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<Program> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.Program;
	}

	public int wGetEntityOrd() {
		return MiniJavaEntityDescriptorEnum.Program_ord;
	}

	public void accept(IMiniJavaVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private MainClass mainClass;

	public MainClass getMainClass() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.mainClass, mainClass);
	}

	public void setMainClass(MainClass mainClass) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.mainClass, this.mainClass, this.mainClass = mainClass);
	}

	private ClassDeclarations classDeclarations;

	public ClassDeclarations getClassDeclarations() {
		return notifyRequested(MiniJavaFeatureDescriptorEnum.classDeclarations, classDeclarations);
	}

	public void setClassDeclarations(ClassDeclarations classDeclarations) {
		notifyChanged(MiniJavaFeatureDescriptorEnum.classDeclarations, this.classDeclarations,
				this.classDeclarations = classDeclarations);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getMainClass().wGetAdaptee(false);
		case 1:
			return getClassDeclarations().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setMainClass(value.wGetAdapter(MiniJavaEntityDescriptorEnum.MainClass));
			break;
		case 1:
			setClassDeclarations(value.wGetAdapter(MiniJavaEntityDescriptorEnum.ClassDeclarations));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 2;
	}
}
