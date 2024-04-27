package iterator;

import java.util.Stack;

public class PreorderIterator<T> implements Iterator<T> {
    private Stack<Iterator<T>> stack = new Stack<>();

    public PreorderIterator(Iterator<T> rootIterator) {
        stack.push(rootIterator);
    }

    @Override
    public void first() {
        if (!stack.isEmpty()) {
            Iterator<T> topIterator = stack.peek();
            topIterator.first();
        }
    }

    @Override
    public void next() {
        if (!stack.isEmpty()) {
            Iterator<T> topIterator = stack.peek();
            topIterator.next();
            while (topIterator.isDone() && !stack.isEmpty()) {
                stack.pop();
                if (!stack.isEmpty()) {
                    topIterator = stack.peek();
                    topIterator.next();
                }
            }
        }
    }

    @Override
    public boolean isDone() {
        return stack.isEmpty();
    }

    @Override
    public T currentItem() {
        if (!stack.isEmpty()) {
            Iterator<T> topIterator = stack.peek();
            return topIterator.currentItem();
        }
        return null;
    }

    public void pushIterator(Iterator<T> iterator) {
        stack.push(iterator);
    }
}
