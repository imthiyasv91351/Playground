#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int a[10][10];
  for(int i=0;i<r;i++){
  	for(int j=0;j<c;j++){
    	cin>>a[i][j];
    }
  }
  for(int i=0;i<r;i++){
    int sum=0;
  	for(int j=0;j<c;j++){
    	sum=sum+a[i][j];
    }
    cout<<sum<<"\n";
  }
}