#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char s1[50],s2[50];
  int flag=0;
  int n=0;
  int i;
  cin.getline(s1,50);
  cin.getline(s2,50);
  for(i=0;s1[i]!='\0';i++){
  	n++;
  }
  int c=0;
  for(i=0;i<n;i++){
  	if(s1[i]==s2[n-1-i]){
    	c++;
    }
  }
  if(c==n){
  	cout<<"It is correct";
  }
  else{
  	cout<<"It is wrong";
  }
  
}