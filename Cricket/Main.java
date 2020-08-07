#include<iostream>
#include<bits/stdc++.h>  
using namespace std;
int main()
{
  //Type your code here.
  float b,r,cr,cb;
  cin>>b>>r>>cr>>cb;
  int o=b/6;
  cout<<o;
  int i=cb/6;
  float j=(int(cb)%6);
  float t=j/10;
  float a=i+t;
  cout<<"\n"<<a;
  float crr=cr/a;
  cout<<"\n"<<fixed << setprecision(1)<<crr;
  float trr=r/o;
  cout<<"\n"<<fixed << setprecision(1)<<trr;
   if(crr>trr){
	cout<<"\nEligible to Win";
   }
   else{  
	cout<<"\nNot Eligible to Win";
   }
}