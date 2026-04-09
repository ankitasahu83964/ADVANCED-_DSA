public class JavaString {
    public static void main(String[] args){
        //remove consecutive similar world only 1 should 
        String str1="aabbbccdaa";
        String result=" ";
        result +=str1.charAt(0);
        for(int i=1;i<str1.length();i++){
            if(str1.charAt(i)!=str1.charAt(i-1)){
                result +=str1.charAt(i);
            }
        }
        System.out.println(result);

    }
}
