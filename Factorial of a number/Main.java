#include<iostream>
int main()
{
  int n,i;
  unsigned long long fact=1;
  std::cin>>n;
  for(i=1;i<=n;++i)
  {
    fact=fact*i;
  }
  std::cout<<fact;
}