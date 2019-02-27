package za.co.oldtimerza.passby;

public class PassByReferenceScenarios {
    public static void changeTest(SimpleObject simpleObject){
        simpleObject.test = "Changed.";
    }

    public static void changeObjectsReference(SimpleObject simpleObject){
        simpleObject = new SimpleObject();
        simpleObject.test = "CHANGED";
    }

    public static void changeString(String string){
        string = "Changed";
    }
}
