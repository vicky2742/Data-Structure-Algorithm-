public class XpowN {
    public static double powerOfN(int x, int n) {
        if (n == 0) {
            return 1;
        }

        double fun = x*powerOfN(x, n - 1);
        return fun;

        // double fun = x * Math.pow(x, n - 1);
        // return fun;
    }

    public static void main(String[] args) {
        System.out.println(powerOfN(2, 10));
    }
}
