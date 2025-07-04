#include <iostream>
using namespace std;

// Define a class named Car
class Car {
    string color;
    int speed;

public:
    // Constructor
    Car(string c, int s) {
        color = c;
        speed = s;
    }

    // Method to display car info
    void displayInfo() {
        cout << "Color: " << color << ", Speed: " << speed << " km/h" << endl;
    }
};

int main() {
    Car car1("Red", 100);
    Car car2("Blue", 100);

    car1.displayInfo();
    car2.displayInfo();

    return 0;
}
