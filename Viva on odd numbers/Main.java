#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i=0;
  cin>>n;
  float m=0;
  while(i<3){
  	if(n%2==0 && n>0){
  		m=m-0.5;
    	cin>>n;
  	}
  	else if(n%2!=0){
  		m=m+1;
    	cin>>n;
        i=i+1;
  	}
    else if(n<0){
    	m=m-1;
        i=3;
    }
  }
	cout<<m;
  
}