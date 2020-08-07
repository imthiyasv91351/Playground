#include<iostream>
#include<string>
using namespace std;
int main() 
{
  std::string fnum;
  int i,size;
  cin>>fnum;
  size=fnum.length();
  for(i=0;i<size;i++)
    if(fnum[i]!='.')
      continue;
  else
    break;
  cout<<"Floating part is : ";
  i++;
  for(;i<size;i++)
    cout<<fnum[i];
  
}