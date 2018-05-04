package org.whole.examples.javadocs;

import org.whole.lang.builders.IBuilderOperation;
import org.whole.lang.templates.AbstractTemplateFactory;

public class JavadocsActions extends AbstractTemplateFactory<org.whole.lang.actions.model.LanguageActionFactory> {

    public void apply(IBuilderOperation op) {
        org.whole.lang.actions.builders.IActionsBuilder b0 = (org.whole.lang.actions.builders.IActionsBuilder) op.wGetBuilder(org.whole.lang.actions.reflect.ActionsLanguageKit.URI);
        b0.LanguageActionFactory_();
        b0.URI("whole:org.whole.examples.javadocs:JavadocsActions");
        b0.Namespace("org.whole.examples.javadocs");
        b0.Name("JavadocsActions");
        org.whole.lang.commons.builders.ICommonsBuilder b1 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
        b1.Resolver();
        b0.URI("http://lang.whole.org/Java");
        b0.ToolbarActions_();
        b1.Resolver();
        b1.Resolver();
        b1.Resolver();
        b1.Resolver();
        b1.Resolver();
        b0._ToolbarActions();
        b0.ContextMenuActions_();
        b0.MenuActions_(1);
        b0.GuardedAction_();
        b0.Label("Generate hello author class");
        org.whole.lang.queries.builders.IQueriesBuilder b2 = (org.whole.lang.queries.builders.IQueriesBuilder) op.wGetBuilder(org.whole.lang.queries.reflect.QueriesLanguageKit.URI);
        b2.Block_(4);
        b2.QueryDeclaration_();
        b2.Name("javadocTag");
        b2.Names_(1);
        b2.Name("tagName");
        b2._Names();
        b2.Path_(3);
        b2.FeatureStep("javadoc");
        b2.FeatureStep("tags");
        b2.Filter_();
        b2.ChildStep();
        b2.Equals_();
        b2.FeatureStep("tagName");
        b2.VariableRefStep("tagName");
        b2._Equals();
        b2._Filter();
        b2._Path();
        b2._QueryDeclaration();
        b2.QueryDeclaration_();
        b2.Name("TextElementsOfJavadocTag");
        b2.Names_(1);
        b2.Name("tagName");
        b2._Names();
        b2.Path_(3);
        b2.Call_();
        b2.Name("javadocTag");
        b2.Expressions_(1);
        b2.VariableRefStep("tagName");
        b2._Expressions();
        b2._Call();
        b2.FeatureStep("fragments");
        b2.Filter_();
        b2.DescendantOrSelfStep();
        b2.TypeTest("TextElement");
        b2._Filter();
        b2._Path();
        b2._QueryDeclaration();
        b2.Select_();
        b2.Filter_();
        b1.StageUpFragment_();
        org.whole.lang.artifacts.builders.IArtifactsBuilder b3 = (org.whole.lang.artifacts.builders.IArtifactsBuilder) op.wGetBuilder(org.whole.lang.artifacts.reflect.ArtifactsLanguageKit.URI);
        b3.Workspace_();
        b1.Resolver();
        b3.Projects_(1);
        b3.Project_();
        b1.Variable_();
        b1.VarType("http://lang.whole.org/Artifacts#ProjectName");
        b1.VarName("projectName");
        b1.Quantifier("!");
        b1._Variable();
        b3.Natures_(0);
        b3._Natures();
        b1.Resolver();
        b3.Artifacts_(1);
        b3.FolderArtifact_();
        b1.Variable_();
        b1.VarType("http://lang.whole.org/Artifacts#Name");
        b1.VarName("sourceFolderName");
        b1.Quantifier("!");
        b1._Variable();
        b1.Resolver();
        b3.Artifacts_(1);
        b3.PackageArtifact_();
        b1.Variable_();
        b1.VarType("http://lang.whole.org/Artifacts#PackageName");
        b1.VarName("packageName");
        b1.Quantifier("!");
        b1._Variable();
        b1.Resolver();
        b3.Artifacts_(1);
        b3.FileArtifact_();
        b3.NameWithExtension_();
        b1.Variable_();
        b1.VarType("http://lang.whole.org/Artifacts#Name");
        b1.VarName("helloName");
        b1.Quantifier("!");
        b1._Variable();
        b3.Extension("java");
        b3._NameWithExtension();
        b1.Resolver();
        b1.StageUpFragment_();
        org.whole.lang.java.builders.IJavaBuilder b4 = (org.whole.lang.java.builders.IJavaBuilder) op.wGetBuilder(org.whole.lang.java.reflect.JavaLanguageKit.URI);
        b4.CompilationUnit_();
        b4.PackageDeclaration_();
        b1.Resolver();
        b1.Resolver();
        b1.Variable_();
        b1.VarType("http://lang.whole.org/Java#QualifiedName");
        b1.VarName("packageName");
        b1.Quantifier("!");
        b1._Variable();
        b4._PackageDeclaration();
        b4.ImportDeclarations_(0);
        b4._ImportDeclarations();
        b4.TypeDeclarations_(1);
        b4.ClassDeclaration_();
        b1.Resolver();
        b4.ExtendedModifiers_(1);
        b4.Modifier("public");
        b4._ExtendedModifiers();
        b1.Variable_();
        b1.VarType("http://lang.whole.org/Java#SimpleName");
        b1.VarName("helloName");
        b1.Quantifier("!");
        b1._Variable();
        b1.Resolver();
        b1.Resolver();
        b1.Resolver();
        b4.BodyDeclarations_(1);
        b4.MethodDeclaration_();
        b1.Resolver();
        b4.ExtendedModifiers_(2);
        b4.Modifier("public");
        b4.Modifier("static");
        b4._ExtendedModifiers();
        b1.Resolver();
        b4.PrimitiveType("void");
        b4.SimpleName("main");
        b4.Parameters_(1);
        b4.SingleVariableDeclaration_();
        b1.Resolver();
        b4.ArrayType_();
        b4.SimpleType("String");
        b4._ArrayType();
        b4.Varargs(false);
        b4.SimpleName("args");
        b4.ExtraDimensions(0);
        b1.Resolver();
        b1.Resolver();
        b4._SingleVariableDeclaration();
        b4._Parameters();
        b1.Resolver();
        b1.Resolver();
        b4.Block_(1);
        b4.ExpressionStatement_();
        b4.MethodInvocation_();
        b4.QualifiedName("System.out");
        b4.Types_(0);
        b4._Types();
        b4.SimpleName("println");
        b4.Arguments_(1);
        b1.Variable_();
        b1.VarType("http://lang.whole.org/Java#StringLiteral");
        b1.VarName("helloAuthor");
        b1.Quantifier("!");
        b1._Variable();
        b4._Arguments();
        b4._MethodInvocation();
        b4._ExpressionStatement();
        b4._Block();
        b4._MethodDeclaration();
        b4._BodyDeclarations();
        b4._ClassDeclaration();
        b4._TypeDeclarations();
        b4._CompilationUnit();
        b1._StageUpFragment();
        b3._FileArtifact();
        b3._Artifacts();
        b3._PackageArtifact();
        b3._Artifacts();
        b3._FolderArtifact();
        b3._Artifacts();
        b1.Resolver();
        b3._Project();
        b3._Projects();
        b3._Workspace();
        b1._StageUpFragment();
        b2.VariableTest("workspace");
        b2._Filter();
        b2.Path_(3);
        b2.FeatureStep("types");
        b2.ChildStep();
        b2.Filter_();
        b2.Call_();
        b2.Name("TextElementsOfJavadocTag");
        b2.Expressions_(1);
        b2.StringLiteral("author");
        b2._Expressions();
        b2._Call();
        b2.VariableTest("author");
        b2._Filter();
        b2._Path();
        b2.Sequence_(2);
        b2.Filter_();
        b2.Addition_();
        b2.StringLiteral("hello ");
        b2.VariableRefStep("author");
        b2._Addition();
        b2.VariableTest("helloAuthor");
        b2._Filter();
        b2.Filter_();
        b2.Addition_();
        b2.StringLiteral("Hello");
        b2.Addition_();
        b2.VariableRefStep("fileName");
        b2.StringLiteral("Author");
        b2._Addition();
        b2._Addition();
        b2.VariableTest("helloName");
        b2._Filter();
        b2._Sequence();
        b2.TemplateNames();
        b2._Select();
        b2.Call_();
        b2.Name("workspace");
        b1.Resolver();
        b2._Call();
        b2._Block();
        b2.TypeTest("CompilationUnit");
        b0._GuardedAction();
        b0._MenuActions();
        b0.MenuActions_(0);
        b0._MenuActions();
        b0.MenuActions_(0);
        b0._MenuActions();
        b0.MenuActions_(0);
        b0._MenuActions();
        b0.MenuActions_(0);
        b0._MenuActions();
        b1.Resolver();
        b0._ContextMenuActions();
        b0._LanguageActionFactory();
    }
}
