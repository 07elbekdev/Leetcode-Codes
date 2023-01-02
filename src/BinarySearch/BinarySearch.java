package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[]some = {1,3,4,5,6};
        int target = 2;
        System.out.println(search(some,target));
    }
        public static int search(int[] nums, int target) {
        int index = -1;
            for (int i = 0; i < nums.length; i++) {
                if (target==nums[i]){
                    index=i;
                }
            }
            return index;
        }
    }