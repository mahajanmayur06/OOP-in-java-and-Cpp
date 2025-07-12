// package javaOOPS.Polymorphism;

// Same name but different parameters (number, type, or order) is called method overloading.
// this is compile time or static, on java determines which method to call at compile time based on the method signature, same thing for constructors.
// which method to call is determined at compile time
// Auto casting is done here
public class MethodOverloading {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println("Sum of two integers: " + obj.add(5, 10));
        System.out.println("Sum of two doubles: " + obj.add(5.5, 10.5));
        System.out.println("Sum of three integers: " + obj.add(5, 10, 15));
    }
}
