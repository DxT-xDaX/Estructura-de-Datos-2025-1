package unam.mx.pilas;
import java.util.Stack;

public class Llaves {
    public boolean checarBalanceo(String texto) {
        Stack<Character> stack = new Stack<>();  

        for (int i = 0; i < texto.length(); i++) {
            char currentChar = texto.charAt(i);
            if (currentChar == '{' || currentChar == '(') {
                stack.push(currentChar);
            }
            else if (currentChar == '}' || currentChar == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if ((currentChar == '}' && topChar != '{') || (currentChar == ')' && topChar != '(')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
