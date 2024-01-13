import java.util.Scanner;

public class LinearSearch {
    static Scanner sc = new Scanner(System.in);

    // ? input
    // public static void input(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = sc.nextInt();
    // }
    // }

    // !output
    // public static void displayOutput(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }

    // * Logic
    public static int linearSearch(int arr[], int n, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                // System.out.println("Key found at index :" + i);
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // System.out.print("Size of Array :");
        // int size = sc.nextInt();
        // int arr[] = new int[size];
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // input(arr);
        // displayOutput(arr);
        // System.out.println();
        System.out.print("key to found ? ");
        int key = sc.nextInt();
        int size1 = arr.length;

        // linearSearch(arr, size, key);
        int index = linearSearch(arr, size1, key);
        if (index == -1) {
            System.out.println("Key not present in array");
        }

        else {
            System.out.println("Key found at index :" + index);
            // System.out.println("Key not present in array");

        }
    }
}
