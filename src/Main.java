public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
//        int peek = stack.peek();
//
//        System.out.println(peek);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(40);

        System.out.println(stack.isEmpty());
        System.out.println(stack);
    }
}