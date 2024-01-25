
public class ConcatinationOfArr {
    public static int[] conCatArr(int arr[]) {
        int ans[] = new int[2 * arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
            ans[i + arr.length] = arr[i];
        }

        return ans;
    }

    public static void printOutput(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        conCatArr(arr);
        printOutput(arr);

    }
}
