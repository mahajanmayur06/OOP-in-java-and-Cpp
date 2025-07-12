public class staticOverriding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); // Calls Parent's static method
        
        Child child = new Child();
        child.display(); // Calls Child's static method
        
        Parent parentRef = new Child();
        parentRef.display(); // Calls Parent's static method, not Child's, because static methods are not overridden, as they are dependent on the reference type, not the object type.
    }
}

class Parent {
    static void display() {
        System.out.println("Parent class static method");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child class static method");
    }
    // Note: Static methods are not overridden, they are hidden.
    // The method that gets called is determined by the reference type, not the object type.
    // So, even if we call Child's display method using parent reference, it will still call parent's display method.
}