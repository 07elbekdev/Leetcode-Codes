package removeElement;

public class RemoveElementWithTreeMap {
    public static void main(String[] args) {
        int[] array = {2, 35, 27, 9, 35, 47};
        int value = 35;
        System.out.println(removeElement(array, value));
    }

    public static int removeElement(int[] nums, int val) {
        int prevIndex = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == val)
                continue;
            nums[prevIndex++] = nums[index];
        }
        return prevIndex;
    }
}