#include <iostream>
using namespace std;
int main()
{
	int yr;
  	cin>>yr;
  	if((yr%4==0) && (yr%100!=0))
	{
		cout<<"Vicky can celebrate his birthday.";
	}
	else if((yr%100==0) && (yr%400==0))
	{
		cout<<"Vicky can celebrate his birthday.";
	}
	else if(yr%400==0)
	{
		cout<<"This is a Leap Year";
	}
	else
	{
		cout<<"Vicky can't celebrate.";
    }
  
}