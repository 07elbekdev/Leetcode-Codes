package plusOne;

public class PlusOne {
    public static void main(String[] args) {
        int[] number = {1, 9, 9, 9};
        System.out.println(plusOne(number));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            digits[i] += 1;
        }
        for (int as : digits) {
            System.out.println(as);
        }
        return null;
    }
}
