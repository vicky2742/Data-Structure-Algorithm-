import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the year :");

        int year = sc.nextInt();

        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println("Leap Year !");
        }

        // else if (year % 100 == 0) {
        // System.out.println("Not Leap Year !");
        // }

        // else if (year % 4 == 0) {
        // System.out.println(" Leap Year !");
        // }

        else {
            System.out.println("Not Leap Year !");

        }
        sc.close();
    }
}
