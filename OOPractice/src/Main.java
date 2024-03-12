// Generic Box class
class Box<T> {
    private T item;

    // Method to put an item into the box
    public void put(T item) {
        this.item = item;
    }

    // Method to get the item from the box
    public T get() {
        return item;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a box for integers
        Box<Integer> intBox = new Box<>();
        intBox.put(10); // Put an integer into the box
        int value = intBox.get(); // Get the integer from the box
        System.out.println("Integer value: " + value);

        // Create a box for strings
        Box<String> stringBox = new Box<>();
        stringBox.put("Hello"); // Put a string into the box
        String str = stringBox.get(); // Get the string from the box
        System.out.println("String value: " + str);
    }
}
