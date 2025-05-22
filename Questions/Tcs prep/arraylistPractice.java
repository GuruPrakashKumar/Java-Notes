import java.util.*;
public class arraylistPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        for (int e : arr) {
            System.out.print(e+" ");
        }
        Stack<Integer> s = new Stack<>();
        //s.push()  s.pop()  s.peek()
        Queue<String> queue = new LinkedList<>();
        queue.add("apple");
        System.out.println("Queue: " + queue);

        String front = queue.remove();
        System.out.println("Removed element: " + front);
        // peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);
    }
}
