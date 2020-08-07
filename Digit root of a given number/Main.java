#include<iostream>
using namespace std;
int sumdigit(int x){
	    int s=0;
    	while(x>0){
        	int digit=x%10;
          	s=s+digit;
          	x=x/10;
        }
  		return s;
}

int digitsum(int n){
    int sum = sumdigit(n);
  	if(sum<10){
    	return sum;
    }
    else{
    	while(sum>9){
        	return sumdigit(sum);
        }
    }
} 


int main(){
	int num;
  	cin>>num;
  	int result = digitsum(num);
  	cout<<result;
}