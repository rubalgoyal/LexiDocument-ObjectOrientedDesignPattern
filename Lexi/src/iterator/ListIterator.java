package iterator;

import java.util.List;

public class ListIterator<T> implements Iterator<T> {
    private List<T> list;
    private int currentIndex = 0;

    public ListIterator(List<T> list) {
        this.list = list;
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
        return currentIndex >= list.size();
    }

    @Override
    public T currentItem() {
        if (currentIndex < list.size()) {
            return list.get(currentIndex);
        }
        return null;
    }
}

