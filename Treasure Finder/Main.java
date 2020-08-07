#include<iostream>
using namespace std;
int main()
{
  int a,b,c,i,temp=1;
  cin>>a>>b>>c;
  if(a>b && a>c){
  	if(b>c)
		cout<<"The treasure is in box which has number "<<b;
  	else
		cout<<"The treasure is in box which has number "<<c;
  }
  if(b>a && b>c){
	if(a>c)
		cout<<"The treasure is in box which has number "<<a;
	else
		cout<<"The treasure is in box which has number "<<c;
  }
  if(c>a&&c>b){
	if(b>a)
		cout<<"The treasure is in box which has number "<<b;
	else
		cout<<"The treasure is in box which has number "<<a;
  }

  int n=a*b*c;
  for(i=2;i<=n;i++){
  	if(a%i==0 && b%i==0 && c%i==0){
    	temp=i;
    }
  }
  cout<<"\nThe code to open the box is "<<temp;
        
}