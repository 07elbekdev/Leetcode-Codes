package powerOfTwo;

public class PowerOfTwo {

    public static void main(String[] args) {
        int a = 3;
        System.out.println(isPowerOfTwo(a));
    }

    public static boolean isPowerOfTwo(int n) {
        while (n % 2 == 0) {
            n = n / 2;
        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
}