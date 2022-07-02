import java.util.*;

public class linkedListByCollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        
        list.add("list");
        System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" -> ");
            
        }
        System.out.println("null");
        
        // to delete
        list.removeFirst();
        System.out.println(list);
        
        list.remove(1);
        System.out.println(list);
    }

}
