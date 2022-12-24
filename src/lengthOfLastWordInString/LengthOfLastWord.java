package lengthOfLastWordInString;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String word = "Hello World";
        System.out.println(lengthOfLastWord(word));
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        String[] str = s.split(" ");
        if (str.length > 0) {
            count = str[str.length-1].length();
        }else{
            count=0;
        }
        return count;
    }
}