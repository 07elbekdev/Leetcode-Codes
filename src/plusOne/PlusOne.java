package plusOne;

public class PlusOne {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4};
        System.out.println(plusOne(number));
    }

    public static int[] plusOne(int[] digits) {

        for (int i = 0; i < digits.length; i++) {
            digits[i]+=1;
        }

        return digits;
    }
}
