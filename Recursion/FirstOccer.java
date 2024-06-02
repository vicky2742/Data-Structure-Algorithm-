public class FirstOccer {
    public static int firstOccur(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccur(arr, key, i + 1);

    }

    public static int lasrOccur(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        int isFound = lasrOccur(arr, key, i+1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;

    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(firstOccur(arr, 5, 0));
        System.out.println(lasrOccur(arr, 5, 0));
    }
}
