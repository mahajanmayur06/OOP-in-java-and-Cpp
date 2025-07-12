// package Interface;

// abstract method using abstract keyword
// cannot create an object of abstract class

// cannot create abstract static method in abstract class, as static methods are not inherited by child classes, so it will not be useful to create static method in abstract class
public class AbstractEx {
    public static void main(String[] args) {
        Child child = new Child(10);
        child.giveMeName();
        child.display();

        Child2 child2 = new Child2(20);
        child2.giveMeName();
        child2.display();

        Parent parent = new Child(30);
        parent.giveMeName(); // Calls Child's implementation
        parent.display(); // Calls Child's implementation
    }
}

abstract class Parent {
    abstract void giveMeName(); // abstract method, no body
    abstract void display();
    int age;

    public Parent(int age) {
        this.age = age;
    }

    public static void normal() {
        System.out.println("Whoo r youuu");
    }
}

class Child extends Parent {
    Child(int age) {
        // this.age = age;
        super(age);
    }
    void display() { // implementation of abstract method
        System.out.println("Display method in Child class");
    }
    void giveMeName() { // implementation of abstract method
        System.out.println("Name from Child class");
    }
}

class Child2 extends Parent {
    Child2(int age) {
        // this.age = age;
        super(age);
    }
    void giveMeName() { // implementation of abstract method
        System.out.println("Name from Child2 class");
    }
    void display() { // implementation of abstract method
        System.out.println("Display method in Child2 class");
    }
}