// package Access;

public class AccessControl {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();

        Child2 c2 = new Child2();
        c2.display();

        ChildChild cc = new ChildChild();
        cc.display();

        Parent p = new ChildChild();
        p.display(); // Calls ChildChild's display method due to dynamic binding
    }
}

class Parent {
    protected void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {
    // @Override
    // public void display() {
    //     System.out.println("Child class display method");
    // }
}

class Child2 extends Parent {
    @Override
    public void display() {
        System.out.println("Child2 class display method");
    }
}

class ChildChild extends Child {
    // @Override
    // public void display() {
    //     System.out.println("ChildChild class display method");
    // }
}
