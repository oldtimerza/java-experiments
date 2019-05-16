package za.co.oldtimerza.data;

public class Queue extends LinkedList {

    public Linkable remove()
    {
        Linkable head = this.getFirst();
        head.getNext().setPrev(null);
        this.setHead(head.getNext());
        return head;
    }
}