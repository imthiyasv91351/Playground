#include<iostream>
using namespace std;
int fun(int a,int b){
	int sum=1,i;
    for(i=1;i<=b;i++){
    	sum=sum*a;
    }
  return sum;
}

int main(){
	int m,n,req,a;
  	cin>>m>>n>>req;
    a=fun(m,n);
  	if(a>=req){
    	cout<<"Doctor, you can proceed with your experiment.";
    }
  	else{
    	cout<<"Sorry Doctor! You need more bacteria.";
    }
}