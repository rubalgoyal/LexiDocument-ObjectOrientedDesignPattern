package iterator;

import java.util.List;

public class VectorIterator<T> implements Iterator<T> {
    private List<T> array;
    private int currentIndex = 0;

    public VectorIterator(List<T> array) {
        this.array = array;
    }

    @Override
    public void first() {
        currentIndex = 0;
    }

    @Override
    public void next() {
        currentIndex++;
    }

    @Override
    public boolean isDone() {
        return currentIndex >= array.size();
    }

    @Override
    public T currentItem() {
        if (currentIndex < array.size()) {
            return array.get(currentIndex);
        }
        return null;
    }
}
