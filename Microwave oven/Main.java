#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float t;
  cin>>n>>t;
  if(n==2){
    t = t+(t*50/100);
  	cout<<t ;
  }
  else if(n==3){
    float a = 2*t ;
  	cout<<a;
  }
  else{
  	cout<<"Number of items is more";
  }
}