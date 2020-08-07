#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int birth,current;
  cin>>birth>>current;
  if(current<birth)
  {
    birth=1900+birth;
    current=2000+current;
    int a=current-birth;
    cout<<a;
  }
  else
  {
  cout<<current-birth;
  }
  
}