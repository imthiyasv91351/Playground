#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,x,y,sell,spent,profit;
  std::cin>>w;
  std::cin>>x;
  std::cin>>y;
  sell = w*x;
  spent = (w*y)+100;
  profit = sell-spent;
  std::cout<<profit;
}