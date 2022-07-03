import java.time.Period;
import java.util.*;
import java.util.zip.CheckedInputStream;

class LL{
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void printList(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("[ ");
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + ", ");
            currNode = currNode.next;
        }
        System.out.print("null");
        System.out.print(" ]\n");
    }
    public void addFirst(int data){
        Node new_Node = new Node(data);
        if (head == null) {
            head = new_Node;
            return;
        }
        new_Node.next = head;
        head = new_Node;
    }
    public void addLast(int data){
        Node new_Node = new Node(data);
        if (head == null) {
            head = new_Node;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = new_Node;
    }
    public void addAtposition(int data, int pos){
        Node  new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node currNode = head;

        for (int i = 0; i < pos-1; i++) {
            currNode = currNode.next;
        }
        new_node.next = currNode.next;
        currNode.next = new_node;
    }
    public void deleteFirst(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("Now list is empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("Now list is empty");
            return;
        }
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
        
    }
    //to fix
    public void deleteAtpos(int pos){
        // if list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        // if list has only one element
        if (head.next == null) {
            head = null;
            System.out.println("Now list is empty");
            return;
        }
        if (pos == 0) {
            // if input of position is 0 then --
            deleteFirst();
        } else {
            Node currNode = head;
        for (int i = 0; i < pos-1; i++) {
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;
        }
        
    }
    public int searchIndex(int data){
        int index = 0;
        Node currNode = head;
        while (currNode.data != data) {
            currNode = currNode.next;
            index++;
        }
        return index;
    }

    // function to delete those elements which has value greater than 25
    public void deleteNodeWhichHasValueMoreThan(int data){
        Node currNode = head;
        while (currNode.next != null) {
            if (currNode.data > data) {
                int pos = searchIndex(currNode.data);
                deleteAtpos(pos);
            }
            currNode = currNode.next;
        }
    }
    public Node reverseListIterative(Node Node){
        // if list is empty or have only one value
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }


        Node prev_Node = head;
        Node curr_Node = head.next;

        while (curr_Node != null) {
            Node next_Node = curr_Node.next;
            // step 1
            curr_Node.next = prev_Node;

            // update the three nodes
            prev_Node = curr_Node;
            curr_Node = next_Node;
        }
        head.next = null;//-->since the list has been reversed.
        head = prev_Node;

        return head;
    }
    public void swaplist(){
        Node prev_Node = head;
        Node curr_Node = head.next;

        while (curr_Node != null) {
            if (head.next == null) {
                return;
            }

            if (curr_Node.next == null) {
                int temp = prev_Node.data;
                prev_Node.data = curr_Node.data;
                curr_Node.data = temp;
                curr_Node = curr_Node.next;
            }else if (curr_Node.next.next == null) {
                int temp = prev_Node.data;
                prev_Node.data = curr_Node.data;
                curr_Node.data = temp;
                //updation
                prev_Node = prev_Node.next.next;
                curr_Node = curr_Node.next.next;
            }else{
                int temp = prev_Node.data;
                prev_Node.data = curr_Node.data;
                curr_Node.data = temp;
                //updation
                prev_Node = prev_Node.next.next;
                curr_Node = curr_Node.next.next;
                
            }
        }
        
    }

    // method to delete duplicates from sorted linked list
    public void deleteDuplicatessorted(){
        Node currNode = head;
        while (currNode.next != null) {
            if (currNode.data == currNode.next.data) {
                currNode.next = currNode.next.next;
            }else{
                currNode = currNode.next;
            }
            
        }
    }

    public void deleteDuplicatesUnsorted(HashSet set){
        Node prev_Node = head;
        Node curr_Node = head.next;
        set.add(prev_Node.data);
        while (curr_Node.next != null) {
            if (set.contains(curr_Node.data)) {
                curr_Node = curr_Node.next;
                prev_Node.next = prev_Node.next.next;
            } else {
                set.add(curr_Node.data);
                prev_Node = curr_Node;
                curr_Node = curr_Node.next;
            }
        }
    }
    public void reverseList2(int left, int right){
        
        for (int i = 0; i < right - left; i++) {
            Node prev_Node = head;
            for (int j = 1; j < left; j++) {
                prev_Node = prev_Node.next;
            }
            for (int j = 0; j < right - left - i; j++) {
                int temp = prev_Node.data;
                prev_Node.data = prev_Node.next.data;
                prev_Node.next.data = temp;
                prev_Node = prev_Node.next;
            }

        }
    }
//     public Node deleteNthNodeFromEnd(Node head, int n) {
//         if (head.next == null) {
//             return null;
//         }

//      Node currNode = head;
        
//         int size = 0;
        
//         while (currNode != null) {
//             currNode = currNode.next;
//             size ++;

//         } 
//      if(n == size){
//          return head.next;
//      }
//      Node temp = head;
//         for (int i = 1; i < size - n; i++) {
    //             temp = temp.next;
    //         }
    //         temp.next = temp.next.next;
    //      return head;
    //  }
    
    public void deleteNthNodeFromEnd(int left) {
        Node currNode = head;
        Node temp = head;
        int size = 0;
           if (head.next == null) {
               return;
            }
            
            while (currNode != null) {
                currNode = currNode.next;
                size ++;
                
            } 
                 if(left == size){
                     head = head.next;
                 }
            for (int i = 1; i < size - left; i++) {
                temp = temp.next;
           }
           temp.next = temp.next.next;
    }
    public Node middleOfLinkedList(Node head){
        Node hare = head;
        Node turtle = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        // System.out.println(turtle.data);
        return turtle;
    }

    public Node reverseHalf(Node head){
        Node prevNode = null;
        Node currNode = head;

        while (currNode != null) {
            Node nextNode = currNode.next;

            currNode.next = prevNode;
            //updation
            prevNode = currNode;
            currNode = nextNode;
            
        }
        
        
        return prevNode;
        
    }
    
    public boolean checkPalindrome(Node head){
        if (head == null || head.next == null) {
            return true;
        }
        Node endOfFirstHalf = middleOfLinkedList(head);
        Node startOfSecondHalf = reverseHalf(endOfFirstHalf.next);

        Node firstHalfStart = head;
        while (startOfSecondHalf != null) {
            if (firstHalfStart.data != startOfSecondHalf.data) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            startOfSecondHalf = startOfSecondHalf.next;
        }
        return true;
        
        
    }

    public void intToLinkedList(int num){

        while (num != 0) {
            int temp = num%10;
            addFirst(temp);
            num = (num - temp)/10;

        }
    }
    public int linkedListToInt(Node head){
        Node curr = head;
        int ans = 0;
        
        while (curr != null) {
            ans += curr.data;
            if (curr.next != null) {
                ans *= 10;
            }
            curr = curr.next;
            
        }
        return ans;
    }
}




public class practice {
    public static void main(String[] args) {
        LL list = new LL();
        // list.addFirst(1);
        // list.addLast(2);
        // list.addLast(3);
        // list.addLast(2);
        // list.addLast(1);
        // list.addLast(2);
        // list.addLast(8);
        // list.addLast(9);
        // list.addLast(11);
        // list.addLast(20);
        // list.addLast(11);
        // list.addLast(20);
        // list.addLast(21);
        // list.addLast(11);
        
        // list.printList();
        // list.deleteAtpos(1);
        
        // list.deleteNodeWhichHasValueMoreThan(25);
        // list.printList();
        
        // list.reverseListIterative(list.head);
        // list.printList();
        
        // list.searchIndex(3);
        
        // list.deleteDuplicatessorted();

        // HashSet <Integer> set = new HashSet<>();
        // list.deleteDuplicatesUnsorted(set);

        // list.swaplist();

        // list.reverseList2(1,2);

        // list.deleteNthNodeFromEnd(2);

        // list.checkPalindrome(list.head);
        // list.middleOfLinkedList(list.head);
        // list.reverseHalf(list.head);
        // boolean h = list.checkPalindrome(list.head);
        
        list.intToLinkedList(66767);
        list.printList();
        System.out.println(list.linkedListToInt(list.middleOfLinkedList(list.head)));  
        
    }
}
