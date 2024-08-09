import java.util.Stack;

public class Expression {
    private boolean aBoolean;
    private Stack<Character> characterStack = new Stack<>();

    public boolean expressionChecker(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(' || expression.charAt(i) == '<' || expression.charAt(i) == '[') {
                characterStack.push(expression.charAt(i));
            }
            if (expression.charAt(i) == ')' || expression.charAt(i) == '>' || expression.charAt(i) == ']') {
                if (characterStack.isEmpty())
                    return false;
                characterStack.pop();
            }
        }
        return characterStack.empty();
    }
}


