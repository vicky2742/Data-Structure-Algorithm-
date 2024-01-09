public class Binomial {

    // !factorial function
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // *Binomial function

    public static int binomialCoeff(int n, int r) {
        int n_factorial = fact(n);
        int r_factorial = fact(r);
        int nmr_factorial = fact(n - r);

        int binCoeff = n_factorial / (r_factorial * nmr_factorial);
        return binCoeff;
    }

    public static void main(String[] args) {
        System.out.println(binomialCoeff(5, 2));

    }
}
