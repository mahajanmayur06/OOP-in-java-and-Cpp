// package javaOOPS.Inheritence;

public class ParentClass {
    private String name;
    int age;

    public ParentClass() {
        name = "Parent";
        age = 50;
    }

    public ParentClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ParentClass parent = new ParentClass("John", 40);
        parent.display();
    }
}
