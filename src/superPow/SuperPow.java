package superPow;

public class SuperPow {
    public static void main(String[] args) {
        int a = 3;
        int[]pow = {1,0};
        System.out.println(superPow(a,pow));
    }
        public static int superPow(int a, int[] b) {
            for (int num : b) {
                return num;
            }
            int result = (int) Math.pow(a,num);

            return result;
        }
    }