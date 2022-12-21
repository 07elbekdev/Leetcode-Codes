package twoSortedLists;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        int[] num = {1, 2, 4};//here will add two arrays and than sort them.
        int[] number = {1, 3, 4};

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            array.add(num[i]);
        }
        for (int i = 0; i < number.length; i++) {
            array.add(number[i]);
        }
        Collections.sort(array);
        System.out.println(array);
    }
}