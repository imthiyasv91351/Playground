#include <iostream>
using namespace std;
int main()
{
	int maxw,wf;
  	cin>>wf;
 	cin>>maxw;
  	if(wf>maxw)
    {
    	cout<<"Yes, you can enter.";
    }
  	else if(maxw==wf)
    {
    	
      	cout<<"Yes, you can enter. Kindly use a rope.";
    }
  	else
    {
    	cout<<"Sorry, you can't enter";
    }
}