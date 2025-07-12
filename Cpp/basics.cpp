#include <iostream>
using namespace std;

// Define a class named Car
class Car {
    string color;
    int speed;

public:
    // Constructor
    Car() : Car ("Lemon", 190){
        
    }

    Car (string str, int sp) {
        color = str;
        speed = sp;
    }

    void changeColor (string color) {
        this->color = color;
    }
    // Method to display car info
    void displayInfo() {
        // color = "Black";
        // speed = 1000;
        cout << "Color: " << color << ", Speed: " << speed << " km/h" << endl;
    }
    void displayInfoUsingThis() {
        cout << "Color: " << this->color << ", Speed: " << this->speed << " km/h" << endl;
    }
    
};

int main() {
    Car car2;
    Car car1("Red", 100);
    car1.changeColor("Orange");
    car1.displayInfoUsingThis();
    car1.displayInfo();
    car2.displayInfo();
    return 0;
}
