public class HollowRectangle {
    public static void main(String[] args) {
        // int n=4;
        int row = 4;
        int col = 4;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
