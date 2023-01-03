package rotateAnArray;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int b = 3;
        rotate(a, b);
    }

    public static void rotate(int[] nums, int k) {
        int[] numbers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numbers[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = numbers[i];
        }
    }
}