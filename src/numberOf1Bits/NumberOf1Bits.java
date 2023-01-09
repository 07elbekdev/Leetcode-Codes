package numberOf1Bits;

public class NumberOf1Bits {
    public static void main(String[] args) {
        int number = 00001110000;
        System.out.println(hammingWeight(number));
    }

    public static int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}