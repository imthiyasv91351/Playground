#include<iostream>
using namespace std;
int InsertAtpos(int num,int arr[],int x,int pos )
{
	int i;
  	num++;
  	for(i=num+1;i>pos-1;i--){
    	arr[i]=arr[i-1];
    }
  	arr[pos-1]=x;
  	return arr[num];
}
int main()
{
  //Type your code here.
  int n,i;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  cout<<"\nEnter the elements in the array";
  int a[20];
  for(i=0;i<n;i++){
  	cin>>a[i];
  }
  int loc;
  cout<<"\nEnter the location where you wish to insert an element";
  cin>>loc;
  if(loc<=n){
  	int value;
  	cout<<"\nEnter the value to insert";
  	cin>>value;
  	InsertAtpos(n,a,value,loc);
  	cout<<"\nArray after insertion is\n";
  	for(i=0;i<n+1;i++){
  		cout<<a[i]<<"\n";
  	}
  	}
  	else{
  		cout<<"\nInvalid Input";
  	}
  
}