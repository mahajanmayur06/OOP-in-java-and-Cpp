#include <bits/stdc++.h>
using namespace std;

class Base {
public:
    int a = 15;
    int b = 50;

    void function (double a, double b) {
        cout << "Calling with double a";
    }
    void function (int a, double b) {
        cout << "Calling with integer a and double b";
    }
};

int main() {
    Base b;
    int a = 10, y = 20;
    b.function(a, y);
    return 0;
}