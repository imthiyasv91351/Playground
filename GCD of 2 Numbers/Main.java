#include<iostream>
using namespace std;
int gcd(int a,int b){
	if (b==0){
    	return a;
    }
  	else{
    	return gcd(b,a%b);
    }

}
int main()
{
  //Type your code here.
  int n1,n2;
  cin>>n1>>n2;
  int result = gcd(n1,n2);
  cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<result;
}