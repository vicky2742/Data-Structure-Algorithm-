public class SumofN {
    public static int sumofN(int n){
        if (n==1) {
            return 1;
        }

        int sN=n+sumofN(n-1);
        return sN;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumofN(n));
    }
}
