import java.util.Scanner;

class FlowChart {
    public static void main(String[] args) {

        // !ques_1 sum of two number

        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 & num2 :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 + num2);

        // * ques_2 Simple Interest

        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        int sI = (p * r * t) / 100;
        System.out.println(sI);

        // ? ques_3 max of 3 number

        System.out.print("enter a , b & c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
        System.out.println("a");
        }

        else if (b > a && b > c) {
        System.out.println("b");
        }

        else {
        System.out.println("c");
        }

        // TODO: ques3 prime number

        System.out.print("number :");
        // int n = sc.nextInt();

        // ! sum of n natural number

        int num = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < num; i++) {
            sum += i;

            sum++;
        }

        System.out.println(sum);

        sc.close();
    }
}