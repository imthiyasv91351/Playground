#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,rowcount=0,colcount=0;
  cin>>r>>c;
  int arr[r][c];
  for(int i=0;i<r;i++){
    for(int j=0;j<r;j++){
    	cin>>arr[i][j];
    }
  }
  cout<<"Sum of rows is ";
  int max=0;
  for(int i=0;i<r;i++){
    int rowsum=0;
  	for(int j=0;j<c;j++){
    	rowsum=rowsum+arr[i][j];
    }
    cout<<rowsum<<" ";
    if(rowsum>max){
    	max=rowsum;
        rowcount++;
    }
  }
  cout<<"\nRow "<<rowcount<<" has maximum sum";
  
  cout<<"\nSum of columns is ";
  int max1=0;
  for(int i=0;i<r;i++){
    int colsum=0;
  	for(int j=0;j<c;j++){
    	colsum=colsum+arr[j][i];
    }
    cout<<colsum<<" ";
    if(colsum>max1){
    	max1=colsum;
        colcount++;
    }
  }
  cout<<"\nColumn "<<colcount<<" has maximum sum";
  
  
}