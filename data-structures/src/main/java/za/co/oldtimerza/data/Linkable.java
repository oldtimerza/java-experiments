package za.co.oldtimerza.data;

public interface Linkable extends CanHoldData{
    Linkable getNext();
    Linkable getPrev();
    void setNext(Linkable node);
    void setPrev(Linkable node);
}
