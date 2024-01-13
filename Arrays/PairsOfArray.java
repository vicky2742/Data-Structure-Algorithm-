public class PairsOfArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int totalPair = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + currentElement + "," + arr[j] + ")");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : "+totalPair);

    }
}
