public class ArmstrongNum {
    public static void main(String[] args) {
        int number = 371; // Change this to any positive integer you want to check
        int originalNumber = number;
        int remainder;
        int result = 0;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3); // 3 is the number of digits
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
