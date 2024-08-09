import java.util.Arrays;

public class Stack {


    private int[] stackArray = new int[5];

    private int count;

    public int pop() {
        if (count == 0)
            throw new IllegalStateException();
        return stackArray[--count];
    }

    public void push(int value) {
        if (count == stackArray.length)
            throw new StackOverflowError();
        stackArray[count++] = value;
    }

    public int peek() {
        if (count == 0)
            throw new IllegalStateException();
        return stackArray[count - 1];
    }

    public boolean isEmpty() {
        return count <= 0;
    }


    @Override
    public String toString() {

        int[] content = Arrays.copyOfRange(stackArray, 0, count);
        return Arrays.toString(content);
    }
}
