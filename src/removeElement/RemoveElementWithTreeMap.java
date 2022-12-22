package removeElement;


import java.util.ArrayList;

public class RemoveElementWithTreeMap {
    public static void main(String[] args) {
        int[] array = {2, 35, 27, 9, 35, 47};
        int value = 35;
        System.out.println(removeElement(array, value));
    }

    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                arrayList.add(nums[i]);
            }
        }

        return arrayList.size();
    }
}