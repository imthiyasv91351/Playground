#include<iostream>
using namespace std;
int fib(int n){
	if(n==1){
    	return 0;
    }
  	else if(n==2){
    	return 1;
    }
  	else{
    	return fib(n-1)+fib(n-2);
    }
}
int main()
{
  //Type your code here.
  int num;
  cin>>num;
  int result = fib(num);
  cout<<"The term "<<num<<" in the fibonacci series is "<<result;
}