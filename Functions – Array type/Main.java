#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i;
  int odd=0;
  int even = 0;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int a[20];
  cout<<"\nEnter the elements in the array";
  for(i=0;i<n;i++){
  	cin>>a[i];
    if(a[i]%2==0){
    	even=even+1;
    }
    else{
    	odd=odd+1;
    }
  }
  if(even==n){
  	cout<<"\nThe array is Even";
  }
  else if(odd==n){
  	cout<<"\nThe array is Odd";
  }
  else{
  	cout<<"\nThe array is Mixed";
  }
  
  
}