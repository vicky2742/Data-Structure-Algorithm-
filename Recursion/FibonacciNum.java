public class FibonacciNum {
    public static int fibonacciNum(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        // int f1=fibonacciNum(n-1);
        // int f2=fibonacciNum(n-2);
        // int fb=f1+f2;
        int fb = fibonacciNum(n - 1) + fibonacciNum(n - 2);
        return fb;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(fibonacciNum(n));
    }
}
