#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int flipa,flipd,flips;
  int snapa,snapd,snaps;
  int ama,amd,ams;
  cin>>flipa>>flipd>>flips;
  cin>>snapa>>snapd>>snaps;
  cin>>ama>>amd>>ams;
  int p1,p2,p3;
  p1=flipa+flips-(float(flipa)*(float(flipd)/100));
  cout<<"In Flipkart Rs."<<p1;
  p2=snapa+snaps-(float(snapa)*(float(snapd)/100));
  cout<<"\nIn Snapdeal Rs."<<p2;
  p3=ama+ams-(float(ama)*(float(amd)/100));
  cout<<"\nIn Amazon Rs."<<p3;
  
  if (p1 <= p2)
    {
        if (p1 <= p3)
            cout << "\nHe will prefer Flipkart";
        else
            cout << "\nHe will prefer Amazon";
    }
    else
    {
        if (p2 <= p3)
            cout << "\nHe will prefer Snapdeal" ;
        else
            cout << "\nHe will prefer Amazon" ;
    }
  }
 