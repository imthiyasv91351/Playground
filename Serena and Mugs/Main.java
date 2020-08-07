#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s;
  cin>>n>>s;
  int a[n];
  int volume=0;
  for(int i=0;i<n;i++){
  	cin>>a[i];
    volume=volume+a[i];
  }
  if(volume<=s){
  	cout<<"YES";
  }
  else{
  	cout<<"NO";
  }
}