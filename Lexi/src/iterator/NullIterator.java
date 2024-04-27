package iterator;

public class NullIterator<T> implements Iterator<T>{
    @Override
    public void first() {

    }

    @Override
    public void next() {

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
