package reverseStrings;

public class ReverseStrings {
    public static void main(String[] args) {
        String a = "Hello Thank you.";
        System.out.println(reverseWords(a));
    }

    public static String reverseWords(String a){
        StringBuilder st = new StringBuilder();
        String [] StringArr = a.split(" ");
        for (int i = 0; i < StringArr.length; i++) {
            char [] d = StringArr[i].toCharArray();
            int aLength = d.length-1;
            while (aLength>=0){
                st.append(d[aLength--]);
            }
            st.append(" ");
        }
        return st.toString().trim();
    }
}