package enzo.genericite.exerciceStackGenerique;

public interface AStackGenerique<E> {
    boolean isEmpty();
    void push(E o);
    E peek();
    E pop();
}
