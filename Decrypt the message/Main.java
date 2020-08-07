#include <iostream>
using namespace std;
int main()
{
	int n,sum=0,div,i;
  	cin>>n;
  	int x;
    cin>>x;
    int s=x+n;
    for (i=1; i < s; i++)
    {
        div = s % i;
        if (div == 0)
            sum = sum + i;
    }
  	if(sum==s){
    	cout<<"They can read the message";
    }
  	else{
    	cout<<"They can't read the message";
    }
   

}