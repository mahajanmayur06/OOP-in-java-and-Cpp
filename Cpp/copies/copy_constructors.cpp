#include <bits/stdc++.h>
using namespace std;

class Dummy {
public:
    string str;
public: 
    Dummy(const string& s) : str(s) {
        cout << "Constructor called for: " << str << endl;
    }

    Dummy(const Dummy& other) : str(other.str) {
        cout << "Copy constructor called for: " << str << endl;
    }

    // ~Dummy() {
    //     cout << "Destructor called for: " << str << endl;
    // }
};

int main() {
    Dummy d1("Object 1");
    Dummy d2 = d1; // Copy constructor will be called here
    Dummy d3(d1); // Copy constructor will be called here as well

    // these calling creates deep copy
    cout << d1.str << ":" << d2.str << ":" << d3.str << endl;
    d2.str = "Modified Object 1"; // Modify d1's string
    cout << d1.str << ":" << d2.str << ":" << d3.str << endl;
    d3.str = "Modified Object 3"; // Modify d3's string
    cout << d1.str << ":" << d2.str << ":" << d3.str << endl;
    return 0;
}