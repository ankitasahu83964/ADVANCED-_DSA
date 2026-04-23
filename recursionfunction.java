public class recursionfunction
{
  static void totalSum(String p,int r,int c){
    if(r==1 && c==1){
      System.err.println(p);
      return;
    }
    if(r>1) totalSum(p+"D",r-1,c);
    if(c>1) totalSum(p+"R",r,c-1);
  }
  public static void main(String[] args){
      int r=2;
      int c=2;
      totalSum("",r,c);
  }    
}