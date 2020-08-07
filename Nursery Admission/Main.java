#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  char name[50];
  cin.getline(name,50);
  for(int i=0;name[i]!='\0';i++){
  	n++;
  }
  cout<<"The number of letters in the name is "<<n;
}