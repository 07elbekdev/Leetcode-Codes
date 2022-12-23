package multiplyTwoStrings;

public class MultiplyStrings {
    public static void main(String[] args) {
        String a = "123456789";
        String b = "987654321";
        System.out.println(multiply(a,b));
    }
    public static String multiply(String num1, String num2) {
        long a = Long.parseLong(String.valueOf(num1));
        long b = Long.parseLong(String.valueOf(num2));
            String result = String.valueOf(Integer.parseUnsignedInt(num1)*Integer.parseUnsignedInt(num2));
        return result;
    }
}