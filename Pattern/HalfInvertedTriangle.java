import java.util.Scanner;

public class HalfInvertedTriangle {

    public static void Half_invertedTriangle(int n) {
        char ch='A';
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {// n-i+1
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println("inverted Traingle with Characters:");
        Half_invertedTriangle(4);
        sc.close();
    }
}
