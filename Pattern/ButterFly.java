public class ButterFly {
    public static void main(String[] args) {
        int n = 4;

        // * 1 half

        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        // ! 2 half

        for (int i = n; i >= 1; i--) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
