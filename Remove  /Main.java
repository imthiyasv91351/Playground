#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  getline(cin,str);
  string s2="the";
  int found;
  found=str.find(s2);
  while(found!=-1){
    str.erase(found,4);
    found=str.find(s2);
    if(found==-1){
        break;
        }  
    }
  cout<<str;
}