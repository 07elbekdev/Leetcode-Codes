package multiplyTwoStrings;

import java.math.BigInteger;

public class MultiplyStrings {
    public static void main(String[] args) {
        String a = "6913259249";//here will multiply two Strings by number, even they are large.
        String b = "7110334989";
        System.out.println(multiply(a, b));
    }

    public static String multiply(String num1, String num2) {

          long i = Long.parseLong(String.valueOf(num1));
          long j = Long.parseLong(String.valueOf(num2));

//        BigInteger number1 = new BigInteger(num1);
//        BigInteger number2 = new BigInteger(num2);
//        BigInteger multiply = number1.multiply(number2);
//
//        return (multiply.toString());
    }
}