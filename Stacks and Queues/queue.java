// Operations on Queues

// 1) Enque  (Add)
// 2) Dequeue (Remove)
// 3) Front (Peek)

public class queue {
    // *****************Queue using array**********************
// Time complexity --
// add - O(1)
// peek - O(n)
// remove - O(n)

    public static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int size){
            this.size = size;
            arr = new int[size];
        }

        public static boolean isEmpty(){
            return rear == -1;
        }
        //Enqueue
        public static void add(int data){
            if (rear == size-1) {
                System.out.println("Queue full");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        // Dequeue
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        //peek
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }
            return arr[0];
        }
    }
    // **********Circular Queue using Array*********
// Time complexity --
// add - O(1)
// peek - O(1)
// remove - O(1)
// so we should always make circular queue while using arrays
    static class CircularQueue{
        static int arr[];
        static int size;
        static int front = -1;
        static int rear = -1;

        CircularQueue(int size){
            this.size = size;
            arr = new int[size];
        }

        public static boolean isEmpty(){
            return front == -1 && rear == -1;
        }
        public static boolean isFull(){
            return front == (rear + 1)%size;
        }


        public static void add(int data){
            if (isFull()) {
                System.out.println("Queue full");
                return;
            }

            // 1st element add condition
            if (front == -1) {
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data; 
        }
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue full");
                return -1;
            }
            return arr[front];
        }
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Queue empty");
                return -1;
            }
            int top = arr[front];
            if (front == rear) {
                front = rear = -1;
            }else{
                front = (front+1)%size;
            }
            
            return top;
        }
    }

// ************Queue using Linked list***********
// Time complexity --
// add - O(1)
// peek - O(1)
// remove - O(1)


// public class Node{
//     int data;
//     Node next;

//     Node(int data){
//         this.data = data;
//         next = null;
//     }
// }
// static class QueueUsingLinkedList {
//     static Node head = null;
//     static Node tail = null;
    
//     public static boolean isEmpty(){
//         return head == null && tail == null;
//     }
//     public static void add(int data){
//         Node newNode = new Node(data);
//         if (isEmpty()) {
//             tail = head = newNode;
//         }else{
//             tail.next = newNode;
//             tail = newNode;
//         }
//     }
// }
    

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        CircularQueue cq = new CircularQueue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);

        cq.add(4);
        cq.add(5);
        System.out.println(cq.remove());
        cq.add(6);
        System.out.println(cq.remove());
        cq.add(7);

        while (!cq.isEmpty()) {
            System.out.println(cq.peek());
            cq.remove();
        }
    }
}
