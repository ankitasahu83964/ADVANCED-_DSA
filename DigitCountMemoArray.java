import java.util.Arrays;
public class DigitCountMemoArray {
    static int[] dp=new int[100000];
    public static int countDigits(int n){
        n=Math.abs(n);
        if(n==0) return 1;
        if(n<10) return 1;
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=1+countDigits(n/10);
        return dp[n];
    }
    public static void main(String[] args) {
        int num=91093;
        System.out.println("Digit count:"  + countDigits(num));
    }
    
}
