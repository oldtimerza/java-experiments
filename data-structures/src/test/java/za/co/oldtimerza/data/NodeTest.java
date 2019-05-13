package za.co.oldtimerza.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NodeTest{

    private Node node1;
    private Node node2;


    @Before
    public void setup(){
        node1 = new Node<String>();
        node2 = new Node<String>();
    }


    @Test
    public void shouldSetNodeData(){
        node2.setData("test");
        Assert.assertEquals(node2.getData(),"test");
    }

    @Test
    public void shouldSetNodeNext(){
        node1.setNext(node2);
        node2.setData("test");
        Assert.assertEquals(node1.getNext().getData(), "test");
    }

}