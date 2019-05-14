package za.co.oldtimerza.data;

public interface LinkableContainer<T> {
    T getData();
    LinkableContainer getNext();
    LinkableContainer getPrev();
    void setData(T data);
    void setNext(LinkableContainer node);
    void setPrev(LinkableContainer node);
}
