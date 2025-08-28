// package Abstraction;

public class Doctor extends AbstractClasses {

    // Doctor(int experience) {
    //     this.experience = experience;
    // }
    Doctor (int experience) {
        super(experience);
    }
    @Override
    void display() {
        System.out.println("Display method is in Doctor class");
    }

    @Override
    void show() {
        System.out.println("Doctor has experience of " + this.experience + " years");
    }
}