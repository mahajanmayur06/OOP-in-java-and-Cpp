// There are two types of polymorphism in Java: compile/static-time polymorphism (method overloading) and runtime polymorphism (method overriding).
public class Main {
    public static void main(String[] args) {
        Base base = new Base();
        base.display(5.0, 10.0); // Calls the first method
        base.display(5, 10.0); // Calls the second method
    }
}

class Base {
    void display(double a, double b) {
        System.out.println("Base class display method with two double parameters: " + a + ", " + b);
    }
    void display(int a, double b) {
        System.out.println("Base class display method with int and double parameters: " + a + ", " + b);
    }
}