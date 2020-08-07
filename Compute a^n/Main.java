#include<iostream>
using namespace std;
long apower(int x , int n){
	if(n==0){
    	return 1;
    }
  	else{
    	return x*(apower(x,n-1));
    } 
}

int main()
{
  //Type your code here.
  int num,a;
  cout<<"Enter the value of a";
  cin>>a;
  cout<<"\nEnter the value of n";
  cin>>num;
  long result =apower(a,num);
  cout<<"\nThe value of "<<a<<" power "<<num<<" is "<<result;
  
}