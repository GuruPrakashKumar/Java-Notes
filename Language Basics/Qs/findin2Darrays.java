import java.util.*;

public class findin2Darrays {
    public static void main(String[] args) {
        System.out.println("Lets make a matrix");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int columns = sc.nextInt();
        int matrix[][] = new int[rows][columns];

        System.out.println("Now enter the values one by one");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("your matrix is : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("Enter a number which you want to search in the matrix : ");
        int x = sc.nextInt();
        boolean flag = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(matrix[i][j]==x){
                    System.out.println("This number is found in index at("+i+","+j+")");
                    flag=false;
                }

            }
        }
        if (flag) {
            System.out.println("Number not found.");
            
        }

    }
}
