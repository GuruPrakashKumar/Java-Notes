import java.util.*;
public class squareRoot {
    public static int sqroot(int n){//Naive approach
        int res = 1; 
        while(res*res <= n){
            res++;
        }

        return res-1;
    }
    public static int sqrootRec(int n){//recursive approach O(logN) { base 2 }
        int lo = 1;
        int hi = n;
        int res = 1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(mid * mid > n){
                hi = mid-1;
            }else if(mid * mid < n){
                res = mid;
                lo = mid+1;
            }else{
                return mid;
            }
        }
        return res;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(sqroot(n));
        System.out.println(sqrootRec(n));
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("I");
        arr.add("am");
        arr.add("Guru Prakash");
        // for(int i= 0; i < arr.size(); i++){
        //     System.out.println(arr.get(i)+" ");
        // }
        for(String s : arr){
            System.out.print(s+" ");
        }
    }
}
