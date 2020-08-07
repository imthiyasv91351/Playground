#include <iostream>
#include <math.h>
#include <vector>
using namespace std;

int main() 
{
   // Try out your code here
    int n;
  	cin>>n;
  	vector<int> f ;
  	for(int i=1;i<=sqrt(n);i++){
    	if(n%i==0){
        	cout<<i<<" ";
          	if((n/i) != i){
        		f.push_back(n/i);
        	}
        }    	
    }
    for(int i=f.size()-1;i>=0;i--){
            cout<<f[i]<<" ";
      		f.pop_back();
        }
}