#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i;
  cin>>n;
  int a[15];
  for(i=0;i<n;i++){
  	cin>>a[i];
  }
  int even=0;
  int odd=0;
  for(i=0;i<n;i++){
  	if(a[i]%2==0){
    	even=even+a[i];	
    }
    else{
    	odd=odd+a[i];
    }
  }
  cout<<"The sum of the even numbers in the array is "<<even;
  cout<<"\nThe sum of the odd numbers in the array is "<<odd;
}