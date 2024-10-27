import java.util.*;
public class spiralMatrix {

    static void spiralMatrix(int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        System.out.println("end row = "+endRow+" end col = "+endCol);

        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {//top part
                System.out.print(matrix[startRow][j]+" ");
            }
            for (int i = startRow+1; i <= endRow ; i++) {//right part
                System.out.print(matrix[i][endCol]+" ");
            }
            for (int j = endCol-1; j >= startCol; j--) {//bottom part
                if (startRow==endRow) {//for odd boundaries in some cases it will print one cell two times
                    return;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            for (int i = endRow-1; i >= startRow+1; i--) {
                if (startCol==endCol) {
                    return;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        spiralMatrix(matrix);

       

    }
}
