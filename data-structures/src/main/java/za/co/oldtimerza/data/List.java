package za.co.oldtimerza.data;

public interface List<T>{
    Linkable getFirst();
    Linkable getLast();
    Linkable get(int index);
    Linkable get(T t);
    void add(T t);
    void add(int index, T t);
    void remove(int index);
    int length();
}
