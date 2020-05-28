#include<iostream>
int main()
{
    int r,x,d;
    std::cin>>r;
    std::cin>>x;
    d=(2*r);
    if(d==x)
    {
        std::cout<<"circle can be inside a square";
    }
    else
    {
        std::cout<<"circle cannot be inside a square";
        }
}