package org.whole.crossexamples.lwc16.minijava.model;

/** 
 * @generator Whole
 */
public interface ClassDeclaration extends IMiniJavaEntity {
	public Identifier getName();

	public void setName(Identifier name);

	public Identifier getSuperclassName();

	public void setSuperclassName(Identifier superclassName);

	public VariableDeclarations getVariables();

	public void setVariables(VariableDeclarations variables);

	public MethodDeclarations getMethods();

	public void setMethods(MethodDeclarations methods);
}
