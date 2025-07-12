// package staticExample;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Naman Ojha", 30);
        Human h2 = new Human("Arshdeep Singh", 25);
        
        System.out.println("Population: " + h1.population); // Output: Population: 2
        System.out.println(h2.population);
        System.out.println("Name of h1: " + h1.name); // Output: Name of h1: Naman Ojha
        System.out.println("Age of h2: " + h2.age); // Output: Age of h2: 25
        Human h3 = new Human("Rohit Sharma", 36);
        System.out.println("Population after adding h3: " + Human.population); // Output: Population after adding h3: 3
    }
    
}
