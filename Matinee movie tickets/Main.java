#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  double time;
  cin>>age>>time;
  if(age<13 && time==13.30){
  	cout<<"$2.00";
  }
  else if(age>=13 && time==13.30){
  	cout<<"$5.00";
  }
  else{
  	if(age>=13){
    	cout<<"$8.00";
    }
    else{
    	cout<<"$4.00";
    }
  }
}  