#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int arr[10][10];
  int at[10][10];
  for(int i=0;i<m;i++){
  	for(int j=0;j<n;j++){
    	cin>>arr[i][j];
    }
  }
  for(int i=0;i<m;i++){
  	for(int j=0;j<n;j++){
    	at[j][i]=arr[i][j];
    }
  }
  for(int i=0;i<n;i++){
      int max=0;
  	for(int j=0;j<m;j++){
  	    if(at[i][j]>max){
  	            max=at[i][j];
  	        }
    }
    cout<<max<<"\n";
  }
}