// Write a program to find if a number is a power of 2 or not.

import java.util.*;

public class determinePower {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        int count = 1;
        if (n==2) {
            System.out.println("this number is a power of 2");
        }
        while (n>2) {
            n = n/2;
            if (n%2==0) {
                count += 1;
                continue;
            }else if (n%2 != 0) {
                System.out.println("The value you entered cannot be state in the power of 2");
                break;
            }
        }
        if (count > 1){
            System.out.println("2^"+count);
        }
    
        
    }
}
