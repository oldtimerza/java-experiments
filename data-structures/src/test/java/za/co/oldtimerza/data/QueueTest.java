package za.co.oldtimerza.data;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {

    private Queue queue;
    private LinkableContainer node1;
    private LinkableContainer node2;
    private LinkableContainer node3;
    private LinkableContainer node4;

    @Before
    public void setup(){
        this.queue = new Queue();

        this.node1 = new Node<String>("node1");
        this.node2 = new Node<String>("node2");
        this.node3 = new Node<String>("node3");
        this.node4 = new Node<String>("node4");
    }

    @Test
    public void shouldAddNodeToQueue()
    {
        this.queue.enqueue(node1);

    }

}
