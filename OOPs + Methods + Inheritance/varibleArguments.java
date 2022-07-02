import java.util.*;

public class varibleArguments {
    public static int sum(int ...arr){
        // Available as int[] arr
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,2,3,46,6));
    }
}
