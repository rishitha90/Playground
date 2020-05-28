#include<iostream>
using namespace std;
int Fibonacci(int n)
{
    if (n <= 1) 
        return n; 
    return Fibonacci(n - 1) + Fibonacci(n - 2); 
}
int main()
{
    int n,m;
    
    cin >> n;
    m= Fibonacci(n - 1);
    cout << "The term "<<n<<" ""in the fibonacci series is " <<m;
   
}