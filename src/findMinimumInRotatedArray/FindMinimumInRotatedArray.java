package findMinimumInRotatedArray;

public class FindMinimumInRotatedArray {
    public static void main(String[] args) {
        int[]array = {1,2,3,4,2,4};
        System.out.println(findMin(array));
    }
        public static int findMin(int[] num) {
        int numbers = num.length;
        int min = num[0];
            for (int i = 0; i < numbers; i++) {
                  if (num[i]==min){
                      min = num[i];
                  }
            }
            return min ;
        }
    }