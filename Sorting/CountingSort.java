public class CountingSort {
    // <------------printing array----------->

    public static void printing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // <---------logic of CountingSort-------->
    public static void countingSort(int[] arr) {
        int largestElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largestElement = Math.max(largestElement, arr[i]);
        }
            int count[] = new int[largestElement + 1];
            for (int j = 0; j < arr.length; j++) {
                count[arr[j]]++;
            }

            int k = 0;
            for (int j = 0; j < count.length; j++) {
                while (count[j] > 0) {
                    arr[k] = j;
                    k++;
                    count[j]--;
                }
            }

        }
    

    public static void main(String[] args) {
        int[] array = new int[] { 5, 4, 1, 3, 2 };

        System.out.print("Before Sorting : ");
        printing(array);

        System.out.println();

        System.out.print("After Sorting : ");
        countingSort(array);
        printing(array);
    }
}

