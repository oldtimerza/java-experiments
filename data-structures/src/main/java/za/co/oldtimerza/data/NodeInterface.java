package za.co.oldtimerza.data;

public interface NodeInterface<T> {
    T getData();
    NodeInterface getNext();
    NodeInterface getPrev();
    void setData(T data);
    void setNext(NodeInterface node);
    void setPrev(NodeInterface node);
}
