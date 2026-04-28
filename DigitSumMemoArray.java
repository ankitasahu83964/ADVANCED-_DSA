import java.util.Arrays;
public class DigitSumMemoArray {
    static int[] dp=new int[100000];
    public static int digitSum(int n){
        n=Math.abs(n);
        if(n==0) return 0;
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=(n%10)+digitSum(n/10);
        return dp[n];
    }
    public static void main(String[] args) {
        int num=12345;
        System.out.println("digit Sum:"  + digitSum(num));
    }
    
}
