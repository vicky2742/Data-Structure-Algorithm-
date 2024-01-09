
public class Function {
    // public static int fact(int n) {
    // int f = 1;
    // for (int i = 1; i <= n; i++) {
    // f = f * i;
    // }
    // return f;
    // }
    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public static float add(float n1, float n2) {
        int sum = (int) (n1 + n2);
        return sum;
    }

    public static void main(String[] args) {
        // int n = 5;
        // int f = fact(n);
        // System.out.println(f);
        // System.out.println(fact(n));

        System.out.println(add(1, 2));

        System.out.println(add(1, 2, 3));
        
        System.out.println(add(1.2f, 2.5f));
    }
}