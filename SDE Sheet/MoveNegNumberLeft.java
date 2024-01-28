import java.util.*;

public class MoveNegNumberLeft {
    public static void moveNumLeft(int arr[]) {

        // Arrays.sort(arr);

        int j = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && i != j) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    // print function
    public static void displayArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        moveNumLeft(arr);
        displayArr(arr);
    }
}
