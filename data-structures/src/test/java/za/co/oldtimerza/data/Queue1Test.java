package za.co.oldtimerza.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Queue1Test {

    private LinkedList queue;
    private Linkable node1;
    private Linkable node2;
    private Linkable node3;
    private Linkable node4;

    @Before
    public void setup(){
        this.queue = new LinkedList();

        this.node1 = new Node<String>("node1");
        this.node2 = new Node<String>("node2");
        this.node3 = new Node<String>("node3");
        this.node4 = new Node<String>("node4");
    }

    @Test
    public void shouldAddNodeToQueue()
    {
        this.queue.add(node1);
        Assert.assertEquals(this.queue.getFirst(),node1);

    }



    @Test
    public void shouldGetBackOfQueue()
    {
        this.queue.add(node1);
        this.queue.add(node2);
        this.queue.add(node3);
        Linkable tail = this.queue.getLast();
        Assert.assertEquals(tail,node3);
    }
}
