

public class Main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();


        pq.enqueue(5);
        pq.enqueue(3);
        pq.enqueue(6);
        pq.enqueue(7);
        pq.enqueue(4);
        pq.enqueue(3);
        pq.enqueue(2);

        System.out.println(pq);

        while (!pq.isEmpty())
            System.out.println(pq.remove());


    }
}