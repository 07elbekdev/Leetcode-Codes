package integerToRoman;

import java.util.Scanner;

public class IntegerToRoman {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(intToRoman(in.nextInt()));
    }
    public static String intToRoman(int number){
         switch (number){
             case 1:
                 System.out.println("I");
                 break;
             case 2:
                 System.out.println();
         }
         return intToRoman(number);
    }
}
