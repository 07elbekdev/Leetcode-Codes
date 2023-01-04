package findIndexOfTarget;

import java.util.Arrays;

public class FindIndefOfTarget {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        int something = 9;
        System.out.println(Arrays.toString(twoSum(ar, something)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i]+numbers[i]==target) {
                System.out.println(i);
            }
        }
        return numbers;
    }
}