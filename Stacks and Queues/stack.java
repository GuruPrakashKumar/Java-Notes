import java.util.ArrayList;

public class stack {

// ***************************************
// Stack using Linked list

    public static class StackUsingLinkedList{
        public static class Node{
            int data;
            Node next;
            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        public static Node head;
        private static boolean isEmpty() {
            return head == null;
        }
        public static void push(int data){
            // method to push element in the starting
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int  pop(){
            // this method pops up the element and returns the value

            int top = head.data;
            if (isEmpty()) {
                return -1;
            }
            head = head.next;
            return top;
        }
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

// ***********************************
// Stack using ArrayList
// Note - to use arraylist we have to import java.util.ArrayList package
public static class StackUsingArrayList{
    static ArrayList<Integer> list = new ArrayList<>();
    public static boolean isEmpty(){
        return list.size() == 0;
    }
    public static void push(int data){
        list.add(data);
    }
    public static int pop(){
        if (list.isEmpty()) {
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    public static int peek(){
        if (list.isEmpty()) {
            return -1;
        }
        int top = list.get(list.size()-1);
        return top;
    }
}
    
    
    public static void main(String[] args) {
        // StackUsingLinkedList s = new StackUsingLinkedList();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);

        // while (!s.isEmpty()) {
        //     int i = s.peek();
        //     System.out.println(i);
        //     s.pop();
        // }
        StackUsingArrayList s = new StackUsingArrayList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
