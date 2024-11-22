package javaz;

import java.util.Stack;

public class IsBalancedBrackets {

    public static void main(String[] args) {
         String s ="{{[[(())]]}}";
        System.out.println(isBalanced(s));
    }

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()){
                    return "NO";
                } else {
                    char pop_value = stack.pop();
                    if(s.charAt(i) == ')' &&  pop_value!='('){
                        return "NO";
                    } else if (s.charAt(i) == '}' && pop_value!='{') {
                        return "NO";
                    }else if (s.charAt(i) == ']' &&  pop_value!='[') {
                        return "NO";
                    }
                }
            }
        }

        if(stack.isEmpty()){
            return "YES";
        }else {
            return "NO";
        }

    }
}
