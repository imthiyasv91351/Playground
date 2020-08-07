#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,t1,t2,nextTerm;
  cin>>n;
  for(i=0;i<n;i++){
  	if(i==0){
    	t1=0;
    }
    else if(i==1){
    	t2=1;
    }
    else{
    	nextTerm=t1+t2;
        t1=t2;
        t2=nextTerm;
    }
  }
  cout<<nextTerm;
}