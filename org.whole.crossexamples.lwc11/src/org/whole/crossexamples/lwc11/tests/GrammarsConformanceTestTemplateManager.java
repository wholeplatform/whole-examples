package org.whole.crossexamples.lwc11.tests;

import org.whole.lang.model.IEntity;
import org.whole.lang.templates.AbstractTemplateFactory;
import org.whole.lang.templates.AbstractTemplateManager;
import org.whole.lang.templates.ITemplateFactory;

public class GrammarsConformanceTestTemplateManager extends AbstractTemplateManager {

    private static class SingletonHolder {
        private static final GrammarsConformanceTestTemplateManager instance = new GrammarsConformanceTestTemplateManager();
    }

    public static GrammarsConformanceTestTemplateManager instance() {
        return SingletonHolder.instance;
    }

    private GrammarsConformanceTestTemplateManager() {
        put("fragment", newfragment());
        put("fragment1", newfragment1());
        put("fragment2", newfragment2());
        put("fragment3", newfragment3());
        put("fragment4", newfragment4());
        put("fragment5", newfragment5());
        put("fragment6", newfragment6());
        put("fragment7", newfragment7());
        put("fragment8", newfragment8());
        put("fragment9", newfragment9());
        put("fragment10", newfragment10());
        put("fragment11", newfragment11());
        put("fragment12", newfragment12());
        put("fragment13", newfragment13());
        put("fragment14", newfragment14());
        put("fragment15", newfragment15());
        put("fragment16", newfragment16());
        put("fragment17", newfragment17());
    }

    public ITemplateFactory<IEntity> newfragment() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.workflows.builders.IWorkflowsBuilder b0 = (org.whole.lang.workflows.builders.IWorkflowsBuilder) op.wGetBuilder(org.whole.lang.workflows.reflect.WorkflowsLanguageKit.URI);
                b0.Sequence_();
                b0.Text("deploy");
                b0.FlowObjects_(2);
                b0.LoadModel_();
                b0.Text("load Deployer Workflow");
                b0.Variable("deployerWorkflow");
                b0.StringLiteral("org.whole.lang.xml.codebase.XmlBuilderPersistenceKit");
                b0.ResourceKind("CLASSPATH");
                b0.StringLiteral("org/whole/crossexamples/lwc11/LWC11Deployer.xwl");
                org.whole.lang.commons.builders.ICommonsBuilder b1 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
                b1.Resolver();
                b0._LoadModel();
                b0.InvokeOperation_();
                b0.Text("interpret Deployer Workflow");
                b0.Variable("deployerWorkflow");
                b0.Operation("INTERPRETER");
                b1.Resolver();
                b0._InvokeOperation();
                b0._FlowObjects();
                b0._Sequence();
            }
        };
    }

    public ITemplateFactory<IEntity> newfragment1() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.workflows.builders.IWorkflowsBuilder b0 = (org.whole.lang.workflows.builders.IWorkflowsBuilder) op.wGetBuilder(org.whole.lang.workflows.reflect.WorkflowsLanguageKit.URI);
                b0.AssignActivity_();
                b0.Text("assignactivity");
                b0.Assignments_(2);
                b0.Assign_();
                b0.Variable("entitiesGrammar");
                b0.StringLiteral("http://lwc11.crossexamples.whole.org/entitiesGrammar");
                b0._Assign();
                b0.Assign_();
                b0.Variable("instancesGrammar");
                b0.StringLiteral("http://lwc11.crossexamples.whole.org/instancesGrammar");
                b0._Assign();
                b0._Assignments();
                b0._AssignActivity();
            }
        };
    }

    public ITemplateFactory<IEntity> newfragment2() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.workflows.builders.IWorkflowsBuilder b0 = (org.whole.lang.workflows.builders.IWorkflowsBuilder) op.wGetBuilder(org.whole.lang.workflows.reflect.WorkflowsLanguageKit.URI);
                b0.Parse_();
                b0.Text("parse");
                org.whole.lang.commons.builders.ICommonsBuilder b1 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
                b1.Resolver();
                b0.StringLiteral("entity Person {\n    string name\n    string firstName\n    date birthDate\n    Car ownedCar\n}\n\nentity Car {\n    string make\n    string model\n}");
                b0.Variable("entitiesGrammar");
                b1.Resolver();
                b0._Parse();
            }
        };
    }

    public ITemplateFactory<IEntity> newfragment3() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.commons.builders.ICommonsBuilder b0 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
                org.whole.lang.reflect.EntityDescriptorEnum e1 = org.whole.lang.reflect.ReflectionFactory.getLanguageKit("http://lwc11.crossexamples.whole.org/entities").getEntityDescriptorEnum();
                b0.wEntity_(e1.valueOf("Module"));
                b0.Resolver();
                b0.Resolver();
                b0.wEntity_(e1.valueOf("Entities"), 2);
                b0.wEntity_(e1.valueOf("Entity"));
                b0.wEntity(e1.valueOf("Name"), "Person");
                b0.wEntity_(e1.valueOf("Properties"), 4);
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("PrimitiveType"), "string");
                b0.wEntity(e1.valueOf("Name"), "name");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("PrimitiveType"), "string");
                b0.wEntity(e1.valueOf("Name"), "firstName");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("PrimitiveType"), "date");
                b0.wEntity(e1.valueOf("Name"), "birthDate");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "Car");
                b0.wEntity(e1.valueOf("Name"), "ownedCar");
                b0._wEntity(e1.valueOf("Property"));
                b0._wEntity(e1.valueOf("Properties"));
                b0._wEntity(e1.valueOf("Entity"));
                b0.wEntity_(e1.valueOf("Entity"));
                b0.wEntity(e1.valueOf("Name"), "Car");
                b0.wEntity_(e1.valueOf("Properties"), 2);
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("PrimitiveType"), "string");
                b0.wEntity(e1.valueOf("Name"), "make");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("PrimitiveType"), "string");
                b0.wEntity(e1.valueOf("Name"), "model");
                b0._wEntity(e1.valueOf("Property"));
                b0._wEntity(e1.valueOf("Properties"));
                b0._wEntity(e1.valueOf("Entity"));
                b0._wEntity(e1.valueOf("Entities"));
                b0._wEntity(e1.valueOf("Module"));
            }
        };
    }

    public ITemplateFactory<IEntity> newfragment4() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.commons.builders.ICommonsBuilder b0 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
                b0.StageUpFragment_();
                org.whole.lang.reflect.EntityDescriptorEnum e1 = org.whole.lang.reflect.ReflectionFactory.getLanguageKit("http://lwc11.crossexamples.whole.org/entities").getEntityDescriptorEnum();
                b0.wEntity_(e1.valueOf("Module"));
                b0.Resolver();
                b0.Resolver();
                b0.wEntity_(e1.valueOf("Entities"), 2);
                b0.wEntity_(e1.valueOf("Entity"));
                b0.wEntity(e1.valueOf("Name"), "Person");
                b0.wEntity_(e1.valueOf("Properties"), 4);
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("PrimitiveType"), "string");
                b0.wEntity(e1.valueOf("Name"), "name");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("PrimitiveType"), "string");
                b0.wEntity(e1.valueOf("Name"), "firstName");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("PrimitiveType"), "date");
                b0.wEntity(e1.valueOf("Name"), "birthDate");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "Car");
                b0.wEntity(e1.valueOf("Name"), "ownedCar");
                b0._wEntity(e1.valueOf("Property"));
                b0._wEntity(e1.valueOf("Properties"));
                b0._wEntity(e1.valueOf("Entity"));
                b0.wEntity_(e1.valueOf("Entity"));
                b0.wEntity(e1.valueOf("Name"), "Car");
                b0.wEntity_(e1.valueOf("Properties"), 2);
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("PrimitiveType"), "string");
                b0.wEntity(e1.valueOf("Name"), "make");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("PrimitiveType"), "string");
                b0.wEntity(e1.valueOf("Name"), "model");
                b0._wEntity(e1.valueOf("Property"));
                b0._wEntity(e1.valueOf("Properties"));
                b0._wEntity(e1.valueOf("Entity"));
                b0._wEntity(e1.valueOf("Entities"));
                b0._wEntity(e1.valueOf("Module"));
                b0._StageUpFragment();
            }
        };
    }

    public ITemplateFactory<IEntity> newfragment5() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.workflows.builders.IWorkflowsBuilder b0 = (org.whole.lang.workflows.builders.IWorkflowsBuilder) op.wGetBuilder(org.whole.lang.workflows.reflect.WorkflowsLanguageKit.URI);
                b0.Unparse_();
                b0.Text("unparse");
                org.whole.lang.commons.builders.ICommonsBuilder b1 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
                b1.StageUpFragment_();
                org.whole.lang.reflect.EntityDescriptorEnum e2 = org.whole.lang.reflect.ReflectionFactory.getLanguageKit("http://lwc11.crossexamples.whole.org/entities").getEntityDescriptorEnum();
                b1.wEntity_(e2.valueOf("Module"));
                b1.Resolver();
                b1.Resolver();
                b1.wEntity_(e2.valueOf("Entities"), 2);
                b1.wEntity_(e2.valueOf("Entity"));
                b1.wEntity(e2.valueOf("Name"), "Person");
                b1.wEntity_(e2.valueOf("Properties"), 4);
                b1.wEntity_(e2.valueOf("Property"));
                b1.wEntity(e2.valueOf("PrimitiveType"), "string");
                b1.wEntity(e2.valueOf("Name"), "name");
                b1._wEntity(e2.valueOf("Property"));
                b1.wEntity_(e2.valueOf("Property"));
                b1.wEntity(e2.valueOf("PrimitiveType"), "string");
                b1.wEntity(e2.valueOf("Name"), "firstName");
                b1._wEntity(e2.valueOf("Property"));
                b1.wEntity_(e2.valueOf("Property"));
                b1.wEntity(e2.valueOf("PrimitiveType"), "date");
                b1.wEntity(e2.valueOf("Name"), "birthDate");
                b1._wEntity(e2.valueOf("Property"));
                b1.wEntity_(e2.valueOf("Property"));
                b1.wEntity(e2.valueOf("Name"), "Car");
                b1.wEntity(e2.valueOf("Name"), "ownedCar");
                b1._wEntity(e2.valueOf("Property"));
                b1._wEntity(e2.valueOf("Properties"));
                b1._wEntity(e2.valueOf("Entity"));
                b1.wEntity_(e2.valueOf("Entity"));
                b1.wEntity(e2.valueOf("Name"), "Car");
                b1.wEntity_(e2.valueOf("Properties"), 2);
                b1.wEntity_(e2.valueOf("Property"));
                b1.wEntity(e2.valueOf("PrimitiveType"), "string");
                b1.wEntity(e2.valueOf("Name"), "make");
                b1._wEntity(e2.valueOf("Property"));
                b1.wEntity_(e2.valueOf("Property"));
                b1.wEntity(e2.valueOf("PrimitiveType"), "string");
                b1.wEntity(e2.valueOf("Name"), "model");
                b1._wEntity(e2.valueOf("Property"));
                b1._wEntity(e2.valueOf("Properties"));
                b1._wEntity(e2.valueOf("Entity"));
                b1._wEntity(e2.valueOf("Entities"));
                b1._wEntity(e2.valueOf("Module"));
                b1._StageUpFragment();
                b1.Resolver();
                b0.Variable("entitiesGrammar");
                b1.Resolver();
                b0._Unparse();
            }
        };
    }

    public ITemplateFactory<IEntity> newfragment6() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.environment.builders.IEnvironmentBuilder b0 = (org.whole.lang.environment.builders.IEnvironmentBuilder) op.wGetBuilder(org.whole.lang.environment.reflect.EnvironmentLanguageKit.URI);
                b0.StringData("entity Person {\n    string name\n    string firstName\n    date birthDate\n    Car ownedCar\n}\n\nentity Car {\n    string make\n    string model\n}\n");
            }
        };
    }

    public ITemplateFactory<IEntity> newfragment7() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.commons.builders.ICommonsBuilder b0 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
                b0.StageUpFragment_();
                org.whole.lang.environment.builders.IEnvironmentBuilder b1 = (org.whole.lang.environment.builders.IEnvironmentBuilder) op.wGetBuilder(org.whole.lang.environment.reflect.EnvironmentLanguageKit.URI);
                b1.StringData("entity Person {\n    string name\n    string firstName\n    date birthDate\n    Car ownedCar\n}\n\nentity Car {\n    string make\n    string model\n}\n");
                b0._StageUpFragment();
            }
        };
    }

    public ITemplateFactory<IEntity> newfragment8() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.workflows.builders.IWorkflowsBuilder b0 = (org.whole.lang.workflows.builders.IWorkflowsBuilder) op.wGetBuilder(org.whole.lang.workflows.reflect.WorkflowsLanguageKit.URI);
                b0.Parse_();
                b0.Text("parse");
                org.whole.lang.commons.builders.ICommonsBuilder b1 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
                b1.Resolver();
                b0.StringLiteral("entity Person {\n    string name\n    string firstName\n    date birthDate\n    Car ownedCar");
                b0.Variable("entitiesGrammar");
                b1.Resolver();
                b0._Parse();
            }
        };
    }

    public ITemplateFactory<IEntity> newfragment9() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.workflows.builders.IWorkflowsBuilder b0 = (org.whole.lang.workflows.builders.IWorkflowsBuilder) op.wGetBuilder(org.whole.lang.workflows.reflect.WorkflowsLanguageKit.URI);
                b0.Parse_();
                b0.Text("parse");
                org.whole.lang.commons.builders.ICommonsBuilder b1 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
                b1.Resolver();
                b0.StringLiteral("Person p = {\n    name = \"Voelter\"\n    firstName = \"Markus\"\n    birthDate = 14.02.1927\n    ownedCar = c\n}\nCar c = {\n    make = \"VW\"\n    model = \"Touran\"\n}");
                b0.Variable("instancesGrammar");
                b1.Resolver();
                b0._Parse();
            }
        };
    }

    public ITemplateFactory<IEntity> newfragment10() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.commons.builders.ICommonsBuilder b0 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
                org.whole.lang.reflect.EntityDescriptorEnum e1 = org.whole.lang.reflect.ReflectionFactory.getLanguageKit("http://lwc11.crossexamples.whole.org/instances").getEntityDescriptorEnum();
                b0.wEntity_(e1.valueOf("Instances"), 2);
                b0.wEntity_(e1.valueOf("Instance"));
                b0.wEntity(e1.valueOf("Name"), "Person");
                b0.wEntity(e1.valueOf("Name"), "p");
                b0.wEntity_(e1.valueOf("Properties"), 4);
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "name");
                b0.wEntity(e1.valueOf("StringLiteral"), "Voelter");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "firstName");
                b0.wEntity(e1.valueOf("StringLiteral"), "Markus");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "birthDate");
                b0.wEntity(e1.valueOf("DateLiteral"), new java.util.Date(-1353196800000l));
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "ownedCar");
                b0.wEntity(e1.valueOf("Name"), "c");
                b0._wEntity(e1.valueOf("Property"));
                b0._wEntity(e1.valueOf("Properties"));
                b0._wEntity(e1.valueOf("Instance"));
                b0.wEntity_(e1.valueOf("Instance"));
                b0.wEntity(e1.valueOf("Name"), "Car");
                b0.wEntity(e1.valueOf("Name"), "c");
                b0.wEntity_(e1.valueOf("Properties"), 2);
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "make");
                b0.wEntity(e1.valueOf("StringLiteral"), "VW");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "model");
                b0.wEntity(e1.valueOf("StringLiteral"), "Touran");
                b0._wEntity(e1.valueOf("Property"));
                b0._wEntity(e1.valueOf("Properties"));
                b0._wEntity(e1.valueOf("Instance"));
                b0._wEntity(e1.valueOf("Instances"));
            }
        };
    }

    public ITemplateFactory<IEntity> newfragment11() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.commons.builders.ICommonsBuilder b0 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
                b0.StageUpFragment_();
                org.whole.lang.reflect.EntityDescriptorEnum e1 = org.whole.lang.reflect.ReflectionFactory.getLanguageKit("http://lwc11.crossexamples.whole.org/instances").getEntityDescriptorEnum();
                b0.wEntity_(e1.valueOf("Instances"), 2);
                b0.wEntity_(e1.valueOf("Instance"));
                b0.wEntity(e1.valueOf("Name"), "Person");
                b0.wEntity(e1.valueOf("Name"), "p");
                b0.wEntity_(e1.valueOf("Properties"), 4);
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "name");
                b0.wEntity(e1.valueOf("StringLiteral"), "Voelter");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "firstName");
                b0.wEntity(e1.valueOf("StringLiteral"), "Markus");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "birthDate");
                b0.wEntity(e1.valueOf("DateLiteral"), new java.util.Date(-1353196800000l));
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "ownedCar");
                b0.wEntity(e1.valueOf("Name"), "c");
                b0._wEntity(e1.valueOf("Property"));
                b0._wEntity(e1.valueOf("Properties"));
                b0._wEntity(e1.valueOf("Instance"));
                b0.wEntity_(e1.valueOf("Instance"));
                b0.wEntity(e1.valueOf("Name"), "Car");
                b0.wEntity(e1.valueOf("Name"), "c");
                b0.wEntity_(e1.valueOf("Properties"), 2);
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "make");
                b0.wEntity(e1.valueOf("StringLiteral"), "VW");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "model");
                b0.wEntity(e1.valueOf("StringLiteral"), "Touran");
                b0._wEntity(e1.valueOf("Property"));
                b0._wEntity(e1.valueOf("Properties"));
                b0._wEntity(e1.valueOf("Instance"));
                b0._wEntity(e1.valueOf("Instances"));
                b0._StageUpFragment();
            }
        };
    }

    public ITemplateFactory<IEntity> newfragment12() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.workflows.builders.IWorkflowsBuilder b0 = (org.whole.lang.workflows.builders.IWorkflowsBuilder) op.wGetBuilder(org.whole.lang.workflows.reflect.WorkflowsLanguageKit.URI);
                b0.Parse_();
                b0.Text("parse");
                org.whole.lang.commons.builders.ICommonsBuilder b1 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
                b1.Resolver();
                b0.StringLiteral("Person p = {\n    name = \"Voelter\"\n    firstName = \"Markus\"\n    birthDate = 44.02.1927\n    ownedCar = c\n}\nCar c = {\n    make = \"VW\"\n    model = 336\n}");
                b0.Variable("instancesGrammar");
                b1.Resolver();
                b0._Parse();
            }
        };
    }

    public ITemplateFactory<IEntity> newfragment13() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.commons.builders.ICommonsBuilder b0 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
                org.whole.lang.reflect.EntityDescriptorEnum e1 = org.whole.lang.reflect.ReflectionFactory.getLanguageKit("http://lwc11.crossexamples.whole.org/instances").getEntityDescriptorEnum();
                b0.wEntity_(e1.valueOf("Instances"), 2);
                b0.wEntity_(e1.valueOf("Instance"));
                b0.wEntity(e1.valueOf("Name"), "Person");
                b0.wEntity(e1.valueOf("Name"), "p");
                b0.wEntity_(e1.valueOf("Properties"), 4);
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "name");
                b0.wEntity(e1.valueOf("StringLiteral"), "Voelter");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "firstName");
                b0.wEntity(e1.valueOf("StringLiteral"), "Markus");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "birthDate");
                b0.wEntity(e1.valueOf("DateLiteral"), new java.util.Date(-1350604800000l));
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "ownedCar");
                b0.wEntity(e1.valueOf("Name"), "c");
                b0._wEntity(e1.valueOf("Property"));
                b0._wEntity(e1.valueOf("Properties"));
                b0._wEntity(e1.valueOf("Instance"));
                b0.wEntity_(e1.valueOf("Instance"));
                b0.wEntity(e1.valueOf("Name"), "Car");
                b0.wEntity(e1.valueOf("Name"), "c");
                b0.wEntity_(e1.valueOf("Properties"), 2);
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "make");
                b0.wEntity(e1.valueOf("StringLiteral"), "VW");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "model");
                b0.wEntity(e1.valueOf("IntLiteral"), 336);
                b0._wEntity(e1.valueOf("Property"));
                b0._wEntity(e1.valueOf("Properties"));
                b0._wEntity(e1.valueOf("Instance"));
                b0._wEntity(e1.valueOf("Instances"));
            }
        };
    }

    public ITemplateFactory<IEntity> newfragment14() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.commons.builders.ICommonsBuilder b0 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
                b0.StageUpFragment_();
                org.whole.lang.reflect.EntityDescriptorEnum e1 = org.whole.lang.reflect.ReflectionFactory.getLanguageKit("http://lwc11.crossexamples.whole.org/instances").getEntityDescriptorEnum();
                b0.wEntity_(e1.valueOf("Instances"), 2);
                b0.wEntity_(e1.valueOf("Instance"));
                b0.wEntity(e1.valueOf("Name"), "Person");
                b0.wEntity(e1.valueOf("Name"), "p");
                b0.wEntity_(e1.valueOf("Properties"), 4);
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "name");
                b0.wEntity(e1.valueOf("StringLiteral"), "Voelter");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "firstName");
                b0.wEntity(e1.valueOf("StringLiteral"), "Markus");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "birthDate");
                b0.wEntity(e1.valueOf("DateLiteral"), new java.util.Date(-1350604800000l));
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "ownedCar");
                b0.wEntity(e1.valueOf("Name"), "c");
                b0._wEntity(e1.valueOf("Property"));
                b0._wEntity(e1.valueOf("Properties"));
                b0._wEntity(e1.valueOf("Instance"));
                b0.wEntity_(e1.valueOf("Instance"));
                b0.wEntity(e1.valueOf("Name"), "Car");
                b0.wEntity(e1.valueOf("Name"), "c");
                b0.wEntity_(e1.valueOf("Properties"), 2);
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "make");
                b0.wEntity(e1.valueOf("StringLiteral"), "VW");
                b0._wEntity(e1.valueOf("Property"));
                b0.wEntity_(e1.valueOf("Property"));
                b0.wEntity(e1.valueOf("Name"), "model");
                b0.wEntity(e1.valueOf("IntLiteral"), 336);
                b0._wEntity(e1.valueOf("Property"));
                b0._wEntity(e1.valueOf("Properties"));
                b0._wEntity(e1.valueOf("Instance"));
                b0._wEntity(e1.valueOf("Instances"));
                b0._StageUpFragment();
            }
        };
    }

    public ITemplateFactory<IEntity> newfragment15() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.workflows.builders.IWorkflowsBuilder b0 = (org.whole.lang.workflows.builders.IWorkflowsBuilder) op.wGetBuilder(org.whole.lang.workflows.reflect.WorkflowsLanguageKit.URI);
                b0.Unparse_();
                b0.Text("unparse");
                org.whole.lang.commons.builders.ICommonsBuilder b1 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
                b1.StageUpFragment_();
                org.whole.lang.reflect.EntityDescriptorEnum e2 = org.whole.lang.reflect.ReflectionFactory.getLanguageKit("http://lwc11.crossexamples.whole.org/instances").getEntityDescriptorEnum();
                b1.wEntity_(e2.valueOf("Instances"), 2);
                b1.wEntity_(e2.valueOf("Instance"));
                b1.wEntity(e2.valueOf("Name"), "Person");
                b1.wEntity(e2.valueOf("Name"), "p");
                b1.wEntity_(e2.valueOf("Properties"), 4);
                b1.wEntity_(e2.valueOf("Property"));
                b1.wEntity(e2.valueOf("Name"), "name");
                b1.wEntity(e2.valueOf("StringLiteral"), "Voelter");
                b1._wEntity(e2.valueOf("Property"));
                b1.wEntity_(e2.valueOf("Property"));
                b1.wEntity(e2.valueOf("Name"), "firstName");
                b1.wEntity(e2.valueOf("StringLiteral"), "Markus");
                b1._wEntity(e2.valueOf("Property"));
                b1.wEntity_(e2.valueOf("Property"));
                b1.wEntity(e2.valueOf("Name"), "birthDate");
                b1.wEntity(e2.valueOf("DateLiteral"), new java.util.Date(-1350604800000l));
                b1._wEntity(e2.valueOf("Property"));
                b1.wEntity_(e2.valueOf("Property"));
                b1.wEntity(e2.valueOf("Name"), "ownedCar");
                b1.wEntity(e2.valueOf("Name"), "c");
                b1._wEntity(e2.valueOf("Property"));
                b1._wEntity(e2.valueOf("Properties"));
                b1._wEntity(e2.valueOf("Instance"));
                b1.wEntity_(e2.valueOf("Instance"));
                b1.wEntity(e2.valueOf("Name"), "Car");
                b1.wEntity(e2.valueOf("Name"), "c");
                b1.wEntity_(e2.valueOf("Properties"), 2);
                b1.wEntity_(e2.valueOf("Property"));
                b1.wEntity(e2.valueOf("Name"), "make");
                b1.wEntity(e2.valueOf("StringLiteral"), "VW");
                b1._wEntity(e2.valueOf("Property"));
                b1.wEntity_(e2.valueOf("Property"));
                b1.wEntity(e2.valueOf("Name"), "model");
                b1.wEntity(e2.valueOf("IntLiteral"), 336);
                b1._wEntity(e2.valueOf("Property"));
                b1._wEntity(e2.valueOf("Properties"));
                b1._wEntity(e2.valueOf("Instance"));
                b1._wEntity(e2.valueOf("Instances"));
                b1._StageUpFragment();
                b1.Resolver();
                b0.Variable("instancesGrammar");
                b1.Resolver();
                b0._Unparse();
            }
        };
    }

    public ITemplateFactory<IEntity> newfragment16() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.environment.builders.IEnvironmentBuilder b0 = (org.whole.lang.environment.builders.IEnvironmentBuilder) op.wGetBuilder(org.whole.lang.environment.reflect.EnvironmentLanguageKit.URI);
                b0.StringData("Person p = {\n    name = \"Voelter\"\n    firstName = \"Markus\"\n    birthDate = 16.03.1927\n    ownedCar = c\n}\nCar c = {\n    make = \"VW\"\n    model = 336\n}");
            }
        };
    }

    public ITemplateFactory<IEntity> newfragment17() {
        return new AbstractTemplateFactory<IEntity>() {

            public void apply(org.whole.lang.builders.IBuilderOperation op) {
                org.whole.lang.commons.builders.ICommonsBuilder b0 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
                b0.StageUpFragment_();
                org.whole.lang.environment.builders.IEnvironmentBuilder b1 = (org.whole.lang.environment.builders.IEnvironmentBuilder) op.wGetBuilder(org.whole.lang.environment.reflect.EnvironmentLanguageKit.URI);
                b1.StringData("Person p = {\n    name = \"Voelter\"\n    firstName = \"Markus\"\n    birthDate = 16.03.1927\n    ownedCar = c\n}\nCar c = {\n    make = \"VW\"\n    model = 336\n}");
                b0._StageUpFragment();
            }
        };
    }
}
