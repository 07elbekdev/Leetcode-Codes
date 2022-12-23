package addArraytoNumber;

import java.util.LinkedList;
import java.util.List;

public class AddArraytoNumber {
    public static void main(String[] args) {
        int[] number = {1, 2, 0, 0};
        int num = 1234;
        System.out.println(addToArrayForm(number, num));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> array = new LinkedList<>();
        for (int i = num.length - 1; i >= 0; i--) {
            array.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while(k>0){
            array.add(0,k%10);
            k/=10;
        }
        return array;
    }
}