
public class Basic2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // s1.setName("Vicky");
        s1.name="vicky";
        System.out.println(s1.name);

        s1.setId(150);

        System.out.println(s1.id);

    }
}

class Student {
    String name;
    int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}