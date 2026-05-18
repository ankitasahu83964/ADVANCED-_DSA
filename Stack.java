import java.util.*;
import java.util.Stack;
class Stack_using_AI{
  ArrayList<Integer>arr=new ArrayList();
  public boolean isEmpty(){
    return arr.isEmpty();
  }
  //pop
  public int pop(){
    if(isEmpty()){
      return -1;
    }
    else{
      int top=arr.get(arr.size()-1);
      arr.remove(arr.size()-1);
      return top;
    }
  }
  //push
  public void push(int x){
    arr.add(x);
  }
  //size
  public int size(){
    return arr.size();
  }
  public int peek(){
    if(isEmpty()){
    return -1;
    }
  else
  return arr.get(arr.size()-1);
  }  
}  
public class Stack {
  public static void main(String[] args){
  Stack<Integer>st=new Stack();
  System.out.println(st.isEmpty());
  st.push(10);
  st.push(20);
  st.push(50);
  st.push(70);
  System.out.println(st);
  System.out.println(st.pop());
  System.out.println(st.peek());
  System.out.println(st.isEmpty());
  }

}
  

  


