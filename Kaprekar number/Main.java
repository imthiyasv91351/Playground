#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int k,i=0;
  cin>>k;
  int s=k*k;
  int temp=s;
  int sum;
  while(temp>0){
  	int digit = temp%10;
    temp=temp/10;
    i=i+1;
  }
  int c=i/2;
  int d=pow(10,c);
  int last = s%d;
  int first = s/d;
  sum=last+first;
  if(k==sum){
  	cout<<"Kaprekar Number";
  }
  else{
  	cout<<"Not a Kaprekar Number";
  }
  
  
  
}