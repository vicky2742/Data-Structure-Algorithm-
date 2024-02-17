//*main class
public class Encap {
    public static void main(String[] args) {
        // access class animal

        // ?need to construt the object for animal class in main fun
        Animal a1 = new Animal();
        a1.id = 150;
        System.out.println(a1.id);
        // a1.name = "Lion";
        // System.out.println(a1.name);
        System.out.println(a1.setName("dog"));

        Sum s1 = new Sum();

        System.out.println(s1.sum(1, 2));
    }
}

class Animal {
    // ! class attributes................
    private String name;
    int id;

    // ! class methods....................

    String setName(String name) {
        this.name = name;
        return this.name;
    }

}

class Sum {
    int a, b;

    int sum(int a, int b) {
        return a + b;
    }
}