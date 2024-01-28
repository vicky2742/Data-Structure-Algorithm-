public class Reversearr {
    // !Logic
    public static void reverseArr(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }

        // int newArr[]=new int[arr.length];

        // for (int i = 0; i < arr.length; i++) {
        // newArr[i]=arr[arr.length-i-1]
        // }

    }

    // print function
    public static void displayArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.print("before reverse :");
        displayArr(arr);
        reverseArr(arr);
        System.out.print("after reverse :");
        displayArr(arr);

    }
}
