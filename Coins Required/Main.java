#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int n;
  cin>>n;
  int five=(n-4)/5;
  int one=n-(five*5);
  int ones;
  if(one%2==0){
  	ones=2;
  }
  else{
  	ones=1;
  }
  
  int two=(n-(five*5+ones*1))/2;
  int total=five+ones+two;
  cout<<total<<" "<<five<<" "<<two<<" "<<ones<<endl;
  return 0;
}