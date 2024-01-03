import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // square pattern
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        // for (int i = 0; i < num; i++) {
        // for (int j = 0; j < num; j++) {
        // System.out.print("*" + " ");

        // }
        // System.out.println();
        // }

        do {
            System.out.print("enter the number: ");
            int num = sc.nextInt();

            if (num % 10 == 0) {
                System.out.println("You entered the Multiplie of 10");
                break;
            }

        } while (true);
    }
}
