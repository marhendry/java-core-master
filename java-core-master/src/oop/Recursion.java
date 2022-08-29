package oop;

public class Recursion {
    public int result;
    static int factorial(int n) {
        int result;
        if (n < 2) {
            return 1;
        }
        result = factorial(n - 1);
        result *= n;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Факториал 3: " + factorial(6));
        //System.out.println("Факториал 4: " + factorial(4));
        //System.out.println("Факториал 5: " + factorial(5));
    }
}
