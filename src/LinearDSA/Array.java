package LinearDSA;

public class Array {
    public Array(int length) {
        items = new int[length];
    }

    private int count;

    private int[] items;

    public void insert(int item) {
        if (count == items.length) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index > count) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;

    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

    public int indexOf(int item) {
        int index = 0;
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;

    }
}
