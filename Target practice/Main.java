#include<iostream>
using namespace std;
int main()
{
  int t,score;
  int sum=0,c=0;
  cin>>t;
  
  while(sum<t){
  	cin>>score;
    sum+=score;
    c++;
  }
  
  cout<<"The number of turns is "<<c;
}