//hashmap is used to store two types of data types together
// key <-> value
// where key should be unique. value can be different
// import java.util.HashMap;
import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        //country(key),population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //***Insertion***
        map.put("India", 125);
        map.put("US", 30);
        map.put("china", 150);

        System.out.println(map); //---> HashMap is unordered list.

        map.put("china", 180);//--> it will update "china" key to 180
        System.out.println(map);

        //***Serach***
        //contains key returns true if key is present in the hashmap
        if (map.containsKey("china")) {
            System.out.println("key is present in the map");
        }else{
            System.out.println("key is not present in the map");
        }


        //get function
        //get function returns value of the key if key exists in the map otherwise null
        System.out.println(map.get("china")); //key exists
        System.out.println(map.get("Indonesia"));//key does not exist


        //***traversal***
        for (Map.Entry<String,Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //another method
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key+" "+map.get(key));
        }

        //***removal***
        map.remove("china");
        System.out.println(map);
    }    
}
