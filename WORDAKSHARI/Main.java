#include<iostream>
#include<string>
#include <cstring>
using namespace std;
int main()
{
  //Type your code here.
  char word[50][50];
  int i,n=0;
  for(i=0;i<5;i++){
  	cin.getline(word[i],50);
    if(!strcmp(word[i],"####")){
    	break;
    }
    n++;
  }
  cout<<word[0]<<endl;
  for(int i=0;i<n;i++){
  	if(word[i][strlen(word[i])-1]==word[i+1][0]){
    	cout<<word[i+1]<<endl;
    }
  }
  
  
  
  
}