import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {

        // int[] arr = { 1, 2, 3, 4, 5 };// valid
        // int arr1[] = { 1, 2, 3, 4, 5 };// valid
        int arr2[] = new int[2];// valid
        arr2[0] = 90;
        arr2[1] = 90;
        // dynamically
        int arr3[] = new int[5];
        int arr4[] = new int[] { 1, 2, 3, 4, 5 };
        // int arr5[];
        // arr5 = new int[5];
        System.out.println(arr4[2]);// access single elements

        // * taking input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = sc.nextInt();
        }
        sc.close();
        // ! print output

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");// access all elements
        }

        System.out.println();

        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");// access all elements
        }
    }
}
