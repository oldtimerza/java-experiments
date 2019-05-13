package za.co.oldtimerza.data;

public interface NodeInterface<T> {
    T getData();
    Node getNext();
    Node getPrev();
    void setData(T data);
    void setNext(Node node);
    void setPrev(Node node);
}
