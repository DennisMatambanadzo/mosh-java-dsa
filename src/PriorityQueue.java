import java.util.Arrays;

public class PriorityQueue {

    private int[] array = new int[10];
    private int count;

    public void enqueue(int item) {
        if (count == array.length) {
            throw new IllegalStateException();
        }
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (item < array[i]) {
                array[i + 1] = array[i];
            } else {
                break;
            }

        }
        array[i + 1] = item;
        count++;
    }

    public int remove() {
        if (count == 0)
            throw new IllegalStateException();

        return array[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        int[] contents = Arrays.copyOfRange(array, 0, count);
        return Arrays.toString(array);
    }
}
