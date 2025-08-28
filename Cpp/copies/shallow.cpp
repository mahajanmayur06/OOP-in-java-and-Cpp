#include <iostream>
using namespace std;

class Dummy {
public:
    string* str;

    Dummy(const string& s) {
        str = new string(s);
        cout << "Constructor called for: " << *str << endl;
    }

    // Shallow copy constructor
    Dummy(const Dummy& other) {
        str = other.str;  // Shallow copy: both objects share the same string
        cout << "Shallow Copy constructor called for: " << *str << endl;
    }

    // ~Dummy() {
    //     // Be careful: don't delete str here or you'll get double delete in shallow copy!
    //     cout << "Destructor called for: " << *str << endl;
    // }
};

int main() {
    Dummy d1("Object 1");
    Dummy d2 = d1;  // Shallow copy

    cout << *d1.str << " : " << *d2.str << endl;
    *d2.str = "Modified";  // Changes both d1 and d2!

    cout << *d1.str << " : " << *d2.str << endl;

    return 0;
}
