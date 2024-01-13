import java.util.Scanner;

public class HalfInvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {//n-i+1
                System.out.print("*" + " ");
            }
            System.out.println();

        }
        sc.close();
    }
}
