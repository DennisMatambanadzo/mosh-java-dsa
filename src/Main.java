import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);list.addLast(20);
        list.addLast(30);
//        list.deleteFirst();
        var array = list.toArray();
        System.out.println(Arrays.toString(array));


        System.out.println(list.size());
    }
}