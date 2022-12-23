package plusOne;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] number = {1, 9, 9, 9};
        System.out.println(Arrays.toString(plusOne(number)));
    }

    public static int[] plusOne(int[] digits) {
        for (int arr:digits) {
            System.out.println(arr+1);
        }
        return null ;
    }
}
