#include<iostream>
#include<cmath>
using namespace std;
int main(){
  int n,i;
  cin>>n;
  
  for(i=1;i<=n;i++){
    if(i%2==0){
    	int t=pow(i,2)-2;
    	cout<<t<<" ";
    }
    else{
    	int t=pow(i,2)-1;
    	cout<<t<<" ";
    }
  }
}