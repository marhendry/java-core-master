package algoritms;

import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Fibonacci2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n>0 & n<=40) {
            System.out.println(fibonacci(n));}
        else {System.out.println("Вы ввели неверное число");
        }
    }

    private static int fibonacci(int x) {
        int first = 0;
        int second = 1;
        int result = x;
        for (int i = 1; i < x; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}
