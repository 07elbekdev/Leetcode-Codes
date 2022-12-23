package wildCardMatching;

import java.util.Scanner;

public class WildCardMatching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isMatch(in.nextLine(),in.nextLine()));
    }

    public static boolean isMatch(String a, String k) {
         boolean result = WildCardMatching.isMatch(a,k);

        return result;
    }
}