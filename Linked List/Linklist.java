public class Linklist {
    Node head;
    private int size;
    Linklist(){
        this.size = 0;
    }

    class Node{
        int data;
        Node next;

        //Constructor
        public Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }

    }

    //printList
    public void printList(){
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Linklist ll = new Linklist();
        Node n1 = new Node(1);
    }
}
