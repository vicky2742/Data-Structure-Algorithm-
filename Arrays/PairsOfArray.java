public class PairsOfArray {
    static void displayArr(int arr[]) {
        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        displayArr(arr);
        int totalPair = 0;
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + currentElement + "," + arr[j] + ")");
                totalPair++;
            }
            System.out.println();
        }

        System.out.println("Total Pairs : " + totalPair);

    }
}
