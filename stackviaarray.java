// Stack class
public class Stack {
    private int[] arr;  // Array to hold stack elements
    private int size;   // Size of the stack
    private int index;  // Tracks the top element of the stack
    
    // Constructor to initialize the stack
    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        index = -1; // Stack is empty initially
    }

    // Pushing elements into the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            arr[++index] = element;  // Increment index before storing element
        }
    }

    // Popping elements from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;  // Return -1 to indicate an error
        } else {
            return arr[index--];  // Decrement index after returning the top element
        }
    }

    // Checking whether the stack is empty
    public boolean isEmpty() {
        return index == -1;
    }

    // Checking whether the stack is full
    public boolean isFull() {
        return index == size - 1;
    }

    // Returning the current size of the stack
    public int size() {
        return index + 1;  // The size is one more than the index
    }
}

// Client class to test the stack
public class ClientStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);  // Create a stack with a capacity of 5
        stack.push(8);
        stack.push(11);
        stack.push(13);
        stack.push(20);
        stack.push(11);

        System.out.println("1. Size of stack after push operations: " + stack.size());

        System.out.println("2. Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf("%d ", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations: " + stack.size());
    }
}
