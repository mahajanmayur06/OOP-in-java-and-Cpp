public class Main {
    {
        System.out.println("This is the main class initializer block");
    }
    Main () {
        this(16);
        System.out.println("This is the main class constructor");
    }

    Main (int a) {
        this(20, "Java");
        System.out.println("This is the main class constructor with parameter: " + a);
    }

    Main (int a, String b) {
        // this();
        System.out.println("This is the main class constructor with parameters: " + a + " and " + b);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        
    }
}