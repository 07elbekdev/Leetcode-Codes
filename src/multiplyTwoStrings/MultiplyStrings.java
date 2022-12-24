package multiplyTwoStrings;

import java.math.BigInteger;

public class MultiplyStrings {
    public static void main(String[] args) {
        String a = "69";//here will multiply two Strings by number, even they are large.
        String b = "719";
        System.out.println(multiply(a, b));
    }

    public static String multiply(String num1, String num2) {

        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);
        BigInteger multiply = number1.add(number2);

        return (multiply.toString());
    }
}