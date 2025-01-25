// A function in java can call itself such calling of function by itself is called recursion.

import java.util.*;

public class recursion {
    public static int factorial(int n){
        if (n==0||n==1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello this is factorial class");
        System.out.print("Enter your value : ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
