import java.util.Stack;

public class questionOnStack {
    public static void pushAtBottom(int data,Stack<Integer> s){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int t = s.pop();
        pushAtBottom(data, s);
        s.push(t);
    }
    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // pushAtBottom(4,s);

        while (!s.isEmpty()) {
            System.out.println(s.peek()+" ");
            s.pop();
        }
        System.out.println("\nreversed string -- ");

        s.push(1);
        s.push(2);
        s.push(3);
        
        reverseStack(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek()+" ");
            s.pop();
        }

    }
}
