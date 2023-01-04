package moveZeroes;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] a = {123, 34, 0, 3435};
        moveZeroes(a);
    }

    public static void moveZeroes(int[] nums) {
        int number = nums.length;
        int count = 0;
        for (int i = 0; i < number; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        while (count < number) {
            nums[count++] = 0;
        }
    }
}