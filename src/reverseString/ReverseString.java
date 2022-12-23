package reverseString;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        reverseString(s.toCharArray());
    }
    public static void reverseString(char[] s) {
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i]);
        }
    }
}