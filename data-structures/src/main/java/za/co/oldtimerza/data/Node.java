package za.co.oldtimerza.data;

public class Node<T> implements Linkable{

    private Linkable prev = null;
    private Linkable next = null;
    private T data = null;

    public Node(T t){
        this.data = t;
    }

    public Node(){

    }

    public Linkable getPrev() {
        return prev;
    }

    public void setPrev(Linkable prev) {
        this.prev = prev;
    }

    public Linkable getNext() {
        return next;
    }

    public void setNext(Linkable next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(Object t) {
        this.data = data;
    }
}