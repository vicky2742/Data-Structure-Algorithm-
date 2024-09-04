import java.util.ArrayList;
// import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Scanner sc = new Scanner(System.in);
        // add element
        list.add(1);
        list.add(2);
        list.add(3);
        // print element
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        list.add(4);
        System.out.println(list.get(3));




        // ! using loops

        // input
        // for (int i = 0; i < 3; i++) {
        //     list.add(sc.nextInt());
        // }

        // output

        // for (int i = 0; i < list.size(); i++) {
        //     System.out.print(list.get(i) + " ");
        // }

        // System.out.println();
        // System.out.println("Size of ArrayList : " + list.size());
    }
}
