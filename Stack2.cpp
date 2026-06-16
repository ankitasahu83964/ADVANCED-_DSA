#include<iostream>
#include<stack>
using namespace std;

int main(){
    //creation of stack
    stack<int>s;

    //push operation
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);

   //pop operation
    s.pop();
   
   //is empty check operation
    if(s.empty()){
        cout<<" stack is empty "<<endl;
    }
    else{
        cout<<"stack is not empty "<<endl;
    }

    cout<<"print top element "<< s.top() <<endl;
    cout<<"size of stack  is "<<s.size() <<endl;

    return 0;
}