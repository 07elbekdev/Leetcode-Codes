package powMath;

import java.util.Scanner;

public class PowMath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(MyPow(in.nextInt(), in.nextInt()));
    }
    public static double MyPow(double x, int n){

        return Math.pow(x,n);
    }
}