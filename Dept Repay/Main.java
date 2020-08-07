#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int principal_amount;
  int rate_of_interest;
  int number_of_years;
  std::cin>>principal_amount;
  std::cin>>rate_of_interest;
  std::cin>>number_of_years;
  float x;
  x=(principal_amount*rate_of_interest*number_of_years)/100;
  float y=x+principal_amount;
  float discount=0.02*x;
  float final_settlement=y-discount;
  std::cout<<x;
  std::cout<<"\n"<<y;
  std::cout<<"\n"<<discount;
  std::cout<<"\n"<<final_settlement;
  
}