#include <iostream>

#include <bits/stdc++.h> 

using namespace std; 

int main()

{ 

int a1=3,b1=4,a2,b2; 

int dou,pwr1,pwr2,pwr;
float square;

std::cin>>a2>>b2;

pwr1=pow((a2-a1),2);

pwr2=pow((b2-b1),2); 

pwr=pwr1+pwr2;

square=sqrt(pwr);

std::cout<<int(square);

return 0;

}
