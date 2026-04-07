import java.util.Scanner;
public class str{
       public  static void main (String [] args){
       String str1 = "Hello";
       String str2 = new String("Hi");
       System.out.println(str1);
       System.out.println(str2);
       System.out.println(str1.length());
       System.out.println(str1.charAt(2));
       System.out.println(str1.toUpperCase());
       System.out.println(str1.toLowerCase());
       String s = str1.concat("world");
       System.out.println(s);
       System.out.println(str1.equals(str2));
       String rev = "";
       for(int i=str1.length()-1;i>=0;i--){
         rev = rev + str1.charAt(i);
        }
       System.out.println(rev);
       System.out.println(str1.substring(0,2));
       System.out.println(str1.replace('l','z'));
       String str3 = "aaabbcd";
       System.out.println(str3);
       String str4 = "programming";
       for(int i=0;i<str4.length();i++){
           int count=0;
           for(int j=0;j<str4.length();j++){
               if(str4.charAt(i) == str4.charAt(j))
                {
               count++;
            }
        }
        
        if (count==1) {
            System.out.println("non repeating charcter: " +str4.charAt(i));
             break;
            }  
       }    
    }
}
