package za.co.oldtimerza.data;

public interface LinkedList {
    void add(LinkableContainer node);
    void remove(int node);
    LinkableContainer getHead();
    LinkableContainer getTail();
    LinkableContainer get(int index);
}
