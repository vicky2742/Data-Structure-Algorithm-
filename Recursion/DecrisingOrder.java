public class DecrisingOrder {
    public static void decrisingOrder(int n) {
        if (n == 1) {
            System.out.print(n +" ");
            return;
        }

        System.out.print(n+" ");
        decrisingOrder(n - 1);
    }

    public static void increasingOrder(int n) {
        if (n == 1) {
            System.out.print(n +" ");
            return;
        }

        increasingOrder(n - 1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int n = 10;
        decrisingOrder(n);
        System.out.println();
        increasingOrder(n);
    }
}