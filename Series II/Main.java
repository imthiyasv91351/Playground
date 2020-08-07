#include<iostream>
using namespace std;
int main(){
  int n,i;
  cin>>n;
  int s=121;
  int d=104;
  cout<<s;
  for(i=1;i<n;i++){
  	s=s+d;
    d=d+32;
    cout<<" "<<s;
  }
}