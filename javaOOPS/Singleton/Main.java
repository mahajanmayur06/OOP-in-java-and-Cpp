// package javaOOPS.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1.a);
        
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2.a);

        instance1.a = "What is your problem, I am not going to change for anyone";
        System.out.println(instance2.a);

        Singleton instance3 = Singleton.getInstance();
        System.out.println(instance3.a);
    }
}
