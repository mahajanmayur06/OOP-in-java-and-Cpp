
public class Engineer extends AbstractClasses {

    // Engineer(int experience) {
    //     this.experience = experience;
    // }
    Engineer (int experience) {
        super(experience);
        // this.experience = experience; // This line is not needed as experience is set in
    }
    @Override
    void display() {
        System.out.println("Display method is in Engineer class");
    }

    @Override
    void show() {
        System.out.println("Engineer has experience of " + this.experience + " years");
    }


    void normal () {
        super.normal();
    }
}

