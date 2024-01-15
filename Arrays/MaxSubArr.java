
public class MaxSubArr {

    public static void maxSubArray(int arr[]) {
        int tp = 0;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // ?FIRST LOOP
        for (int i = 0; i < arr.length; i++) {

            // * SECOND LOOP
            for (int j = i; j < arr.length; j++) {

                // !PRINT LOOP
                currSum = 0;

                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2] + " ");
                    currSum += arr[j2];
                }

                System.out.println("currSum : " + currSum);

                if (maxSum < currSum) {
                    maxSum = currSum;
                }

                tp++;
                System.out.println();
            }

            System.out.println();
        }

        System.out.println("Total max sum : " + maxSum);
        System.out.println("Total sub array : " + tp);
    }

    public static void main(String[] args) {
        // int array[] = { 2, 4, 6, 8, 10 };
        int array[] = { 1, -2, 6, -1, 3 };
        maxSubArray(array);
    }
}