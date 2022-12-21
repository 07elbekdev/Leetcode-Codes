import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
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