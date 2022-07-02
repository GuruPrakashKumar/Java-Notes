// this code is to be completed.

import java.util.*;

public class arrays2D {
    public static void main(String[] args) {
        /*
        int mat1[][] = {{1, 2, 3},
                        {4, 5, 6}};
        */
        // Taking input in 2D arrays.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int columns = sc.nextInt();
        
        int matrix[][]=new int[rows][columns];
        System.out.println("Now enter the values one by one");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        // Taking output in 2D arrays.
        System.out.println("Your matrix is : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }   
}
