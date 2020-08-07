#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int wb,a,c,r;
  cin>>wb>>a>>c;
  r=((75*a)+(30*c));
  if(r<=wb){
  	cout<<"Boat is stable";
  }
  else{
  	cout<<"Boat will drow";
  }
  
}