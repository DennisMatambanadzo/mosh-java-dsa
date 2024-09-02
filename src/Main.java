

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put(2, "Dennis");
        hashTable.put(3, "Larry");
        hashTable.put(1, "Charles");
        hashTable.remove(1);
        hashTable.put(6, "Bobby");

        System.out.println(hashTable.get(60));
    }
}