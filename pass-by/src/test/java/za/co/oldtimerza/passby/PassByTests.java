package za.co.oldtimerza.passby;

import org.junit.Assert;
import org.junit.Test;

public class PassByTests {
    @Test
    public void objectPassReferenceByValue() {
        String initialTest = "TEST";
        SimpleObject simpleObject = new SimpleObject();
        simpleObject.test = initialTest;

        PassByReferenceScenarios.changeTest(simpleObject);

        Assert.assertNotEquals(initialTest, simpleObject.test);
    }

    @Test
    public void objectsAreNotPassByReference(){
        String initialTest = "TEST";
        SimpleObject simpleObject = new SimpleObject();
        simpleObject.test = initialTest;

        PassByReferenceScenarios.changeObjectsReference(simpleObject);

        Assert.assertEquals(initialTest, simpleObject.test);
    }

    @Test
    public void primitivesArePassByValue(){
        String someString = "TEST";

        PassByReferenceScenarios.changeString(someString);

        Assert.assertEquals("TEST", someString);
    }
}
