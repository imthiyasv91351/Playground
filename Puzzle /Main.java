#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r,c,i,j;
  int m[10][10];
  cin>>r>>c;
  for(i=0;i<r;i++){
  	for(j=0;j<c;j++){
    	cin>>m[i][j];
    }
  }
  for(i=0;i<c;i++){
  	for(j=0;j<r;j++){
    	cout<<m[j][i]<<" ";
    }
    cout<<"\n";
  }
  
}