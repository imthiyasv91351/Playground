#include<iostream>
using namespace std;

int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int count=0;
  int num=n;
  while(num>0){
    num=num/10;
  	count++;  
  }
  int num1=n;
  int sum=0;
  while(num1>0){
  	int digit=num1%10;
  	int p=power(digit,count);
    sum=sum+p;
    num1=num1/10;
  }
  if(sum==n){
  	return 1;
  }
  else{
  	return 0;
  }
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}