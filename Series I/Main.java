#include<iostream>

int main()

{

float start = 0.5;

int n=3;

std::cin >> n;

while(n-- != 0){

   std::cout<< start<<" ";

   start  *= 3;

}

}