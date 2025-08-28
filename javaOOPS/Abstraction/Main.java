
// abstract classes dont allow instantiation

public class Main {
    public static void main(String[] args) {
        Engineer engineer = new Engineer(12);
        Doctor doctor = new Doctor(10);

        engineer.display();
        doctor.display();


        System.out.println(Doctor.university);
        System.out.println(Doctor.getExperience());
        System.out.println(Engineer.getUniversity());
        Doctor.university = "Oxford";
        System.out.println(Engineer.getUniversity());


        AbstractClasses ab = new Engineer(34);
        ab.display();
        System.out.println(ab.getExperience());
        engineer.show();
    }
}
