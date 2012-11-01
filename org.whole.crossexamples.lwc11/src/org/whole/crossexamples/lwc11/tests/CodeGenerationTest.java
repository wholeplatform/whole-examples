package org.whole.crossexamples.lwc11.tests;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.whole.lang.tests.junit.EntityMatchers.*;
import org.junit.*;
import org.whole.lang.model.IEntity;
import org.whole.lang.reflect.ReflectionFactory;
import org.whole.lang.tests.junit.TestCase;

public class CodeGenerationTest extends TestCase {

    @BeforeClass
    public static void wholeDeploy() {
        ReflectionFactory.deploy(new Deployer());
        bindLWC11Artifacts();
    }

    @AfterClass
    public static void wholeUndeploy() {
        ReflectionFactory.undeploy(new Deployer());
    }

    protected static class Deployer extends org.whole.lang.reflect.AbstractContributionDeployer {

        public void deploy(ReflectionFactory platform) {
            evaluate("fragment");
        }
    }

    protected static IEntity create(String templateName) {
        return CodeGenerationTestTemplateManager.instance().create(templateName);
    }

    protected static IEntity evaluate(String templateName) {
        return evaluate(create(templateName));
    }

    /**
     *
     */
    static public void bindLWC11Artifacts() {
        evaluate("fragment1");
    }

    /**
     *
     */
    @Test
    public void testBeansGenerator() {
        bindings().wEnterScope();
        IEntity subject;
        subject = evaluate("fragment2");
        assertThat("at /testCases/1/tests/0/body/0", subject, matches(create("fragment3")));
        subject = evaluate("fragment5");
        assertThat("at /testCases/1/tests/0/body/1", subject, matches(create("fragment6")));
        bindings().wExitScope();
    }

    /**
     *
     */
    @Test
    public void testERGenerator() {
        bindings().wEnterScope();
        IEntity subject;
        subject = evaluate("fragment8");
        assertThat("at /testCases/1/tests/1/body/0", subject, matches(create("fragment9")));
        bindings().wExitScope();
    }

    /**
     *
     */
    @Test
    public void testXMLGenerator() {
        bindings().wEnterScope();
        IEntity subject;
        subject = evaluate("fragment11");
        assertThat("at /testCases/1/tests/2/body/0", subject, matches(create("fragment12")));
        bindings().wExitScope();
    }

    /**
     *
     */
    @Test
    public void testModelsGenerator() {
        bindings().wEnterScope();
        IEntity subject;
        subject = evaluate("fragment14");
        assertThat("at /testCases/1/tests/3/body/0", subject, matches(create("fragment15")));
        bindings().wExitScope();
    }

    /**
     *
     */
    @Test
    public void testRDBGenerator() {
        bindings().wEnterScope();
        IEntity subject;
        subject = evaluate("fragment17");
        assertThat("at /testCases/1/tests/4/body/0", subject, matches(create("fragment18")));
        bindings().wExitScope();
    }
}
