#include <iostream>
using namespace std;

class AnotherClass {
public:
    mutable int a = 1000;
    int b = 2000;

    AnotherClass (int a, int b) {
        this->a = a;
        this->b = b;
    }
    void display () const {
        cout << a << " " << b << endl;
    }
};

int main () {
    AnotherClass a1 (90, 25);
    AnotherClass a2 = a1;
    const AnotherClass ac (400, 900);
    ac.a = 80000;
    ac.display();
    a2.a = 900000; // making function as const will not give error
    a2.b = -100;
    a1.display();
    a2.display(); // This defination in java will result like below defination of objects
    // AnotherClass a1 (90, 25);
    // AnotherClass *a2 = &a1;
    // a2->a = 900000;
    // a2->b = -100;
    // a1.display();
    // a2->display();
    return 0;
}
