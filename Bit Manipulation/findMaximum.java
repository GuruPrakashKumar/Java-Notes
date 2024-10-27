import java.util.*;
public class findMaximum {
    public static void main(String[] args) {
        //we have to find max1, max2, max3
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String arr[] = input.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
    
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));        
        }

        int max1=Integer.MIN_VALUE; 
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max1 = Math.max(max1, list.get(i));
        }

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>max2 && list.get(i)!= max1){
                max2 = list.get(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>max3 && (list.get(i)!= max2 && list.get(i)!=max1)){
                max3 = list.get(i);
            }
        }

        System.out.println(max1 + " "+ max2 + " "+ max3);

    }
}
