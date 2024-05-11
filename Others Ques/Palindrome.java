
public class Palindrome {
    static boolean palindrome(int num) {
        
        int reverse = 0, original, digit;
        original = num;

        while (num != 0) {
            digit = num % 10;
            reverse = (reverse * 10) + digit;
            num /= 10;
        }

        return (reverse == original);
    }

    public static void main(String[] args) {
        int n = 16461;

        if (palindrome(n) == true) {
            System.out.println("its palindrome number");
        }

        else {
            System.out.println("not palindrome number");
        }
    }
}
