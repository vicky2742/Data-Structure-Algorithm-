import java.util.ArrayList;

public class Max {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(1);
        list.add(5);
        list.add(100);
        list.add(0);

        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxi) {
                maxi = list.get(i);
            }

            else if (list.get(i) < mini) {
                mini = list.get(i);
            }
        }

        System.out.println("maximum element :" + maxi);
        System.out.println("minimum element :" + mini);
    }
}
