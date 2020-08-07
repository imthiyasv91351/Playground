#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n,i,f=0,m=0;
  int *p;
  cin>>n;
  p=(int *)malloc(n*sizeof(int));
  for(i=0;i<n;i++){
  	cin>>*(p+i);
  }
  for(i=0;i<n;i++){
  	if((*(p+i)%2)==0){
    	f++;
    }
    else{
    	m++;
    }
  }
  cout<<m<<"\n";
  cout<<f;
  
  return 0;
}