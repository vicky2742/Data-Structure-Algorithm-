
public class SelectionSort {

    // <------------printing array----------->

    public static void printing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // <---------------Logic of Selection Sort------------>
    public static void selctionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int currentElement = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[currentElement] > arr[j])
                    currentElement = j;
            }

            // swap

            int temp = arr[currentElement];
            arr[currentElement] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] { 5, 4, 1, 3, 2 };

        System.out.print("Before Sorting : ");
        printing(array);

        System.out.println();

        System.out.print("After Sorting : ");
        selctionSort(array);
        printing(array);
    }
}
