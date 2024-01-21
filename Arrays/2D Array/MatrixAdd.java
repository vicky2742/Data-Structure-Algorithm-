public class MatrixAdd {

    // <-----------Adding Logic------------->

    public static int[][] AddMatrix(int[][] a, int[][] b, int size) {
        int[][] c = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    // <-----------Printing Method------------->

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    // <-----------Main Method------------->

    public static void main(String[] args) {
        int size = 3;
        // matrix A
        int[][] a = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("matrix A : ");
        printMatrix(a);
        // matrix B
        int[][] b = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("matrix B : ");
        printMatrix(b);

        System.out.println("Added Matrix C : ");
        int C[][] = AddMatrix(a, b, size);
        printMatrix(C);

    }
}