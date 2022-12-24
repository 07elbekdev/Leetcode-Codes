package lengthOfLastWordInString;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String word = "Hello World";
        System.out.println(lengthOfLastWord(word));
    }

    public static int lengthOfLastWord(String s) {
        int result = Integer.parseInt(s.substring(Integer.parseInt(s)));
        for (int i = 0; i < result; i++) {
            result-=1;
        }
        return result;
    }
}
