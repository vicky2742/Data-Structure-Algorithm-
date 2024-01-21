public class Spiral {

    public static void spiralMatrix(int[][] matrix, int n) {
        int startRow = 0;
        int endRow = n - 1;

        int startCol = 0;
        int endCol = n - 1;

        // Top

        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }
            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // Bottom
            for (int i = endCol - 1; i >= startCol; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][i] + " ");
            }
            // Left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 3, 4, 5, 6 },
                { 2, 1, 4, 3 },
                { 1, 2, 3, 4 }
        };

        int size = matrix.length;
        System.out.print("spiral Matrix : ");
        spiralMatrix(matrix, size);


    }
}