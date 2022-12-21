package longestPalindromeOfString;

import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(longestPalindrome(in.nextLine()));
    }

    public static String longestPalindrome(String s) {
        String res = "";
        for (int i = 0, j = 0, d = 0; j < s.length(); i += d, j += 1 - d, d = 1 - d)
            for (int l = i, r = j; l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r); l--, r++)
                if (r + 1 - l > res.length()) res = s.substring(l, r + 1);
        return res;
    }
}