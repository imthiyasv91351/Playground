#include <iostream>
#include <cmath>
using namespace std;
int main()
{
  int n,i=1;
  float sum=1;
  cin>>n;
  float r=1/sqrt(n);
  while(i<=n){
    sum=sum+r;
    i++;
  }
  int days = n + sum;
  cout<<days;
}
