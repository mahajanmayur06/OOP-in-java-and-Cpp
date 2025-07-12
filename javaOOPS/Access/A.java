import java.util.ArrayList;

// package Access;

public class A {
    private int a = 10;
    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> getList () {
        return list;
    }

    public void addElement () {
        list.add(a);
    }

    public void setA (int b) {
        if (b > 0) {
            a = b;
        } else {
            System.out.println("Value must be positive");
        }
    }
}
