package searchInsertPosition;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(array, target));
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || target < nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}