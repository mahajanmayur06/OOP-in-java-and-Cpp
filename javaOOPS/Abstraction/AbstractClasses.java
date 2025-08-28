// package Abstraction;

// abstract constructors are not allowed
// abstract classes cannot be instantiated directly
// abstract static methods have no sense upon creating them

public abstract class AbstractClasses {
    int experience;

    static String university = "Tech Yatra";

    AbstractClasses(int experience) {
        this.experience = experience;
    }

    static int getExperience() {
        return 0;
    }

    static String getUniversity() {
        return university;
    }

    void normal () {
        System.out.println("This is a normal method in an abstract class");
    }

    abstract void display();
    abstract void show();
}

