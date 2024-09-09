import java.util.Stack;

public class ReverseString {
     static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        StringBuilder res = new StringBuilder("");

        while (!s.isEmpty()) {
            char curr = s.pop();
            res.append(curr);
        }

        return res.toString();

    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverseString(str));
    }
}