#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int i;
  float sum=0.5;
  cout<<sum;
  for(i=1;i<n;i++){
  	sum=sum+(2*sum);
    cout<<" "<<sum;
  }
}
    