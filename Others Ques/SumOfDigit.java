public class SumOfDigit {
    // public static int sumofDigit(int n) {
    // int sum = 0;
    // while (n > 0) {
    // int lastDigit = n % 10;
    // sum = sum + lastDigit;
    // n = n / 10;
    // }
    // return sum;
    // }

    public static int sumDigits(int n) {
        int sumOfDigits = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n /= 10;
        }
        return sumOfDigits;
    }

    public static void main(String[] args) {
        // System.out.println(sumofDigit(10));
        System.out.println(sumDigits(5));
    }
}
