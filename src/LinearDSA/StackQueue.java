package LinearDSA;

import java.util.Stack;

public class StackQueue {
    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> secondStack = new Stack<>();
    private int front;
    private int count;


    public void enqueue(int item) {
        while (!mainStack.empty()) {
            secondStack.push(mainStack.pop());
        }
        mainStack.push(item);
        while (!secondStack.empty()) {
            mainStack.push(secondStack.pop());
        }
    }

    public int dequeue() {
        if (mainStack.isEmpty())
            throw new IllegalStateException();
        return mainStack.pop();
    }

    public int peek() {
        if (mainStack.isEmpty())
            throw new IllegalStateException();
        return mainStack.lastElement();
    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }


    @Override
    public String toString() {
        return mainStack.toString();
    }
}
