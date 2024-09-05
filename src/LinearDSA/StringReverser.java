package LinearDSA;

import java.util.Stack;

public class StringReverser {


    public void reverse(String input) {
        if (input == null)
            throw new IllegalArgumentException();

        StringBuilder reverseStr = new StringBuilder();

        Stack<Character> niceStack = new Stack<>();

        for (int i = input.length() - 1; i >= 0; i--) {
            niceStack.push(input.charAt(i));
            reverseStr.append(niceStack.pop());
        }
        System.out.println(reverseStr);
    }
}
