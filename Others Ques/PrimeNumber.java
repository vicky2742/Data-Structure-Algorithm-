import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int n) {

        if (n == 2) {
            return true;
        }

        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the Number :");
        int num = sc.nextInt();

        // boolean isPrime = true;
        // if (num == 2) {
        // System.out.println("Prime");
        // }

        // else {

        // for (int i = 2; i < Math.sqrt(num); i++) {// we can also use num-1 instead
        // sqrt(num)
        // if (num % i == 0) {
        // isPrime = false;
        // }
        // }

        // if (isPrime == true) {
        // System.out.println("Prime Number");
        // }

        // else {
        // System.out.println("Not Prime");
        // }
        // }

        // System.out.println(isPrime(num));
        // System.out.println(isPrime(num));
        primeInRange(num);

        sc.close();

    }
}
