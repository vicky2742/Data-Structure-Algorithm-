import java.util.Scanner;

public class Palindrome {
    public static boolean palindromeString(String str) {
        int size = str.length();
        for (int i = 0; i < size / 2; i++) {
            if (str.charAt(i) == str.charAt(size - i - 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // String str = "noon";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        if (palindromeString(str) == true) {
            System.out.println("Palindrome");
        }

        else {
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
