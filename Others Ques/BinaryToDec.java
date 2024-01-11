public class BinaryToDec {

    // ! Binary to Decimal

    public static void binToDec(int n) {
        int originalNumber = n;
        int pow = 0, dec = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            n = n / 10;
            pow++;
        }
        System.out.println("Binary to Decimal of " + originalNumber + " is : " + dec);

    }

    // ! Decimal to Binary

    public static void decToBin(int n) {
        int originalNumber = n;
        int pow = 0, binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            n = n / 2;
            pow++;
        }
        System.out.println("Decimal to Binary of " + originalNumber + " is : " + binNum);

    }

    public static void main(String[] args) {
        // binToDec(101);
        decToBin(7);
    }
}
