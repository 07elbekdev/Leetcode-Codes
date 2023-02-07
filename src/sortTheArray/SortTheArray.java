package sortTheArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortTheArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("size of array: ");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        Arrays.stream(array).sorted().forEach(System.out::println);
    }
}