import java.util.*;

public class transposeofmatrix {
    public static void main(String[] args) {
        System.out.println("Lets make a matrix ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int columns = sc.nextInt();
        int matrix[][] = new int[rows][columns];
        
        // input
        System.out.println("Now enter the values one by one :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The transpose is : ");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
        

    }
}
