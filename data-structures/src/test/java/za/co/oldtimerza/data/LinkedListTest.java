package za.co.oldtimerza.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest{

    private LinkedList list;
    private Linkable node1;
    private Linkable node2;
    private Linkable node3;

    @Before
   public void setup(){
        this.list = new LinkedList();
        this.list.add("node1");
        this.list.add("node2");
        this.list.add("node3");
    }

    @Test
    public void shouldAddHeadToList()
    {
        Assert.assertEquals(this.list.getFirst().getData(),"node1");
    }

    @Test
    public void shouldAddNodeToEndOfList()
    {
        Assert.assertEquals(this.list.getLast().getData(),"node3");
    }

    @Test
    public void shoudlAddNodeAtPosition()
    {
    Linkable node4 = new Node<Integer>();
    this.list.add(1,node4);
    Assert.assertEquals(this.list.get(2).getNext().getData(), "node3");
    }

    @Test
    public void shouldGetListLength()
    {
        Assert.assertEquals(this.list.length(),3);
    }

    @Test
    public void shouldGetNode(){
        Assert.assertEquals(this.list.get(1).getData(),"node2");
    }
}

