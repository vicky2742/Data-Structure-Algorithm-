public class BinarySearch {
    public static int binarySearch(int arr[], int n, int key) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            else if (arr[mid] < key) {// ? right side
                start = mid + 1;
            }

            // else if (arr[start] < mid) {//! left side
            // end = mid - 1;
            // }

            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
        int size = arr.length;
        int index = binarySearch(arr, size, 1);

        if (index == -1) {
            System.out.println("Not Found");
        }

        else {
            System.out.println("Found at index : " + index);
        }
    }
}
