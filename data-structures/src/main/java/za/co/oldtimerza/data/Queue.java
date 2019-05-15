package za.co.oldtimerza.data;

public class Queue extends LinkedList {

    public LinkableContainer remove()
    {
        LinkableContainer head = this.getFirst();
        head.getNext().setPrev(null);
        this.setHead(head.getNext());
        return head;
    }
}