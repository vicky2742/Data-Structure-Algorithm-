

public class PrefixSubArr {
    public static void prefixSubArray(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < prefix.length; i++) {
            for (int j = 0; j < prefix.length; j++) {
                currSum = 0;

                if (i == 0) {
                    currSum = prefix[j];
                }

                else {
                    currSum = prefix[j] - prefix[i - 1];
                }

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        prefixSubArray(arr);
    }
}
