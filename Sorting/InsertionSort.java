public class InsertionSort {
    // <------------printing array----------->

    public static void printing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // <--------------logic for InsertionSort---------->

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;

        }
    }

    public static void main(String[] args) {
        int[] array = new int[] { 5, 4, 1, 3, 2 };

        System.out.print("Before Sorting : ");
        printing(array);

        System.out.println();

        System.out.print("After Sorting : ");
        insertionSort(array);
        printing(array);
    }
}
