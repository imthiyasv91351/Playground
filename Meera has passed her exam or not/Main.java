#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,i;
  bool flag=false;
  cin>>n;
  int id[n];
  for(i=0;i<n;i++){
  	cin>>id[i];
  }
  int s;
  cin>>s;
  for(i=0;i<n;i++){
  	if(id[i]==s){
    	flag=true;; 
    }
  }
  if(flag==true){
  	cout<<"She passed her exam";
  }
  else{
  	cout<<"She failed";
  }
}