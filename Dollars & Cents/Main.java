#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int doller1,cent1;
  int doller2,cent2;
  cin>>doller1>>cent1;
  cin>>doller2>>cent2;
  int doller=doller1+doller2;
  int cent=cent1+cent2;
  if(cent>=100){
    int c=cent/100;
    doller=doller+c;
    int r=cent%100;
  	cout<<doller<<"\n";
  	cout<<r;
  }
  else{
  	cout<<doller<<"\n";
    cout<<cent;
  }

}
  