package org.whole.examples.dialogs;

import org.whole.lang.builders.IBuilderOperation;
import org.whole.lang.templates.AbstractTemplateFactory;

public class HelloWorkflows extends AbstractTemplateFactory<org.whole.lang.workflows.model.Sequence> {

    public void apply(IBuilderOperation op) {
        org.whole.lang.workflows.builders.IWorkflowsBuilder b0 = (org.whole.lang.workflows.builders.IWorkflowsBuilder) op.wGetBuilder(org.whole.lang.workflows.reflect.WorkflowsLanguageKit.URI);
        b0.Sequence_();
        b0.Text("Hello Workflow");
        b0.FlowObjects_(7);
        b0.Task_();
        b0.Text("Collect first name");
        b0.Text("Do you want to continue?");
        org.whole.lang.commons.builders.ICommonsBuilder b1 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
        b1.Resolver();
        b1.Resolver();
        b0._Task();
        b0.InvokeJavaClassMethod_();
        b0.Text("Configure a custom dialog factory");
        b0.Variable("factory");
        b1.Resolver();
        b0.StringLiteral("org.whole.lang.workflows.ui.dialogs.ChangeValueDialogFactory");
        b0.StringLiteral("instance()");
        b1.Resolver();
        b0._InvokeJavaClassMethod();
        b0.AssignActivity_();
        b0.Text("assignactivity");
        b0.Assignments_(1);
        b0.Assign_();
        b0.Variable("firstNameTemplate");
        b0.StringLiteral("first name");
        b0._Assign();
        b0._Assignments();
        b0._AssignActivity();
        b0.Task_();
        b0.Text("Collect first name");
        b0.Text("Insert your first name:");
        b0.Assignments_(1);
        b0.Assign_();
        b0.Variable("firstName");
        b0.Variable("firstNameTemplate");
        b0._Assign();
        b0._Assignments();
        b0.Variable("factory");
        b0._Task();
        b0.Task_();
        b0.Text("Collect last name");
        b0.Text("Insert your last name:");
        b0.Assignments_(1);
        b0.Assign_();
        b0.Variable("lastName");
        b0.StringLiteral("last name");
        b0._Assign();
        b0._Assignments();
        b0.Variable("factory");
        b0._Task();
        b0.CreateModel_();
        b0.Text("Create a message model");
        b0.Variable("message");
        b1.StageUpFragment_();
        org.whole.lang.text.builders.ITextBuilder b2 = (org.whole.lang.text.builders.ITextBuilder) op.wGetBuilder(org.whole.lang.text.reflect.TextLanguageKit.URI);
        b2.Document_(2);
        b2.Row_(6);
        b2.TextSeparator("");
        b2.Text("Hello ");
        b1.Variable_();
        b1.VarType("http://lang.whole.org/Text#Text");
        b1.VarName("lastName");
        b1.Quantifier("!");
        b1._Variable();
        b2.Text(", ");
        b1.Variable_();
        b1.VarType("http://lang.whole.org/Text#Text");
        b1.VarName("firstName");
        b1.Quantifier("!");
        b1._Variable();
        b2.Text("!");
        b2._Row();
        b2.Row_(1);
        b2.Text("");
        b2._Row();
        b2._Document();
        b1._StageUpFragment();
        b1.Resolver();
        b0._CreateModel();
        b0.InvokeOperation_();
        b0.Text("Print the result model");
        b0.Variable("message");
        b0.Operation("PRETTY_PRINTER");
        b1.Resolver();
        b0._InvokeOperation();
        b0._FlowObjects();
        b0._Sequence();
    }
}