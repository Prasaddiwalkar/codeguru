package code.codeguru.interview.stack;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();

    private int min = 0;

    public void add(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(value);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        if (value < min) {
            min = value;
        }
    }

    public int remove() {
        return 0;
    }

    public int poll() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(0);
        }

        int x = stack1.peek();
        stack1.pop();

        return x;
    }

    public int peak() {
        return 0;
    }

    public int element() {
        return 0;
    }

    public int min() {

        return min;
    }
}
