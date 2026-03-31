import java.util.Scanner;

public class decimaltobinary {
    public static int decimaltobinary(int a, int b){
        int ans = 0,pow = 1;
        while(a>0)
        {
            int rem = a%2;
            ans += rem*pow;
            pow = pow*10;
            a=a/2;
        }
        return ans;
    }
    public static int  decimaltooctal(int a,int b){
        int ans = 0,pow = 1;
        while(a>0)
        {
            int rem = a%8;
            ans += rem*pow;
            pow = pow*10;
            a=a/8;
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int decimal =decimaltobinary(a,b);
        int octal = decimaltooctal(a,b);
        System.out.println(decimal);
        System.out.println(octal);
    }
}    


