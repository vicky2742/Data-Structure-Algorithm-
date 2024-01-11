import java.util.Scanner;

public class EvenNumber {

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }

        else {
            return false;
        }
    }

    public static void rangeOfEven(int n) {
        System.out.print("even number comes in between " + n + " is : ");
        for (int i = 1; i <= n; i++) {
            if (isEven(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number :");
        int n = sc.nextInt();
        isEven(n);

        if (isEven(n) == true) {
            System.out.println(" You entered even number");
        }

        else {
            System.out.println("Not a even number");
        }

        rangeOfEven(n);
        sc.close();
    }
}
