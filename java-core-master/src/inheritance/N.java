package inheritance;

public class N extends M {
    public int k;

    public N(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    public void print() {
        System.out.println("Метод N k = " + k);
    }

    public void someMethod() {
        print();
    }
}
