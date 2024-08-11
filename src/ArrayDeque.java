import java.util.Arrays;

public class ArrayDeque {

    private int[] queueArray = new int[5];

    private int count;

    private int front;
    private int rear;


    public void enqueue(int item) {
        if (count == queueArray.length)
            throw new IllegalStateException();
        queueArray[count++] = item;
        rear = count - 1;
    }

    public int peek() {
        if (count == 0)
            throw new IllegalStateException();
        return queueArray[front];
    }

    public int dequeue() {
        if (count == 0)
            throw new IllegalStateException();
        var item = queueArray[front];
        front++;
        --count;
        return item;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == queueArray.length;
    }

    @Override
    public String toString() {
        System.out.println("rear: " + rear);
        System.out.println("count: " + count);
        return Arrays.toString(Arrays.copyOfRange(queueArray,0,front));
    }
}
