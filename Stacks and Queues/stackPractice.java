import java.util.*;

public class stackPractice {
    //Question 1 = Push at bottom of stack
    public static void pushAtBottom(int data,Stack<Integer> s){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int element = s.peek();
        s.pop();
        pushAtBottom(data, s);
        s.push(element);
    }
    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        pushAtBottom(4, s);
        //print
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    } 
}
