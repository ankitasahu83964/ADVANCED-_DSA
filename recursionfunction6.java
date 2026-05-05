import java.util.Arrays;
public class recursionfunction6 {
    static int minSteps(int n,int[]dp){
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        dp[n]=minSteps(n-1,dp)+ minSteps(n-2,dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n=4;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(minSteps(n,dp));
    }

}
