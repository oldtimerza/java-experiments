package za.co.oldtimerza.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest{

    private LinkedList list;
    private LinkableContainer node1;
    private LinkableContainer node2;
    private LinkableContainer node3;

    @Before
   public void setup(){
        this.list = new LinkedList();
        this.node1 = new Node<String>("node1");
        this.node2 = new Node<String>("node2");
        this.node3 = new Node<String>("node3");
        this.list.add(node1);
        this.list.add(node2);
        this.list.add(node3);
    }

    @Test
    public void shouldAddHeadToList()
    {
        Assert.assertEquals(this.list.getFirst(),node1);
    }

    @Test
    public void shouldAddNodeToEndOfList()
    {
        Assert.assertEquals(this.list.getLast(),node3);
    }

    @Test
    public void shoudlAddNodeAtPosition()
    {
    LinkableContainer node4 = new Node<Integer>();
    this.list.add(1,node4);
    Assert.assertEquals(this.list.get(2).getNext(), node3);
    }

    @Test
    public void shouldGetListLength()
    {
        Assert.assertEquals(this.list.length(),3);
    }

    @Test
    public void shouldGetNode(){
        Assert.assertEquals(this.list.get(1),node2);
    }
}

