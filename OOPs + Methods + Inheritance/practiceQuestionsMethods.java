import java.util.*;

public class practiceQuestionsMethods {
    static void multiplicationTable(int n){
        for (int i = 1; i <=10; i++) {
            System.out.format("%d X %d = %d\n", n,i,n*i);
        }
    }
    public static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static int sumOfNatural(int n){
        // Base Condition
        if (n==1) {
            return 1;
        }
        return n + sumOfNatural(n-1);
        // Working -->
        // sum(3) = 3 + sum(2)
        // sum(3) = 3 + 2 + sum(1)
        // sum(3) = 3 + 2 + 1
    }
    public static void pattern2(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static int fibonacci(int n){
        if(n == 1){
            return 0;
        }else if (n==2) {
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static float average(int ...arr){
        float result = 0;
        for (int element : arr) {
            result += element;
        }
        result = result/arr.length;
        return result;
    }
    public static void pattern1_rec(int n){
        if (n>0) {
            pattern1_rec(n-1);
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        // Q. 1) Write a java method to print multiplication table of a number n.
        // multiplicationTable(7);

        // Q. 2) Write a program using functions to print the following pattern :
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // pattern1(4);

        // Q. 3) Write a recursive function to calculate sum of first n natural numbers.
        // System.out.println(sumOfNatural(4));

        // Q. 4) Write a function to print the following pattern
        // * * * *
        // * * *
        // * *
        // *
        // pattern2(4);
        
        // Q. 5) Write a program to print nth term of fibonacci series.
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …
        // System.out.print(fibonacci(10));

        // Q. 6) Write a program to find average of set of numbers passed as arguments.
        // System.out.println(average(9,10,6,5));

        // Q. 7) Solve question no. 2 by recursive method
        pattern1_rec(4);
        
    }    
}
