// package Arrays;

import java.util.Arrays;

public class LargestValue {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 4, 6, 5 };

        // !------ 1 method----------

        int largestVal = Integer.MIN_VALUE;// * -infinite
        int smallestVal = Integer.MAX_VALUE;// * +infinite
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largestVal) {
                largestVal = arr[i];
            }

            if (arr[i] < smallestVal) {
                smallestVal = arr[i];
            }
        }
        System.out.println(smallestVal);
        System.out.println(largestVal);

        // !------ 2 method----------
        // Arrays.sort(arr);

        // System.out.println("smallest value : " + arr[0]);
        // System.out.println("largest value : " + arr[arr.length - 1]);
    }
}
