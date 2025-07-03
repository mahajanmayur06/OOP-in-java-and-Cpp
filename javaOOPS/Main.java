package javaOOPS;

class Car {
    // Instance variables
    String color;
    int speed;

    // Constructor
    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    // Method to display car info
    void displayInfo() {
        System.out.println("Color: " + color + ", Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        // reference variables representing objects, with instance variables
        Car car1 = new Car("Red", 100);
        Car car2 = new Car("Blue", 120);

        car1.displayInfo();
        car2.displayInfo();
    }
}
