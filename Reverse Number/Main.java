#include <iostream>
int main()
{
  int n,r=0,o=0,rem;
  std::cin>>n;
  o=n;
  while(n!=0)
  {
    rem=n%10;
    r=r*10+rem;
    n/=10;
  }
  std::cout<<r;
}
		

      
