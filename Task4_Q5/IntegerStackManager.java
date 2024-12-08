package Task4_Q5;

import java.util.Stack;

public class IntegerStackManager {
    private Stack<Integer> stack;

    // Constructor
    public IntegerStackManager() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed " + element + " onto the stack.");
    }

    // Method to pop an element from the stack
    public void popElement() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty! Cannot pop elements.");
        } else {
            int poppedElement = stack.pop();
            System.out.println("Popped " + poppedElement + " from the stack.");
        }
    }

    // Method to display the current stack
    public void displayStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Current stack: " + stack);
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        IntegerStackManager manager = new IntegerStackManager();

        // Test the methods
        manager.pushElement(10);
        manager.pushElement(20);
        manager.pushElement(30);
        manager.displayStack(); // Displays the stack

        manager.popElement(); // Pops the top element
        manager.displayStack(); // Displays the stack after pop

        manager.popElement(); // Pops the top element
        manager.popElement(); // Pops the last element
        manager.popElement(); // Attempts to pop from an empty stack
    }
}
