// package introduction;
public class Basics {
    public static void main(String[] args) {
        // reference variables representing objects, with instance variables
        Car car1 = new Car();
        Car car2 = new Car("Blue", 120);

        car1.changeColor("Lemon");
        System.out.println(car1.color); 
        car1.displayInfoUsingThis();
        car2.displayInfoUsingThis(); // order of this matter, when display Info is called, it will change the values of color and speed to "Black" and 150, defined inside the method locally
        car1.displayInfo();
        car2.displayInfo();

        System.out.println("-------------------");
        User user = new User();
        user.display();

        User user1 = new User("John", 25);
        User user2 = user1;
        
        // user1.display();
        // user2.name = "Amitabh Doe";
        // user1.display();
        // user2.display();

        final User user3 = new User("Mango", 50);
        user3.age = 8000; // final does not mean the object is immutable, it means the reference cannot be changed
        user3.display();
        User user4 = user3;
        user4.name = "Apple";
        user4.display();
        user3.display();
    }
}

class Car {
    // Instance variables
    String color;
    int speed;
    
    Car () {
        color = "Green";
        speed = 100;
    }

    // Constructor
    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    // Method to display car info
    void displayInfo() {
        // color = "Black";
        // speed = 150;
        System.out.println("Color: " + color + ", Speed: " + speed + " km/h");
    }
    void displayInfoUsingThis() {
        System.out.println("Color: " + this.color + ", Speed: " + this.speed + " km/h");
    }
    void changeColor(String color) {
        this.color = color;
    }
}

class User {
    String name;
    int age;

    User () {
        this ("Bal Krishna", 10);
    }

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
} 