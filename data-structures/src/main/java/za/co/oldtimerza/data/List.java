package za.co.oldtimerza.data;

public interface List{
    void add(LinkableContainer node);
    void add(int index, LinkableContainer node);
    void remove(int node);
    LinkableContainer getFirst();
    LinkableContainer getLast();
    LinkableContainer get(int index);

}
