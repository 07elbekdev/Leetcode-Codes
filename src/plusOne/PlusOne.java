package plusOne;

public class PlusOne {

    public static void main(String[] args) {
        int[]arr = {1,9,9,9};
        System.out.println(plusOne(arr));
    }

    public static int[] plusOne(int[] digits) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int num : digits) {
            stringBuilder.append(num);
        }
        int transform = Integer.parseInt(stringBuilder.toString());
        int result = transform+1;
        return new int[result];
    }
}