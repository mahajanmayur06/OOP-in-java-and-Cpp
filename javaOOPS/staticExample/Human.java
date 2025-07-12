// package staticExample;

public class Human {

    public String name;
    public int age;
    public static int population = 0;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        Human.population++;
    }

    public String toString() {
        return name;
    }
    public static void main(String[] args) {
        Human h = new Human("Sarkari", 90);
        System.out.println(h.toString());
    }
}
