import java.util.Scanner;

public class Basic2DArr {

    public static void matrixInput(int matrix[][]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void matrixOuput(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Matrix : ");
        matrixOuput(matrix);

        matrixInput(matrix);
        matrixOuput(matrix);

    }
}