package multiplyTwoStrings;

public class MultiplyStrings {
    public static void main(String[] args) {
        String a = "6913259249";//here will multiply String by numbers even they are large.
        String b = "7110334989";
        System.out.println(multiply(a, b));
    }

    public static String multiply(String num1, String num2) {
        long i = Integer.parseInt(num1);
        long j = Integer.parseInt(num2);
        String result = (String.valueOf(i * j));
        return (String.valueOf(result));
    }
}