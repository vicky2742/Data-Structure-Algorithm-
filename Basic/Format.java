import java.text.DecimalFormat;;

public class Format {
    public static void main(String[] args) {
        double d = 1232.22222;
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.println(df.format(d));

    }
}
