#include<iostream>
using namespace std;
int main(){
  int n,i,j;
  cin>>n;
  int num=n;
  for(i=0;i<=3;i++){
  	for(j=0;j<=i;j++){
    	cout<<num;
    }
    num=num+1;
    cout<<endl;
  }
  num=num-1;
  for(i=3;i>=0;i--){
  	for(j=i;j>=0;j--){
    	cout<<num;
    }
    num=num-1;
    cout<<endl;
  }
}