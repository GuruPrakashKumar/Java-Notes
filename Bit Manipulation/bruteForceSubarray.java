import java.util.*;
public class bruteForceSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String input = sc.nextLine();
        String []arr = input.split(" ");
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        for (int i = 0; i < list.size()-1; i++) {
            int sum = 0;
            for (int j = i; j < list.size(); j++) {
                System.out.print(list.get(j)+" ");

                sum+=list.get(j);
            }
            System.out.println("=> "+ sum);
        }
        

    }
}
