#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0,temp;
  cin>>n;
  temp=n;
  while(temp>0){
  	int digit = temp % 10;
    sum = sum + digit;
    temp = temp/10;
  }
  int r = n%sum ;
  
  if(r==0)
  	cout<<"Harshad Number";
  else
  	cout<<"Not Harshad Number";
}
