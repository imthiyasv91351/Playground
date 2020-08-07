#include <iostream>
int main()
{
	int a,b;
  	std::cin >> a ;
    std::cin >> b ;
  	int sum = a+b;
  	int minus = a-b;
  	int mul = a*b;
  	int div = a/b;
  	int mod = a%b;
  	std::cout << "a+b=" << sum;
  	std::cout << "\na-b=" << minus;
  	std::cout << "\na*b=" << mul;
  	std::cout << "\na/b=" << div;
    std::cout << "\na%b=" << mod;
}

  

