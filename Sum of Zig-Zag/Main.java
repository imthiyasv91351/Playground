#include<iostream>
using namespace std;
int sumZigZag(int m,int n,int a[10][10]){
  int sum1=0;
  for(int j=0;j<n;j++){
  	sum1=sum1+a[0][j];
  }
  int k=m-1;
  int sum2=0;
  for(int j=0;j<n;j++){
  	sum2=sum2+a[k][j];
  }
  int sum3=0;
  for(int i=0;i<m;i++){
    
  	if(i==0 || i==(m-1)){
    	continue;
    }
    else{
    	sum3=sum3+a[i][m-1-i];
    }
  }
  int sum = sum1+sum2+sum3;
  return sum;
  
}
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int arr[10][10];
  for(int i=0;i<r;i++){
  	for(int j=0;j<c;j++){
    	cin>>arr[i][j];
    }
  }
  int result=sumZigZag(r,c,arr);
  cout<<"Sum of Zig-Zag pattern is "<<result;
}