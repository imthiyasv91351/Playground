#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,n;
  cin>>r>>c>>n;
  if(n<=c || n%c==0 || (n-1)%c==0 ){
  	cout<<"Yes";
  }
  else{
  	cout<<"No";
  }
  
}