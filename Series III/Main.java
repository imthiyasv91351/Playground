#include<iostream>
using namespace std;
int main(){
  int n,i;
  cin>>n;
  int s=6;
  int d=5;
  cout<<s;
  for(i=1;i<n;i++){
  	s=s+d;
    d=d+5;
    cout<<" "<<s;
  }
}