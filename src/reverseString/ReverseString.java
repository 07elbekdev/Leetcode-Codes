package reverseString;

public class ReverseString {
    public static void main(String[] args) {
        String [] string = {"h","e","l","l","o"};
        reverseString(string);
    }

    public static void reverseString(String[] s) {
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i]);
        }
    }
}