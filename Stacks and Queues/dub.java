import java.util.*;
public class dub {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }   
        // StringBuilder sb = new StringBuilder();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if(){
                res = s.charAt(i)+res;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
