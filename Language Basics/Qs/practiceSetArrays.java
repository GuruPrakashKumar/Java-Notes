import java.util.*;

public class practiceSetArrays {
    public static void main(String[] args) {
        // Q.1) Create an array of 5 floats and calculate their sum.
        
        Scanner sc = new Scanner(System.in);
        // System.out.println("How many values you want to input ?");
        // int size = sc.nextInt();
        // float arr1[] = new float[size];
        // System.out.print("Now Enter your values : ");
        // for (int i = 0; i < size; i++) {
        //     arr1[i] = sc.nextFloat();
        // }
        // float sum = 0;
        // for (int i = 0; i < size; i++) {
        //     sum += arr1[i];
        // }
        // System.out.println("Answer = "+sum);

        // Q.2) Write a program to find out whether a given integer is present in an array or not.
        
        // int arr2[] = {98,22,34,46,72,10,123,33,66};
        // System.out.print("Enter your search element : ");
        // int searchingElement = sc.nextInt();
        // boolean flag = false;
        // for (int i = 0; i < arr2.length; i++) {
        //     if (arr2[i]==searchingElement) {
        //         System.out.println("Your input value is present in the array");
        //         flag = false;
        //         break;
        //     } else {
        //         flag = true;
        //         continue;
        //     }
        // }
        // if (flag) {
        //     System.out.println("Your input value is not present in the array");

        // }

        // Q.3) Calculate the average marks from an array containing marks of all students in physics using for each loop.
        
        // int arr3[] = {77,22,34,46,72,10,23,33,66};
        // float sum = 0;
        // for (int element : arr3) {
        //     sum += element;
        // }
        // float average = sum/arr3.length;
        // System.out.print("Average : "+ average);

        // Q.4) Create a java program to add two matrices of size 2*3 
        int mat1[][] = {{1, 2, 3},
                        {4, 5, 6}};
        int mat2[][] = {{4, 8, 9},
                        {2, 4, 1}};
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j]+mat2[i][j]+" ");
            }
            System.out.println();
        }

        // 15:00

        // Q.5) Write a program to reverse an array.

        // System.out.println("How many values do you want to enter ?");
        // int size = sc.nextInt();
        // int arr5[] = new int[size];
        // System.out.println("Now Enter your values : ");
        // for (int i = 0; i < size; i++) {
        //     arr5[i] = sc.nextInt();
        // }
        // System.out.print("Array : ");
        // for (int i : arr5) {
        //     System.out.print(i+" "); 
        // }
        // System.out.println();
        
        // for (int i = 0; i < arr5.length/2; i++) {
        //     int firstElement = arr5[i];
        //     arr5[i]=arr5[arr5.length-i-1];
        //     arr5[arr5.length-i-1]=firstElement;
        // }
        // System.out.print("Reversed array : ");
        // for (int i : arr5) {
        //     System.out.print(i+" "); 
        // }

        // Q.6) Write a program to find the maximum element in an array.

        // System.out.println("How many values do you want to enter ?");
        // int size = sc.nextInt();
        // int arr6[] = new int[size];
        // System.out.println("Now enter your values : ");
        // for (int i = 0; i < size; i++) {
        //     arr6[i] = sc.nextInt();
        // }
        // System.out.print("Array : ");
        // for (int i : arr6) {
        //     System.out.print(i+" ");
        // }
        // int max = 0; //---> I can also use Integer.MIN_VALUE
        // for (int element : arr6) {
        //     if (element>max) {
        //         max = element;
        //     }
        // }
        // System.out.println("\nMaximum = "+ max);

        // Q.7) Write a program to find the maximum element in an array.
        
        // Note:- Integer.MIN_VALUE and Integer.MAX_VALUE gives us the minimum and maximum numbers respectively.
        // System.out.println("How many values do you want to enter ?");
        // int size = sc.nextInt();
        // int arr7[] = new int[size];
        // System.out.println("Now enter your values : ");
        // for (int i = 0; i < size; i++) {
        //     arr7[i] = sc.nextInt();
        // }
        // System.out.print("Array : ");
        // for (int i : arr7) {
        //     System.out.print(i+" ");
        // }
        // int min = Integer.MAX_VALUE;
        // for (int element : arr7) {
        //     if (element<min) {
        //         min = element;
        //     }
        // }
        // System.out.println("\nMinimum = "+min);
    } 
}