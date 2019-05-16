package za.co.oldtimerza.data;

public interface CanHoldData<T> {
    void setData(T t);
    T getData();
}
