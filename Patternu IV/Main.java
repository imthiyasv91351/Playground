#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n,i,j;
  cin>>n;
  for(i=1;i<=n;i++){
    if(i%2!=0){
    	for(j=1;j<=n;j++){
          	
          	if(j==n){
            	cout<<i+1;
            }
            else{
            	cout<<i;
            }
          }
          cout<<endl;
    }
     else if(i%2==0){
         for(j=1;j<=n;j++){
          	if(j==1){
            	cout<<i+1;
            }
            else{
            	cout<<i;
            }
          }
          cout<<endl;
        }
  }
}
   