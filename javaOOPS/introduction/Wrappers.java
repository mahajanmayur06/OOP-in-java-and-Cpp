package introduction;
public class Wrappers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(a, b); 
        System.out.println("After swap: a = " + a + ", b = " + b);
        
    }
    public static void swap (int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
