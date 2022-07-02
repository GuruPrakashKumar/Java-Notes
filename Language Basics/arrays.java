/*
***** Types of Syntax of arrays *****

1. int[] marks;  ---> Declaration !
   marks = new int[5]  ---> Memory alocation !
2. int marks[] = new int[4]; ---> Declaration + Memory allocation
3. int marks[] = {98,56,87,80}; ---> Declaration + Memory allocation + initialisation
*/
import java.util.*;

public class arrays {
    public static void main(String[] args) {
        // int marks[] = new int[4];
        int marks[] = {98,56,87,80};
        
        // marks[0]=98; //physics
        // marks[1]=56; //maths
        // marks[2]=87; //english
        // marks[3]=80; //chemistry
        
        for (int i = 0; i <= 3; i++) {
            System.out.println("The marks of subject "+i+" is: "+marks[i]);
        }

        System.out.println("Now we will learn to take input from user for array");
        // Now we will learn to take input from user for array.

        System.out.println("How many values you want to store in the array ??");

        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]= new int[size];

        // input
        System.out.println("Now add your all the values one by one :");
        for (int i = 0; i < size; i++) {
            numbers[i]=sc.nextInt();
        }

        // output
        for (int i = 0; i < size; i++) {
            System.out.println("The value of "+i+" is : "+numbers[i]);
        }

        

    }
}

