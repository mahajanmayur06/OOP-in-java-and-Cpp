// package javaOOPS.Inheritence;

// private members of parent class are not inherited by child class, but protected members are inherited
// while using super, we can define private members of parent class in child class, as super is associated with the parent class and super is who calls the constructor of parent class

// it is the Type of reference that matters, not the object type
// if we create a reference of parent class and assign it to the object of child class, then we can only access the members of parent class, not the members of child class, thats because object is of parent class, how constructor of child class is called then?, parent class dont have any idea of child members

// super points to directly above class

// Order of execution of constructor is from parent class to child class, first parent class constructor is called, then child class constructor is called

public class ChildClass extends ParentClass {
    public ChildClass() {
        super();
    }
    String schoolName;

    public ChildClass(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public void getAge (){
        System.out.println("Age: " + super.age);
    }

    public static void main(String[] args) {
        ChildClass ch = new ChildClass("Naman", 20, "Tech Yatra School");
        ch.display(); // calls parent class display method
        ch.getAge(); // calls child class getAge method
        // System.out.println()

        ParentClass parent = new ChildClass("Arshdeep", 25, "Tech Yatra School");
        parent.display(); // calls parent class display method, but object is of child class, so it will call child class constructor

        // ChildClass child = new ParentClass() // This line will cause a compile-time error because you cannot assign a parent class object to a child class reference
    }
}
