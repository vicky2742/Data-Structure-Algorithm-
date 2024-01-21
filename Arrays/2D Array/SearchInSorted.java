public class SearchInSorted {

    // public static boolean searchInSorted(int[][] matrix, int key) {
    // int row = 0;
    // int col = matrix.length - 1;

    // while (row < matrix.length && col >= 0) {
    // if (matrix[row][col] == key) {
    // System.out.println("Found at (" + row + "," + col + ")");
    // return true;
    // } else if (key < matrix[row][col]) {
    // col--;
    // } else {
    // row++;
    // }
    // }

    // System.out.println("Key not found");
    // return false;
    // }

    public static boolean searchInSorted(int[][] matrix, int key) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == key) {
                    // System.out.println("key found at index (row x col) => : (" + i + "," + j +
                    // ")");
                    count++;
                }
            }

        }
        System.out.println("Total no's of " + key + " comes " + count + " times !!");

        // System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 3, 4, 5, 6 },
                { 2, 1, 4, 3 },
                { 1, 2, 3, 4 }
        };
        int key = 1;
        // searchInSorted(matrix, key);
        searchInSorted(matrix, key);
    }
}
