import java.util.Arrays;
public class longestword {
    public static void main(String [] args){
        String str1 = "listen to me now";
        String[] words = str1.split(" ");
        String longest = "";
        for(String word : words)
        {
            if(word.length()>longest.length())
            {
             longest = word;
            }
        }
        System.out.println(longest);
    }
}
