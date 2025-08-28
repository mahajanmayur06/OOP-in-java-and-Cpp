#include <iostream>
using namespace std;

class Complex {
private:
    int real;
    int imag;

public:
    // Constructor
    Complex(int r = 0, int i = 0) {
        real = r;
        imag = i;
    }

    // Operator overloading for '+'
    Complex operator+(const Complex& other) {
        return Complex(real + other.real, imag + other.imag);
    }

    Complex operator*(const Complex& other) {
        return Complex((real * other.real - imag * other.imag), (real * other.imag + imag * other.real));
    }

    // Utility to print the complex number
    void display() {
        cout << real << " + " << imag << "i" << endl;
    }
};

int main() {
    Complex c1(1, 2);
    Complex c2(3, 4);
    Complex c3 = c1 + c2;  // '+' works because we overloaded it -> it is called as c1.operator+(c2)

    c3.display();  // Output: 4 + 6i

    Complex c4 = c1 * c3;
    c4.display();
    return 0;
}
