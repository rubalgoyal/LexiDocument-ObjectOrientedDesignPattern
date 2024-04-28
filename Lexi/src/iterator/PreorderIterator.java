// Iterrator(257) Pattren
// Concrete Subclass

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
            // TODO: Need to revisit this logic
            if(topIterator.isDone())
                stack.push(topIterator);
        }
    }

    // TODO: Need t recheck if words will not get printed correctly
    @Override
    public T next() {
        if (!stack.isEmpty()) {
            Iterator<T> topIterator = stack.pop();
            topIterator.first();
            stack.push(topIterator);

            while (topIterator.isDone() && !stack.isEmpty()) {
                stack.pop();
                if (!stack.isEmpty()) {
                    topIterator = stack.peek();
                    topIterator.next();
                }
            }
        }
        return null;
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