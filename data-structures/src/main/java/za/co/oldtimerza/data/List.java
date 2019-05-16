package za.co.oldtimerza.data;

public interface List{
    void add(Linkable node);
    void add(int index, Linkable node);
    void remove(int node);
    Linkable getFirst();
    Linkable getLast();
    Linkable get(int index);

}
