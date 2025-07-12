#include <bits/stdc++.h>
using namespace std;

class A {
public:
    void show() { cout << "Class A\n"; }
};

class B {
public:
    void display() { cout << "Class B\n"; }
};

class C : public A, public B {};

int main() {
    C obj;
    obj.show();     // from A
    obj.display();  // from B
}
