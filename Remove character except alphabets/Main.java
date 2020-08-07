#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char str[200];
  int i=0;
  cin.getline(str,200);
  while(str[i]!='\0'){
  	if((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z') ){
    	cout<<str[i];
    }
    i++;
  }
}