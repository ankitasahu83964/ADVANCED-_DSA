public class recursionfunction2
{
    static void totalSum(String ans,String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        totalSum(ans+ch, str.substring(1));
        totalSum(ans, str.substring(1));
    }
    public static void main(String[] args){
        String str="abc";
        totalSum("",str);

    }

    
}
