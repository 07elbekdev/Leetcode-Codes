package squareOfSortedArray;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] numbers = {3, -4, 10, 0};
        System.out.println(Arrays.toString(sortedSquares(numbers)));
    }

    public static int[] sortedSquares(int[] nums) {

        return Arrays.stream(nums).map(i -> i*i).sorted().toArray();
    }
}