
public class BubbleSort {
    // * O(n^2)
    // ! <-------------In Desending Order-------------->
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ! <-------------In Ascending Order-------------->
    public static void bubbleSortAscending(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 4, 1, 3, 6, 77, 100 };
        bubbleSort(arr);
        System.out.print("In Decending Order :");
        display(arr);

        System.out.println();

        bubbleSortAscending(arr);
        System.out.print("In Ascending Order :");
        display(arr);

    }
}