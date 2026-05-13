public class Subsequences {

    static void subsequence(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        // include character
        subsequence(str.substring(1), ans + ch);

        // exclude character
        subsequence(str.substring(1), ans);
    }

    public static void main(String[] args) {

        String s = "ABC";
        subsequence(s, "");
    }   
}
