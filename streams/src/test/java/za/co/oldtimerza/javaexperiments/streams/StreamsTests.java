package za.co.oldtimerza.javaexperiments.streams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTests {
    @Test
    public void collectionLamdaForEach() {
        List<String> strings = new ArrayList<String>();
        strings.add("TEST");
        strings.add("TEST2");
        strings.add("TEST4");
        strings.add("TEST3");
        strings.add("TESTlkj");

        strings.forEach(System.out::println);
    }


    @Test
    public void mapStringObjectAToObjectB(){
        List<ObjectA> objectAs = Arrays.asList(new ObjectA("test1"), new ObjectA("test2"));
        List<ObjectB>  objectBS = objectAs.stream().map(objectA -> new ObjectB(objectA.name.toLowerCase())).collect(Collectors.toList());
        System.out.println(objectBS.get(0).name);
    }

    @Test
    public void functionalInterfaceTest(){
        List<ObjectA> objectAs = Arrays.asList(new ObjectA("test1"), new ObjectA("test2"));
        SimpleAtoLowerB simpleAtoLowerB = new SimpleAtoLowerB();
        List<ObjectB>  objectBS = objectAs.stream().map(simpleAtoLowerB::createB).collect(Collectors.toList());
        System.out.println(objectBS.get(0).name);
    }


    @Test
    public void inlineInterfaceCreate(){
        AtoLowerB atoLowerB = objectA -> new ObjectB("hello");
        List<ObjectA> objectAs = Arrays.asList(new ObjectA("test1"), new ObjectA("test2"));
        List<ObjectB>  objectBS = objectAs.stream().map(atoLowerB::createB).collect(Collectors.toList());
        System.out.println(objectBS.get(0).name);
    }

    @Test
    public void filterTest(){
        List<Integer> integers = Arrays.asList(1,2,3,4,5,5,6,38,3);
        integers.stream().filter(integer -> integer > 5).forEach(System.out::println);
    }

    @Test
    public void referenceToOutside(){
        List<Integer> integers = Arrays.asList(1,2,3,4,5,5,6,38,3);
        List<String>  strings = new ArrayList<>();
        integers.forEach(integer -> strings.add(integer.toString()));
        System.out.println(strings.size());
    }
}

