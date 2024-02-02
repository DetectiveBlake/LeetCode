import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {

        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {

            if(x=='('){
                stack.push(')');
            } else if (x=='{') {
                stack.push('}');
            } else if (x=='[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!=x) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(]";
        System.out.println(isValid(s));
    }
}
