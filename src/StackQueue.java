import java.util.Stack;

public class StackQueue {
    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> secondStack = new Stack<>();
    private int front;
    private int count;


    public void enqueue(int item) {
        if (mainStack.isEmpty())
            mainStack.push(item);
        else {
            while (!mainStack.isEmpty()){
                secondStack.push(mainStack.pop());
            }
            mainStack.push(item);
            for (int i = 0; i < secondStack.size(); i++) {
                mainStack.push(secondStack.pop());
                front++;
                count++;
            }
        }
    }

    public int dequeue() {
        return mainStack.pop();
    }

    public int peek() {
       return mainStack.lastElement();
    }


    @Override
    public String toString() {
        return mainStack.toString();
    }
}
