package multiplyTwoStrings;

public class MultiplyStrings {
    public static void main(String[] args) {
        String a = "123456789";
        String b = "987654321";
        System.out.println(multiply(a,b));
    }
    public static String multiply(String num1, String num2) {
        long i = Integer.parseInt(num1);
        long j = Integer.parseInt(num2);
            String result = String.valueOf(i*j);
        return (String.valueOf(result));
    }
}