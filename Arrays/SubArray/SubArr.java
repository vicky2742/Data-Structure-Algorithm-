
public class SubArr {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int tp=0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int j2 = start; j2 <= end; j2++) {
                    System.out.print(arr[j2] + " ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub array : "+tp);
    }
}
