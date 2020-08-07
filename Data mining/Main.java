#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int odd=0;
  int even=0;
  while(n>0){
  	int digit = n%10;
    if(digit%2==0){
    	even=even+digit;
    }
    else{
    	odd=odd+digit;
    }
    n=n/10;
  }
  if(odd==even){
  	cout<<"Yes";
  }
  else{
  	cout<<"No";
  }
  
}