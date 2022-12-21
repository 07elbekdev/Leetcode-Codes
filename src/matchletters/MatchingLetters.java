package matchletters;

import java.util.Scanner;

public class MatchingLetters {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(mathching(in.nextLine(), in.nextLine()));

    }

    public static boolean mathching(String a, String b) {

        boolean result = a.matches(b);//here will compare the letters with each other.

        return result;
    }
}