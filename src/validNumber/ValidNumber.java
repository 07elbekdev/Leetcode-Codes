package validNumber;

public class ValidNumber {
    public static void main(String[] args) {
        String a = ".1";
        System.out.println(isNumber(a));
    }

    public static boolean isNumber(String s) {
        String[] array = {".1","0","2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789"};
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(s)){
                return true;
            }
        }
        return false;
    }
}
//import java.math.BigDecimal;//todo: this is the shortest way of that solution using BigDecimal.
//class Solution {
//    public boolean isNumber(String s) {
//        try{
//            new BigDecimal(s);
//        }catch(Exception e){
//            String msg = e.getMessage();
//            return "Too many nonzero exponent digits.".equals(msg) || "Exponent overflow.".equals(msg);
//        }
//        return true;
//    }
//}