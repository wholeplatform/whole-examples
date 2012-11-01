package org.whole.crossexamples.lwc11.tests;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.whole.lang.tests.junit.EntityMatchers.*;
import org.junit.*;
import org.whole.lang.model.IEntity;
import org.whole.lang.reflect.ReflectionFactory;
import org.whole.lang.tests.junit.TestCase;

public class GrammarsConformanceTest extends TestCase {

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
        return GrammarsConformanceTestTemplateManager.instance().create(templateName);
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
    public void testEntities() {
        bindings().wEnterScope();
        IEntity subject;
        subject = evaluate("fragment2");
        assertThat("at /testCases/0/tests/0/body/0", subject, matches(create("fragment3")));
        subject = evaluate("fragment5");
        assertThat("at /testCases/0/tests/0/body/1", subject, matches(create("fragment6")));
        subject = evaluate("fragment8");
        assertThat("at /testCases/0/tests/0/body/2", subject, isNull());
        bindings().wExitScope();
    }

    /**
     *
     */
    @Test
    public void testInstances() {
        bindings().wEnterScope();
        IEntity subject;
        subject = evaluate("fragment9");
        assertThat("at /testCases/0/tests/1/body/0", subject, matches(create("fragment10")));
        subject = evaluate("fragment12");
        assertThat("at /testCases/0/tests/1/body/1", subject, matches(create("fragment13")));
        subject = evaluate("fragment15");
        assertThat("at /testCases/0/tests/1/body/2", subject, matches(create("fragment16")));
        bindings().wExitScope();
    }
}
