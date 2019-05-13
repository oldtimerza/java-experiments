package za.co.oldtimerza.data;

public interface NodeInterface<T, E extends Node> {
    T getData();
    E getNext();
    E getPrev();
    void setData(T data);
    void setNext(E node);
    void setPrev(E node);
}
