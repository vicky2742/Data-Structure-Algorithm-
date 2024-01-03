// package Others Ques;

import java.util.Scanner;

public class ReverseNumber {
    public static void Reverse(int num) {
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num /= 10;
        }
        System.out.println("After Reverse : " + reverse);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("Before Reverse : " + number);
        System.out.println();
        // while (number > 0) {
        // int lastDigit = number % 10;
        // System.out.print(lastDigit);
        // number = number / 10;
        // }
        Reverse(number);
        sc.close();
    }
}
