public class ReverseArr {

    public static int reverseArray(int arr[]) {
        int start = 0, end = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 ,6,7,8,9,10};
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
