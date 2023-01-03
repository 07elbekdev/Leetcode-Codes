package squareOfSortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[]numbers = {3,-4,10,0};
        System.out.println(Arrays.toString(sortedSquares(numbers)));
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]*=nums[i];
        }
        return Arrays.stream(nums).sorted().toArray();
    }
}