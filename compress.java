import java.util.Arrays;
public class compress {
    public  static void main(String[] args){
        String str1 = "aabbc";
        String result = "";
        int count = 1;
        for(int i=0;i<str1.length()-1;i++)
        {
            if(str1.charAt(i) == str1.charAt(i+1))
            {
                count++;
            }
        
        else{
            result = result + str1.charAt(i) + "" + count;
            count = 1;
         }
        } 
    
    result += str1.charAt(str1.length()-1)+ "" + count;
    System.out.println(result);
    }
}
