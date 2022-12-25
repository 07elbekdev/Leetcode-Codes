package sunOfNumbersandItsReverse;

public class SumOfNumbersAndItsReverse {
    public static void main(String[] args) {
        int number = 181;
        System.out.println(sumOfNumberAndReverse(number));
    }

    public static boolean sumOfNumberAndReverse(int num) {
        if (num == 0)
            return true;

        for (int i = 1; i <= num; i++) {

            String temp2 = String.valueOf(i);
            StringBuilder sb = new StringBuilder();
            sb.append(temp2);
            String temp3 = sb.reverse().toString();
            int j = Integer.parseInt(temp3);
            if ((i + j) == num) {
                return true;
            }
        }
        return false;
    }
}