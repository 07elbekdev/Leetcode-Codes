package thirdMaximum;

import java.util.Arrays;
import java.util.HashSet;

public class ThirdMaximum {
    public static void main(String[] args) {
        int[] maximum = {2, 2, 3, 1};
        System.out.println(thirdMax(maximum));
    }

    public static int thirdMax(int[] nums) {
        HashSet<Integer> array = new HashSet<>();
        Arrays.sort(nums);
        if (nums.length >= 2) {
            return Math.max(nums[0], nums[1]);
        }
        for (int i = 0; i < nums.length; i++) {
                array.add(nums[i]);
                System.out.println(nums[i]);

                if (i == nums.length - 3) {
                    return nums[i];
                }
            }
        return 0;
    }
}