package countOddNumbersInAnInteger;

public class CountOddNumbersInAnIntervalRange {
    public static void main(String[] args) {
        int low = 8;
        int high = 10;
        System.out.println(countOdds(low, high));
    }

    public static int countOdds(int low, int high) {
        if (low%2==0 & high%2==0)return (high-low)/2;
        return ((high-low)/2)+1;
    }
}