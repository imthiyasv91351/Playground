#include <iostream>
#include <math.h>
using namespace std;

int main() 
{
   // Try out your code here
    int n,b,b1;
  	cin>>n;
  	b=10;
  	b1=(pow(n,2)+1)*10;
  	for(int i=n;i>0;i--){
    	for(int j=0 ; j<(n-i) ; j++){
        	cout<<"**";
        }
      	for(int k=i;k>0;k--){
        	cout<<b;
          	b=b+10;
        }
      	
      	for(int l=i;l>1;l--){
        	cout<<b1;
          	b1=b1+10;
        }
      	int last=b1/10;
      	cout<<last;
      	b1=b1-(i-1)*20;
      	cout<<endl;
    }
    return 0;
}