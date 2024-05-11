import java.math.*;

class QuadEq {

    static void quadraticEq(double a, double b, double c) {
        double d, r1, r2;
        // roots value
        d = (b * b) - 4 * a * c;

        // !case-1 when d==0
        if (d == 0) {
            r1 = r2 = (-b) / 2 * a;
            System.out.println("roots are real and equal :");
            System.out.println("r1 ," + r1);
            System.out.print("r2 : " + r2);
        }
        // case-2 when d>0

        else if (d > 0) {
            r1 = (-b + Math.sqrt(d)) / 2 * a;
            r2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("roots are real and different :");
            System.out.println("r1 : " + r1);
            System.out.print("r2 : " + r2);
        }

        else {
            double real = -b / (2 * a);

            double imaginary = Math.sqrt(-d) / (2 * a);
            System.out.println("roots are complex and different :");
            System.out.println("r1 : " + real + "+" +imaginary + "i");
            System.out.println("r2 : " + real + "-" + imaginary + "i");
            
        }

    }

    public static void main(String[] args) {
        quadraticEq(7.2, 5, 9);
    }
}