import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void print(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(5);

        System.out.print("Before Sort : ");
        print(list);

        System.out.println();

        System.out.print("after sort :");
        Collections.sort(list);
        print(list);
    }
}
