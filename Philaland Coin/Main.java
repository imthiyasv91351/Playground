#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int T;
  int N;
  cin>>T;
  for(int i=0;i<T;i++){
  	cin>>N;
    int count=0;
    while(N>0){
    	N=N/2;
      	count++;
    }
    cout<<count<<"\n";
  }
  return 0;
}