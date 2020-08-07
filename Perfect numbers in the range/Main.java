#include <iostream>
using namespace std;
int main()
{
  	int div,i,n;
	int mn,mx;
  	cin>>mn>>mx;
    for(n=mn;n<=mx;n++){
        int sum=0;
    	for (i=1; i < n; i++){             
        	div = n % i;
        	if (div == 0){
            	sum = sum + i;
            }  		
    	}
      	if(sum==n){
    		cout<<n<<" ";
    	  }
    }
}