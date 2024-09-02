import java.util.Arrays;
import java.util.LinkedList;

public class HashTable {
    private class Entry {

        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public int getKey() {
            return key;
        }
    }

    private final int arraySize = 5;


    private final LinkedList<Entry>[] hashMap = new LinkedList[arraySize];


    public void put(int key, String value) {
        var index = hashFunction(key);
        if (hashMap[index] == null)
            hashMap[index] = new LinkedList<Entry>();

        for (Entry entry : hashMap[index]) {
            if (entry.getKey() == key) {
                entry.key = key;
                return;
            }
        }
        hashMap[index].addLast(new Entry(key, value));

    }

    public String get(int key) {
        var index = hashFunction(key);
        LinkedList<Entry> entries = hashMap[index];
        for (Entry entry : entries) {
            if (entry.getKey() == key) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void remove(int key) {
        var index = hashFunction(key);
        var entries = hashMap[index];
        if (entries == null)
            throw new IllegalStateException();

        for (Entry entry : entries) {
            if (entry.getKey() == key) {
                entries.remove(entry);
                return;
            }
        }
        throw new IllegalStateException();
    }


    private int hashFunction(int key) {
        return key % arraySize;
    }
}
