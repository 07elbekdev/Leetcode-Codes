package multiplyTwoStrings;

import java.util.Scanner;

public class MultiplyStrings {
    public static void main(String[] args) {
        String a = "123456789";
        String b = "987654321";
        System.out.println(multiply(a,b));
    }
    public static String multiply(String num1, String num2) {

        return String.valueOf(Integer.parseInt(num1)*Integer.parseInt(num2));
    }
}