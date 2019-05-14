package za.co.oldtimerza.data;

public class Node<T> implements LinkableContainer<T> {

    private LinkableContainer prev = null;
    private LinkableContainer next = null;
    private T data = null;

    public Node(T t){
        this.data = t;
    }

    public Node(){

    }

    public LinkableContainer getPrev() {
        return prev;
    }

    public void setPrev(LinkableContainer prev) {
        this.prev = prev;
    }

    public LinkableContainer getNext() {
        return next;
    }

    public void setNext(LinkableContainer next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}