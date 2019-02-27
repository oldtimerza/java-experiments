package za.co.oldtimerza.javaexperiments.streams;

public class SimpleAtoLowerB implements AtoLowerB{
    @Override
    public ObjectB createB(ObjectA objectA) {
        return new ObjectB(objectA.name.toLowerCase());
    }
}
