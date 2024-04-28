package iterator;

public interface Iterator<T> {
    void first();
    T next();
    boolean isDone();
    T currentItem();
}

