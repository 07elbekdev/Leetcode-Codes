import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/**        Scanner in = new Scanner(System.in);
 System.out.println(longestPalindrome(in.nextLine()));//this is with 20 th line until 25.

 }

 public static String longestPalindrome(String s) {
 String res = "";
 for (int i = 0, j = 0, d = 0; j < s.length(); i += d, j += 1 - d, d = 1 - d)
 for (int l = i, r = j; l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r); l--, r++)
 if (r + 1 - l > res.length()) res = s.substring(l, r + 1);
 return res;
 }
 }*


//        Scanner in = new Scanner(System.in);
//        System.out.println(mathching(in.nextLine(),in.nextLine()));//this is with 11 line until 18.
//    }
//
//    public static boolean mathching(String a, String b) {
//
//        boolean result = a.matches(b);//here will compare the letters with each other.
//
//        return result;
//    }
//}


        Scanner in = new Scanner(System.in);//it's with 50 th line until 67
        System.out.println(isPalindrome(in.nextInt()));

    }

    public static boolean isPalindrome(int x) {
        int r, sum = 0, temp;
        //It is the number variable to be checked for palindrome

                temp = x;
        while (x > 0) {
            r = x % 10;  //getting remainder
            sum = (sum * 10) + r;
            x = x / 10;
        }
        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }
}