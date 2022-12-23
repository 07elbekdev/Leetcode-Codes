package multiplyTwoStrings;

import java.math.BigInteger;

public class MultiplyStrings {
    public static void main(String[] args) {
        String a = "6913259249";//here will multiply String by numbers even they are large.
        String b = "7110334989";
        System.out.println(multiply(a, b));
    }

    public static String multiply(String num1, String num2) {

        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);
        BigInteger mulpitle = number1.multiply(number2);
        String result = mulpitle.toString();

        return (result);
    }
}