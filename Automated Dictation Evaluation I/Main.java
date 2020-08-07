#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  char s1[50],s2[50];
  cin.getline(s1,50);
  cin.getline(s2,50);
  if(!strcmp(s1,s2)){
  	cout<<"It is correct";
  }
  else{
  	cout<<"It is wrong";
  }
}