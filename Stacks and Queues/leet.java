import java.util.*;
public class leet {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']' ){
                if(s.charAt(i) == ')' && stack.peek()=='(' || s.charAt(i) == '}' && stack.peek()=='{' || s.charAt(i) == ']' && stack.peek()=='['){
                    stack.pop();
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        String s = "()[]{}";
        boolean flag = isValid(s);
        if(flag){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }
    }
}
