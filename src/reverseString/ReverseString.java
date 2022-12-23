package reverseString;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[]string = "h,e,l,l,o".toCharArray();
        reverseString(string);
    }
        public static void reverseString(char[] s) {
            for (int i = s.length - 1; i >= 0; i--) {
                System.out.println(s[i]);
            }
            System.out.println(Arrays.toString(s));
        }
    }