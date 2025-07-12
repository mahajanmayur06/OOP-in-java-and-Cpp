// package javaOOPS.Polymorphism;

// Same methods but different implementation is called method overriding.
// This is runtime or dynamic, Java determines which method to call at runtime based on the object type, not the reference type.

// Overriddern methods are in late binding
// where are final methods are in early binding
// Method overriding is used to provide specific implementation of a method that is already defined in its superclass
public class MethodOverrinding {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Shapes shape = new Shapes();

        circle.draw();
        square.draw();
        shape.draw();

        circle.area(); // Output: "Calculating area of circle"

        Circle.area(); // Static method, called on class
        Square.area(); // Static method, called on class
        Shapes.area(); // Static method, called on class

        Shapes shape1 = new Circle(); // Upcasting
        shape1.draw(); // Calls Circle's draw method due to overriding
        shape1.area(); // Calls Shapes' area method, not Circle's, because static methods are not overridden
    }
}

class Shapes {
    void draw() {
        System.out.println("Drawing a shape");
    }
    static void area() {
        System.out.println("Calculating area of shape");
    }
}

class Circle extends Shapes {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
    static void area() {
        System.out.println("Calculating area of circle");
    }
}

class Square extends Shapes {
    void draw() {
        System.out.println("Drawing a square");
    }
    static void area () {
        System.out.println("Calculating area of square");
    }
}

// Abstraction focus on external behavior of the object, while encapsulation focus on internal implementation of the object
// Encapsulation is the process of hiding the internal state and behavior of an object and only exposing a controlled interface to the outside world. It is achieved by using access modifiers (private, protected, public) to restrict access to the object's data and methods.    
// Abstraction is about gaining the information while, encapsulation is about containing the information.
// Data hiding is focused on data security , while encapsulation is focused on hiding complexity (sub process of data hiding).

// Array implementation is data hiding, getting and setting values is encapsulation