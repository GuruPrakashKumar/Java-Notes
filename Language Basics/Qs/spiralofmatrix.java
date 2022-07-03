import java.util.*;

public class spiralofmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of rows :");
        int n = sc.nextInt(); //--->for rows
        System.out.println("enter the value of columns :");
        int m = sc.nextInt(); //--->for columns
        
        int matrix[][] = new int[n][m];
        
        System.out.println("Now enter the values one by one :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The spiral order of Matrix is : ");

        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = n-1;

        // To print spiral oder of the matrix

        
    }
}
