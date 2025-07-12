// package Object;

public class ObjectClass {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child instanceof Parent); // true, because Child is a subclass of Parent
        System.out.println(child instanceof Child); // true, because child is an instance of Child

        Parent p = new Child();
        System.out.println(p instanceof Parent); // true, because p is a reference of type Parent pointing to an instance of Child
        System.out.println(p instanceof Child); // true, because p is actually an instance of Child

        // Child c = new Parent();
        // System.out.println(c instanceof Parent); // false, because c is a reference of type Child pointing to an instance of Parent
        // System.out.println(c instanceof Child); // false, because c is not an instance of Child
    }
}

class Parent {
    int a = 10;

    public void print() {
        System.out.println("Parent class print method");
    }
}

class Child extends Parent {
    int a = 20;

    @Override
    public void print() {
        System.out.println("Child class print method");
    }

    public void display() {
        System.out.println("Child class display method");
    }
}