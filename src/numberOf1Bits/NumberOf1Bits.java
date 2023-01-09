package numberOf1Bits;

import java.util.stream.Stream;

public class NumberOf1Bits {
    public static void main(String[] args) {
        int number = 00001110000;
        System.out.println(hammingWeight(number));
    }

    public static int hammingWeight(int n) {
        System.out.println(Stream.of(n).map(a -> a == 1).count());
        return 0;
    }
}