package multiplyTwoStrings;

public class MultiplyStrings {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        System.out.println(multiply(num1,num2));
    }
        public static String multiply(int num1, int num2) {
            return String.valueOf(num2*num1);
        }
    }