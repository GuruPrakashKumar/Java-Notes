public class LL {
    Node head;
    private int size;
    LL(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        //Constructor
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }

    }

    //add - first, last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        
        currNode.next = newNode;
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
    public void deleteFirst(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteLast(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        // corner case -- when there will be only one single node in the list
        if (head.next == null) {
            head = null;
            return;
        }
        
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        // At this stage currNode will be the secondLast node of the list
        currNode.next = null;

    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("list");
        list.printList();
        
        list.deleteLast();
        list.deleteFirst();
        list.printList();

        System.out.println(list.getSize());


    }
    
}