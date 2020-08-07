#include<iostream>
using namespace std;
int gcf(int a,int b,int c){
   	int smallest,gcd;
	if(a<b && a<c){
    	smallest=a;
    }
  	else if(b<c){
    	smallest=b;
    }
    else{
    	smallest=c;
    }
    int s=smallest;
    while(s>=1){
  		if(a%s==0 && b%s==0 && c%s==0){
    		gcd=s;
      		break;
    	}
    	s--;
  	}
  return gcd;
}
int main(){
	int n1,n2,n3,p;
  	cin>>n1>>n2>>n3>>p;
    int result=gcf(n1,n2,n3);
    if(p==result){
    	cout<<"Answer is correct.";
    }
  	else{
    	cout<<"Answer is wrong.";
    }
}
