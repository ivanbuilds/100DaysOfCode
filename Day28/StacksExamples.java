package stacksexamples;

import java.util.Stack;

public class StacksExamples {

    public static void main(String[] args) {
         Stack<String> stack = new Stack<>();

        System.out.println("Pushing elements onto the stack...");
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

        System.out.println("Stack: " + stack);

        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("Popping elements...");
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after popping: " + stack);

        System.out.println("Is the stack empty? " + stack.isEmpty());

        System.out.println("Iterating through the stack:");
        for (String element : stack) {
            System.out.println(element);
        }

        stack.clear();
        System.out.println("Stack after clearing: " + stack);
    }
    
}
