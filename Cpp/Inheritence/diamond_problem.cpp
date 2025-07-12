#include <bits/stdc++.h>
using namespace std;

// Below is the diamond problem, raising ambuguity to select which A

// class A {
// public:
//     void sayHello() { cout << "Hello from A\n"; }
// };

// class B : public A {};
// class C : public B {};
// class D : public B, public C {}; // Ambiguity: which A?

// int main() {
//     D obj;
//     obj.sayHello(); // Error: Ambiguity
// }

class A {
public:
    A () {
        cout << "Calling A" << endl;
    }
    void sayHello() { cout << "Hello from A\n"; }
};

class B : virtual public A {
public:
    B () {
        cout << "Calling B" << endl;
    }
};
class C : virtual public A {
public:
    C () {
        cout << "Calling C" << endl;
    }
};
class D : public B, public C {
public:
    D () {
        cout << "Calling D" << endl;
    }
};

int main() {
    D  obj;
    obj.sayHello(); // No ambiguity
}
