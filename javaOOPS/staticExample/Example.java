// package staticExample;

public class Example {
    static int a = 5;
    static int b = 10;

    static class Test {
        int a = 10;
    }

    static {
        System.out.println("Static block executed");
        System.out.println("a: " + a);
        b = 50 * a;
        System.out.println("b: " + b);
    }
    public static void main(String[] args) {
        Example example = new Example();
        System.out.println("a: " + Example.a);
        System.out.println("b: " + Example.b);

        Example.b = 70;
        Example example1 = new Example();
        System.out.println("a: " + Example.a);
        System.out.println("b: " + Example.b);
    }
}
