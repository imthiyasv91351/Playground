#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int u,b;
  cin>>u;
  if(u<=200){
    b=(0.5*u);
  	cout<<"Rs."<<b;
  }
  else if(u<=400){
    b=(0.65*u)+100;
  	cout<<"Rs."<<b;
  }
  else if(u<=600){
    b=(0.80*u)+200;
  	cout<<"Rs."<<b;
  }
  else if(u>600){
    b=(1.25*u)+425;
  	cout<<"Rs."<<b;
  }
}