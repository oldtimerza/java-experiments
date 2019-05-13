package za.co.oldtimerza.data;

public class Node<T> implements NodeInterface<T>{

    private NodeInterface prev = null;
    private NodeInterface next = null;
    private T data = null;

    public NodeInterface getPrev() {
        return prev;
    }

    public void setPrev(NodeInterface prev) {
        this.prev = prev;
    }

    public NodeInterface getNext() {
        return next;
    }

    public void setNext(NodeInterface next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}