package za.co.oldtimerza.data;

public class Queue {

    private DoublyLinkedList queue;

    public Queue()
    {
    }

    public void setQueue(DoublyLinkedList queue){
        this.queue = queue;
    }

    public void enqueue(Node node)
    {
        this.queue.add(node);
    }

    public LinkableContainer dequeue(Node node)
    {
        LinkableContainer head = this.queue.getHead();
        this.queue.setHead(head.getNext());
        this.queue.getHead().setPrev(null);
        return head;
    }
}