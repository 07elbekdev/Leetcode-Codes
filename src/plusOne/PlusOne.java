package plusOne;

public class PlusOne {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4};
        System.out.println(plusOne(number));
    }

    public static int[] plusOne(int[] digits) {

        for (int something:digits) {
            System.out.println(something);
        }

        return digits;
    }
}
