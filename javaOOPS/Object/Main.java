public class Main {
    public static void main(String[] args) {

        Example e = new Example(900, 2);
        System.out.println(e.x + e.y);
    }
}

class Example {
    public int x = 200;
    public int y = 1900;

    Example (int x, int y) {
        this.x = x;
        this.y = 80;
    }
}