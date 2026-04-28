import java.util.Arrays;
public class recursionfunction1 {
    static int fibo(String str,int i,int[] dp){
        if(i==str.length()) return 1;
        if(dp[i]!=-1) return dp[i];
        int x= fibo(str,i+1,dp);
        int y= fibo(str,i+1,dp);
        dp[i]=x+y;
        return dp[i];
    }
    public static void main(String[] args){
        String str = "abc";
        int[] dp = new int[str.length() +1];
        int i=0;
        Arrays.fill(dp,-1);
        System.out.println(fibo(str,i,dp));
    }
}    