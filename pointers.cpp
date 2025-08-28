#include <bits/stdc++.h>
using namespace std;

void swap (int* x, int* y) {
    int t = *x;
    *x = *y;
    *y = t;
}

int main() {
    int a = 90;
    int& x = a;
    a = 30;
    cout << x << endl;
    int *b = &x;
    *b = 9000;
    cout << *b << endl;
    cout << x << endl;
    cout << &a << " " << &b << " " << b;
    return 0;
}