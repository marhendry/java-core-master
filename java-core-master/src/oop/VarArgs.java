package oop;

public class VarArgs {
    static void test(int... array) {
        System.out.println("Количество аргументов: " + array.length);
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test();
        test(1);
        test(1, 2);
        test(new int[]{1, 3});
    }
}
