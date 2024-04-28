package iterator;

public class NullIterator<T> implements Iterator<T>{
    @Override
    public void first() {

    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public boolean isDone() {
        return true;
    }

    @Override
    public T currentItem() {
        return null;
    }
}
