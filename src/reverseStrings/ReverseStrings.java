package reverseStrings;

public class ReverseStrings {
    public static void main(String[] args) {
        String a = "Hello Thank you.";
        System.out.println(reverseWords(a));
    }

    public static String reverseWords(String s) {
        char[] some = s.toCharArray();
        StringBuilder a = new StringBuilder(some.length);
        a.reverse();
        return a.toString();
    }
}