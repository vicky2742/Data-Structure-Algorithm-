// import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static boolean searching(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row & Col :");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("matrix size is " + row + "x" + col);
        int[][] matrix = new int[row][col];

        System.out.println("Enter the Matrix Data :");

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix Data Printing.......");
        // output
        searching(matrix, 3);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Arrays.equals(a,b);
        searching(matrix, 3);

    }
}
