package basicCalculator;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(calculate(String.valueOf(a)));
    }
        public static int calculate(String s){
           int result = Integer.parseInt(s);
           int real = result+1;
           return real;
        }
    }