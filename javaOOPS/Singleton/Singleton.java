// package javaOOPS.Singleton;

public class Singleton {

    public String a;
    public Singleton() {
        a = "Singleton Instance";
    }
    private static Singleton instance = null;
    public static Singleton getInstance () {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public static void main (String [] args) {
        System.out.println(Singleton.getInstance().a);
    }
    
}
