import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        reverse(queue);
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue) {

        Stack<Integer> stack = new Stack<>();
        System.out.println("original queue : " + queue);
        for (int i = queue.size(); i > 0; i--) {
            stack.add(queue.remove());
        }
        for (int i = stack.size(); i > 0; i--) {
            queue.add(stack.pop());
        }

    }
}