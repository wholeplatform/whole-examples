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
public class ProgramAdapter extends AbstractEntityAdapter implements Program {
	private static final long serialVersionUID = 1;

	public ProgramAdapter(IEntity implementor) {
		super(implementor);
	}

	public ProgramAdapter() {
	}

	public void accept(IMiniJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Program> wGetEntityDescriptor() {
		return MiniJavaEntityDescriptorEnum.Program;
	}

	public MainClass getMainClass() {
		return wGet(MiniJavaFeatureDescriptorEnum.mainClass).wGetAdapter(MiniJavaEntityDescriptorEnum.MainClass);
	}

	public void setMainClass(MainClass mainClass) {
		wSet(MiniJavaFeatureDescriptorEnum.mainClass, mainClass);
	}

	public ClassDeclarations getClassDeclarations() {
		return wGet(MiniJavaFeatureDescriptorEnum.classDeclarations)
				.wGetAdapter(MiniJavaEntityDescriptorEnum.ClassDeclarations);
	}

	public void setClassDeclarations(ClassDeclarations classDeclarations) {
		wSet(MiniJavaFeatureDescriptorEnum.classDeclarations, classDeclarations);
	}
}
