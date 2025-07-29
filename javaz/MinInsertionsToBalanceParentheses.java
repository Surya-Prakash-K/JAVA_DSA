package javaz;

import java.util.Map;
import java.util.Stack;

public class MinInsertionsToBalanceParentheses {
    public static void main(String[] args) {
        System.out.println(minInsertions("(()))"));
    }


    public static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    count++;
                }

                if (stack.isEmpty()) {
                    count++;
                } else {
                    stack.pop();
                }
            }
        }
        return count + (2 * stack.size());
    }


}
