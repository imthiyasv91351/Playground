#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r,c,i,j;
  cin>>r>>c;
  int m1[r][c];
  int m2[r][c];
  int add[r][c];
  for(i=0;i<r;i++){
  	for(j=0;j<c;j++){
    	cin>>m1[i][j];
    }
  }
  for(i=0;i<r;i++){
  	for(j=0;j<c;j++){
    	cin>>m2[i][j];
    }
  }
  
  for(i=0;i<r;i++){
  	for(j=0;j<c;j++){
      	add[i][j]=m1[i][j]+m2[i][j];   	
    }
  }
  for(i=0;i<r;i++){
  	for(j=0;j<c;j++){
      	cout<<add[i][j]<<" ";  	
    }
    cout<<"\n";
  }
  
}