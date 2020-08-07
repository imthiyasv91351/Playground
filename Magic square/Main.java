#include<iostream>
using namespace std;
bool ismagicsquare(int arr[5][5],int n){
	int sum=0,sum1=0;
    for(int i=0;i<n;i++){	
      sum=sum+arr[i][i];
    }
  	for(int i=0;i<n;i++){
    	sum1=sum1+arr[i][n-1-i];
    }
    if(sum!=sum1){
    	return false;
    }
   for(int i=0;i<n;i++){
     	int rowsum=0;
   		for(int j=0;j<n;j++){
        	rowsum=rowsum+arr[i][j];
        }
     if(rowsum!=sum){
     	return false;
     }
   }
   for(int i=0;i<n;i++){
     	 int colsum=0;
   		 for(int j=0;j<n;j++){
        	 colsum=colsum+arr[j][i];
         }
      if(colsum!=sum){
     	 return false;
      }
    }
  return true;
}

int main()
{
  //Type your code here.
  int num;
  cin>>num;
  int a[5][5];
  for(int i=0;i<num;i++){
    for(int j=0;j<num;j++){
  		cin>>a[i][j];
    }
  }
  if(ismagicsquare(a,num)){
  	cout<<"Yes";
  }
  else{
  	cout<<"No";
  } 
}