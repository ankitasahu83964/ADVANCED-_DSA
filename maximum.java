public class maximum {
        public  static void main(String[] args){
        String str1="a1b2c3d4e5";
        char max = 0;
        for(int i=0;i<str1.length();i++){
           char ch= str1.charAt(i);
           if(ch>='0' && ch<='9' && ch>max){
            max=ch;
           }
        }
        System.out.println(max);   

    } 
}
