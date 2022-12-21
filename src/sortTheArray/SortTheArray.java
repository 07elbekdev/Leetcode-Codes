package sortTheArray;

import java.util.Scanner;

public class SortTheArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("size of array: ");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        sortColors(array);
    }

    public static void sortColors(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int a : nums) {
            System.out.print(a + " ");
        }
    }
}